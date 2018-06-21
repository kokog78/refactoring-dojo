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

	public void printAllPlayersResult() {
		printHeader();
		System.out.println("Player 1 Result is " + player1Results + " points.");
		System.out.println("Player 2 Result is " + player2Results + " points.");
		System.out.println("Player 3 Result is " + player3Results + " points.");
	}
	
	private void printHeader() {
		System.out.println("Game Results");
		System.out.println("------------");
	}
	
}
