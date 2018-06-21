package dojo.extract_method;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class PlayerResultsTest {

	@Test
	public void getAllPlayersResult_should_collect_player_results() {
		PlayerResults results = new PlayerResults(100, 200, 300);
		assertThat(results.getAllPlayersResult())
			.contains("Player 1 has 100 points.")
			.contains("Player 2 has 200 points.")
			.contains("Player 3 has 300 points.");
	}
}
