package dojo.extract_method;

public class PlayerResults {
	
	private int player1Results;
	private int player2Results;
	private int player3Results;
	
	public PlayerResults(int player1Results, int player2Results, int player3Results) {
		this.player1Results = player1Results;
		this.player2Results = player2Results;
		this.player3Results = player3Results;
	}

	public String getAllPlayersResult() {
		StringBuilder builder = new StringBuilder();
		printHeader(builder);
		builder.append("Player 1 has " + player1Results + " points.\n");
		builder.append("Player 2 has " + player2Results + " points.\n");
		builder.append("Player 3 has " + player3Results + " points.\n");
		return builder.toString();
	}
	
	private void printHeader(StringBuilder builder) {
		builder.append("Game Results\n");
		builder.append("------------\n");
	}
	
}
