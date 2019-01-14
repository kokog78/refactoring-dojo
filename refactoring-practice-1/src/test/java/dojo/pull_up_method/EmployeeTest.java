package dojo.pull_up_method;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class EmployeeTest {

	@Test @org.junit.Test
	public void getDescription_should_return_description() {
		Tester tester = new Tester("Alice");
		Programmer programmer = new Programmer("Bob");
		assertThat(tester.getDescription()).isEqualTo("Tester: Alice");
		assertThat(programmer.getDescription()).isEqualTo("Programmer: Bob");
	}
	
}
