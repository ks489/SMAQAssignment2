import static org.junit.Assert.*;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.format.*;

import org.junit.Test;

public class TestTestCase {
	
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
	//Categories B, D, G, I, L, O
	//Full date parsed correct, nothing is missing or wrong
	@Test
	public void FullDateParseCorrectly() {
		CharSequence cs = "Tue, 3 Jun 2008 11:05:30 GMT";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
		assertNotNull(ta);
	}
	
	//4
	//Categories B, D, G, I, L, N
	//Full date parsed, year is greater than 9999
	@Test
	public void FullDateParseWrongYearException() {
		CharSequence cs = "Tue, 3 Jun 11000 11:05:30 GMT";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
		assertNotNull(ta);
	}
	
	//5
	//Categories B, D, G, I, L, M
	//Full date parsed, missing year
	@Test(expected = DateTimeParseException.class)
	public void FullDateParseMissingYearException() {
		CharSequence cs = "Tue, 3 Jun 11:05:30 GMT";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
	}
	
	//6
	//Categories B, D, G, I, K, O
	//Full date parsed, missing day of month space
	@Test(expected = DateTimeParseException.class)
	public void FullDateParseMissingDayOfMonthSpaceException() {
		CharSequence cs = "Tue, 3Jun 2008 11:05:30 GMT";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
	}
	
	//7
	//Categories B, E, G, I, K, O
	//Full date parsed, longer day of week
	@Test(expected = DateTimeParseException.class)
	public void FullDateParseFullDayOfWeekException() {
		CharSequence cs = "Tuesday, 3 Jun 2008 11:05:30 GMT";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
	}
	
	//8
	//Categories B, C, G, I, K, O
	//Full date parsed, missing day of week but has comma and space
	@Test(expected = DateTimeParseException.class)
	public void FullDateParseMissingDayOfWeekException() {
		CharSequence cs = ", 3 Jun 2008 11:05:30 GMT";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
		assertNotNull(ta);
	}
	
	//9
	//Categories B, C, F, I, K, O
	//Full date parsed, missing day of week space
	@Test(expected = DateTimeParseException.class)
	public void FullDateParseMissingDayOfWeekSpaceException() {
		CharSequence cs = "Tue3 Jun 2008 11:05:30 GMT";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
	}
	
	//10
	//Categories B, C, G, I, K, O
	//Full date parsed, missing day of month
	@Test(expected = DateTimeParseException.class)
	public void FullDateParseMissingDayOfMonthException() {
		CharSequence cs = "Tue, Jun 2008 11:05:30 GMT";
		TemporalAccessor ta = DateTimeFormatter.RFC_1123_DATE_TIME.parse(cs);
	}	
}
