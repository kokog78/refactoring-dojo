package dojo.replace_array_with_object;

import java.util.ArrayList;
import java.util.List;

public class PerformanceManager {

	/*
	 * String tömb helyett csináljunk egy külön Performance nevű osztályt!
	 */
	private final List<String[]> performances = new ArrayList<>();
	
	public void registerWins(String name, int wins) {
		performances.add(new String[] {
				name,
				Integer.toString(wins)
		});
	}
	
	public int getWinsOf(String name) {
		for (String[] performance : performances) {
			if (performance[0].equals(name)) {
				return Integer.parseInt(performance[1]);
			}
		}
		return 0;
	}
	
}
