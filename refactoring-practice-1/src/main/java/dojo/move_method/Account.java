package dojo.move_method;

public class Account {

	private final AccountType type;
	private int daysOverdrawn;
	
	public Account(AccountType type) {
		super();
		this.type = type;
	}
	
	public int getDaysOverdrawn() {
		return daysOverdrawn;
	}
	
	public void setDaysOverdrawn(int daysOverdrawn) {
		this.daysOverdrawn = daysOverdrawn;
	}

	/*
	 * Ezt a metódust helyezzük át az AccountType osztályba.
	 */
	double getOverdraftCharge() {
		if (type.isPremium()) {
			double result = 10.0;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) + 0.85;
			}
			return result;
		} else {
			return daysOverdrawn * 1.75;
		}
	}
	
	public double getBankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += getOverdraftCharge();
		}
		return result;
	}
}
