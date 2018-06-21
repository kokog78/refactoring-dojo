package dojo.decompose_conditional;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class ChargeCalculatorTest {

	@Test
	public void calculateChargeForMonth_should_calculate_charge_correctly() {
		ChargeCalculator calculator = new ChargeCalculator(10, 9, 20);
		assertThat(calculator.calculateChargeForMonth(0, 10)).isEqualTo(110.0);
		assertThat(calculator.calculateChargeForMonth(10, 10)).isEqualTo(110.0);
		assertThat(calculator.calculateChargeForMonth(6, 10)).isEqualTo(100.0);
	}
}
