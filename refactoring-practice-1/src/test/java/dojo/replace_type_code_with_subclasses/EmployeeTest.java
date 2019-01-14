package dojo.replace_type_code_with_subclasses;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class EmployeeTest {

	@Test @org.junit.Test
	public void getBaseSalary_should_return_the_correct_salary() {
		Employee engineer = new Employee(Employee.ENGINEER);
		Employee salesman = new Employee(Employee.SALESMAN);
		Employee manager = new Employee(Employee.MANAGER);
		
		assertThat(engineer.getBaseSalary()).isEqualTo(1000.0);
		assertThat(salesman.getBaseSalary()).isEqualTo(900.0);
		assertThat(manager.getBaseSalary()).isEqualTo(2000.0);
	}
}
