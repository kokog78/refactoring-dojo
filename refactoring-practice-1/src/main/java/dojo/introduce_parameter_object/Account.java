package dojo.introduce_parameter_object;

import java.util.Date;

public class Account {

	private final Entry[] entries;
	
	public Account(Entry ... entries) {
		this.entries = entries;
	}
	
	/*
	 * A két Date típusú paraméter helyett vezessünk be egy új kompozit paramétert dateRange típussal.
	 * Bónuszként a bonyolult kifejezést is átvihetjük az új osztályba.
	 */
	public double getFlowBetween(Date start, Date end) {
		double result = 0.0;
		for (Entry entry : entries) {
			if (entry.getChargeDate().equals(start) ||
				entry.getChargeDate().equals(end) ||
				(entry.getChargeDate().after(start) && entry.getChargeDate().before(end))) {
				result += entry.getValue();
			}
		}
		return result;
	}
}
