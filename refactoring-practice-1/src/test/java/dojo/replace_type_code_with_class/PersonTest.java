package dojo.replace_type_code_with_class;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class PersonTest {

	@Test @org.junit.Test
	public void getBloodGroup_should_return_the_blood_group_code() {
		Person person = new Person(Person.AB);
		assertThat(person.getBloodGroup()).isEqualTo(Person.AB);
	}
}
