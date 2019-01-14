package dojo.extract_subclass;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class JobItemTest {

	@Test @org.junit.Test
	public void getTotalPrice_should_calculate_price_correctly() {
		Employee john = new Employee(10.0);
		
		JobItem j1 = new JobItem(20.0, 10, john, false);
		assertThat(j1.getTotalPrice()).isEqualTo(200.0);
		
		JobItem j2 = new JobItem(20.0, 10, john, true);
		assertThat(j2.getTotalPrice()).isEqualTo(100.0);
	}
	
}
