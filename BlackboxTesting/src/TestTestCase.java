import static org.junit.Assert.*;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.format.*;

import org.junit.Test;

public class TestTestCase {

	@Test
	public void test() {
		CharSequence cs = "Tue, 3 Jun 2008 11:05:30 GMT";

		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
		fail("Not yet implemented");
		//Throws DateTimeParseExeption
	}
	//1
	//Category A
	//Completely Empty CharSequence
	@Test(expected = DateTimeParseException.class)
	public void ExceptDateTimeParseExceptionEmptyDate() {
		CharSequence cs = "";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
	}
	//2
	//Categories B, C, F, I, L, O
	//No Day of week present and no comma space
	@Test
	public void MissingDayOfWeekParseCorrectly() {
		CharSequence cs = "3 Jun 2008 11:05:30 GMT";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
		assertNotNull(ta);
	}
	//3
	@Test
	public void Third() {
		CharSequence cs = "Tue, 3 Jun 2008 11:05:30 GMT";

		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
		fail("Not yet implemented");
		//Throws DateTimeParseExeption
	}
	//3 - Tue, 3 Jun 2008 11:05:30 GMT
	//4 - Tue, 3 Jun 11000 11:05:30 GMT
	//5 - Tue, 3 Jun 11:05:30 GMT
	//6 - Tue, 3Jun 2008 11:05:30 GMT
	//7 - Tuesday, 3 Jun 2008 11:05:30 GMT
	//8 - , 3 Jun 2008 11:05:30 GMT
	//9 - Tue 3 Jun 2008 11:05:30 GMT
	//10 - Tue, Jun 2008 11:05:30 GMT
	
}
