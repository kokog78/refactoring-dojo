export class PlayerResults {

    public constructor(private player1Results: number, private player2Results: number, private player3Results: number) {
    }

    public getAllPlayersResult(): string {
        let builder = {
            text: ''
        };
        this.printHeader(builder);
        builder.text += "Player 1 has " + this.player1Results + " points.\n";
        builder.text += "Player 2 has " + this.player2Results + " points.\n";
        builder.text += "Player 3 has " + this.player3Results + " points.\n";
        return builder.text;
    }

    private printHeader(builder) {
        builder.text += "Game Results\n";
        builder.text += "------------\n";
    }

}
