package dojo.hide_delegate;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class PersonTest {

	@Test
	public void should_access_department_manager() {
		Person bob = new Person();
		Person john = new Person();
		Department department = new Department();
		department.setManager(bob);
		bob.setDepartment(department);
		john.setDepartment(department);
		
		Person manager = john.getDepartment().getManager();
		
		assertThat(manager).isEqualTo(bob);
	}
}
