import {PlayerResults} from "../../../main/typescript/extract_method/player-results.js";

describe("PlayerResults", () => {

    it('getAllPlayersResult_should_collect_player_results', () => {
        let results: PlayerResults = new PlayerResults(100, 200, 300);
        expect(results.getAllPlayersResult()).toContain("Player 1 has 100 points.")
        expect(results.getAllPlayersResult()).toContain("Player 2 has 200 points.")
        expect(results.getAllPlayersResult()).toContain("Player 3 has 300 points.");
    });
});