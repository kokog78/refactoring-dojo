package dojo.substitute_algorithm;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class PersonFinderTest {
	
	@Test @org.junit.Test
	public void foundPerson_should_find_person() {
		PersonFinder finder = new PersonFinder();
		assertThat(finder.foundPerson()).isNull();
		assertThat(finder.foundPerson("Bob")).isNull();
		assertThat(finder.foundPerson("Don")).isEqualTo("Don");
		assertThat(finder.foundPerson("John")).isEqualTo("John");
		assertThat(finder.foundPerson("Kent")).isEqualTo("Kent");
		assertThat(finder.foundPerson("Don", "John", "Kent")).isEqualTo("Don");
		assertThat(finder.foundPerson("Bob", "John", "Kent")).isEqualTo("John");
	}
	
}
