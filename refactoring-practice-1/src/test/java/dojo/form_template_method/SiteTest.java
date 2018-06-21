package dojo.form_template_method;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class SiteTest {

	@Test
	public void getBillableAmount_should_get_billable_amount_correctly() {
		ResidentalSite residentalSite = new ResidentalSite(3, 1000.0);
		LifelineSite lifelineSite = new LifelineSite(3, 1000.0);
		assertThat(residentalSite.getBillableAmount()).isEqualTo(3810.0);
		assertThat(lifelineSite.getBillableAmount()).isEqualTo(1986.0);
	}
}
