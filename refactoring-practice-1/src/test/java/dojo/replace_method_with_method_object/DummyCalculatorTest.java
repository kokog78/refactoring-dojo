package dojo.replace_method_with_method_object;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class DummyCalculatorTest {

	@Test @org.junit.Test
	public void computeGamma_should_compute_gamma_correctly() {
		DummyCalculator calculator = new DummyCalculator();
		assertThat(calculator.computeGamma(1, 2, 3)).isEqualTo(697);
		assertThat(calculator.computeGamma(1, 2, 3000)).isEqualTo(21536);
	}
	
}
