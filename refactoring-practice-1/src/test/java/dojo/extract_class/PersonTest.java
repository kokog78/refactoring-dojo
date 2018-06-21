package dojo.extract_class;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class PersonTest {

	@Test
	public void getOfficeTelephoneNumber_should_get_office_telephone_number() {
		Person person = new Person();
		person.setOfficeAreaCode("1");
		person.setOfficeNumber("654321");
		assertThat(person.getOfficeTelephoneNumber()).isEqualTo("(1) 654321");
	}
}
