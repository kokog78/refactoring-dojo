package dojo.extract_interface;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class ChargeCalculatorTest {

	@Test
	public void calculateCharge_should_calculate_charge_correctly() {
		ChargeCalculator calculator = new ChargeCalculator();
		Employee employee = new Employee();
		employee.setRate(20.0);

		employee.setSpecialSkilled(false);
		assertThat(calculator.calculateCharge(employee, 10)).isEqualTo(200.0);

		employee.setSpecialSkilled(true);
		assertThat(calculator.calculateCharge(employee, 10)).isEqualTo(210.0);
	}
}
