package dojo.decompose_conditional;

public class ChargeCalculator {

	private final int SUMMER_START_MONTH = 5;
	private final int SUMMER_END_MONTH = 7;
	
	private final double summerRate;
	private final double winterRate;
	private final double winterServiceCharge;
	
	public ChargeCalculator(double summerRate, double winterRate, double winterServiceCharge) {
		this.summerRate = summerRate;
		this.winterRate = winterRate;
		this.winterServiceCharge = winterServiceCharge;
	}
	
	// Mind a feltételt, mint az egyes esetek műveleteit tegyük ki külön privát metódusokba!
	public double calculateChargeForMonth(int month, int quantity) {
		double charge = 0.0;
		if (month < SUMMER_START_MONTH || month > SUMMER_END_MONTH) {
			charge = quantity * winterRate + winterServiceCharge;
		} else {
			charge = quantity * summerRate;
		}
		return charge;
	}
}
