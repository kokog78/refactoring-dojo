package dojo.replace_temp_with_query;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class DiscountCalculatorTest {

	@Test @org.junit.Test
	public void getPrice_calculates_price_correctly() {
		DiscountCalculator calculator1 = new DiscountCalculator(100, 9.0);
		assertThat(calculator1.getPrice()).isEqualTo(882.0);
		DiscountCalculator calculator2 = new DiscountCalculator(100, 11.0);
		assertThat(calculator2.getPrice()).isEqualTo(1045.0);
	}
}
