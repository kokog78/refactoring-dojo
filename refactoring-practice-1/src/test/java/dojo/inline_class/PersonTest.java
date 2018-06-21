package dojo.inline_class;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class PersonTest {

	@Test
	public void getOfficeTelephoneNumber_should_get_office_telephone_number() {
		Person person = new Person();
		person.getOfficePhone().setAreaCode("1");
		person.getOfficePhone().setNumber("654321");
		assertThat(person.getOfficePhone().getTelephoneNumber()).isEqualTo("(1) 654321");
	}
}
