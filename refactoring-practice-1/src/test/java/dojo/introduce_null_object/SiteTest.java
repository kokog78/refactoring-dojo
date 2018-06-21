package dojo.introduce_null_object;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class SiteTest {

	private Site site = new Site();
	
	@Test
	public void getCustomerName_should_return_right_customer_name() {
		site.setCustomer(new Customer("Bob", BillingPlan.PREMIUM));
		assertThat(site.getCustomerName()).isEqualTo("Bob");
		
		site.setCustomer(null);
		assertThat(site.getCustomerName()).isEqualTo("occupant");
	}
	
	@Test
	public void getCustomerName_should_return_right_billing_plan() {
		site.setCustomer(new Customer("Bob", BillingPlan.PREMIUM));
		assertThat(site.getBillingPlan()).isEqualTo(BillingPlan.PREMIUM);
		
		site.setCustomer(null);
		assertThat(site.getBillingPlan()).isEqualTo(BillingPlan.BASIC);
	}
	
	@Test
	public void getCustomerName_should_return_right_delinquent_weeks() {
		site.setCustomer(new Customer("Bob", BillingPlan.PREMIUM));
		assertThat(site.getWeeksDelinquent()).isEqualTo(1);
		
		site.setCustomer(null);
		assertThat(site.getWeeksDelinquent()).isEqualTo(0);
	}
}
