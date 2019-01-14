package dojo.introduce_parameter_object;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class AccountTest {

	@Test @org.junit.Test
	public void getFlowBetween_should_calculate_flow_value_correctly() {
		Account account = new Account(
				new Entry(date(1), 10.0),
				new Entry(date(2), 11.0),
				new Entry(date(3), 12.0),
				new Entry(date(4), 13.0),
				new Entry(date(5), 14.0)
		);
		assertThat(account.getFlowBetween(date(2), date(4))).isEqualTo(36.0);
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
