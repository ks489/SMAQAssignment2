import static org.junit.Assert.*;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

import org.junit.Test;

public class TestTestCase {

	@Test
	public void test() {
		CharSequence cs = "Tue, 3 Jun 2008 11:05:30 GMT";

		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
		fail("Not yet implemented");
		//Throws DateTimeParseExeption
	}
	
	@Test
	public void test1() {
		fail("Not yet implemented");
	}

}
