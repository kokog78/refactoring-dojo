package dojo.extract_subclass;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class JobItemTest {

	@Test @org.junit.Test
	public void getTotalPrice_should_calculate_price_for_normal_job() {
		JobItem job = new JobItem(20.0, 10, null, false);
		
		assertThat(job.getQuantity()).isEqualTo(10);
		assertThat(job.getEmployee()).isNull();
		assertThat(job.getTotalPrice()).isEqualTo(200.0);
	}
	
	@Test @org.junit.Test
	public void getTotalPrice_should_calculate_price_for_labor_job() {
		Employee john = new Employee(10.0);
		
		JobItem job = new JobItem(20.0, 11, john, true);
		
		assertThat(job.getQuantity()).isEqualTo(11);
		assertThat(job.getEmployee()).isNotNull();
		assertThat(job.getTotalPrice()).isEqualTo(110.0);
	}
	
	// ez a teszt az új struktúrában fölöslegessé válik
	@Test @org.junit.Test
	public void getTotalPrice_should_calculate_price_for_normal_job_with_employee() {
		Employee john = new Employee(10.0);
		
		JobItem job = new JobItem(20.0, 10, john, false);
		
		assertThat(job.getQuantity()).isEqualTo(10);
		assertThat(job.getEmployee()).isNotNull();
		assertThat(job.getTotalPrice()).isEqualTo(200.0);
	}
	
}
