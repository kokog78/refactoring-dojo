package dojo.replace_delegation_with_inheritance;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class EmployeeTest {

	@Test
	public void toString_should_return_last_name() {
		Person bob = new Person();
		Employee bobEmployee = new Employee(bob);
		bobEmployee.setName("Bob Somebody");
		assertThat(bobEmployee.getName()).isEqualTo("Bob Somebody");
		assertThat(bobEmployee.toString()).isEqualTo("Employee: Somebody");
	}
}
