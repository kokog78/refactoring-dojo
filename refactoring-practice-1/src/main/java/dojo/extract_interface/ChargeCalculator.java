package dojo.extract_interface;

public class ChargeCalculator {

	/*
	 * Az Employee osztályból csak két mezőt használ. Emeljük ki ezeket egy Billable interfészbe!
	 */
	public double calculateCharge(Employee employee, int days) {
		double base = employee.getRate() * days;
		if (employee.isSpecialSkilled()) {
			return base * 1.05;
		} else {
			return base;
		}
	}
	
}
