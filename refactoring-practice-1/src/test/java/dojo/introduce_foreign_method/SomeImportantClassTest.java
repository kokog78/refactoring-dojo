package dojo.introduce_foreign_method;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class SomeImportantClassTest {

	@Test @org.junit.Test
	public void getEndDate_should_return_next_day() {
		SomeImportantClass some = new SomeImportantClass(date(1));
		assertThat(some.getEndDate()).isEqualTo(date(2));
	}
	
	private Date date(int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2000);
		calendar.set(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.HOUR_OF_DAY, 10);
		calendar.set(Calendar.MINUTE, 10);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
}
