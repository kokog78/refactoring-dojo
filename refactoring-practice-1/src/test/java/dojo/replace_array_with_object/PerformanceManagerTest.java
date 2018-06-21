package dojo.replace_array_with_object;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class PerformanceManagerTest {

	@Test
	public void getPerformanceOf_should_return_number_of_wins() {
		PerformanceManager manager = new PerformanceManager();
		
		assertThat(manager.getWinsOf("Liverpool")).isEqualTo(0);
		
		manager.registerWins("Manchester", 10);
		manager.registerWins("Liverpool", 12);
		
		assertThat(manager.getWinsOf("Liverpool")).isEqualTo(12);
	}
	
}
