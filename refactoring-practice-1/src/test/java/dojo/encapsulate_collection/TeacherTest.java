package dojo.encapsulate_collection;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class TeacherTest {

	@Test
	public void should_find_advanced_courses() {
		Course java = new Course("Java Programming", false);
		Course advancedJava = new Course("Advanced Java Programming", true);
		
		Teacher bob = new Teacher();
		bob.getCourses().add(java);
		bob.getCourses().add(advancedJava);
		
		assertThat(bob.getCourses().size()).isEqualTo(2);
		
		assertThat(bob.getCourses())
			.filteredOn(course -> course.isAdvanced())
			.extracting(course -> course.getName())
			.containsExactly("Advanced Java Programming");
		
		bob.getCourses().remove(advancedJava);
		
		assertThat(bob.getCourses().size()).isEqualTo(1);
		
		assertThat(bob.getCourses())
			.filteredOn(course -> course.isAdvanced())
			.isEmpty();
	}
}
