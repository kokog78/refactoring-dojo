package dojo.move_method;

public enum AccountType {

	PREMIUM,
	SIMPLE;
	
	public boolean isPremium() {
		return this == AccountType.PREMIUM;
	}
	
}
