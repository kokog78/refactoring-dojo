package dojo.replace_parameter_with_method;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class PriceCalculatorTest {

	@Test @org.junit.Test
	public void getPrice_should_calculate_price_correctly() {
		PriceCalculator calculator1 = new PriceCalculator(90.0, 10);
		assertThat(calculator1.getPrice()).isEqualTo(90.0);

		PriceCalculator calculator2 = new PriceCalculator(90.0, 1000);
		assertThat(calculator2.getPrice()).isEqualTo(4500.0);
	}
}
