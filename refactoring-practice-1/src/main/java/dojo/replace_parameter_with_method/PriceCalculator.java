package dojo.replace_parameter_with_method;

public class PriceCalculator {

	private final double unitPrice;
	private final int quantity;
	
	public PriceCalculator(double unitPrice, int quantity) {
		super();
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		double basePrice = quantity * unitPrice;
		int discountLevel;
		if (quantity > 100) {
			discountLevel = 2;
		} else {
			discountLevel = 1;
		}
		double finalPrice = getDiscountedPrice(basePrice, discountLevel);
		return finalPrice;
	}
	
	/*
	 * Ebből a metódusból távolítsuk el mindkét paramétert úgy, hogy helyettesítjük
	 * őket egy getDiscountLevel és egy getBasePrice metódushívással!
	 * A refaktorálás végén ezt a metódust akár be is olvaszthatjuk a getPrice metódusba.
	 */
	private double getDiscountedPrice(double basePrice, int discountLevel) {
		if (discountLevel == 1) {
			return basePrice * 0.1;
		} else {
			return basePrice * 0.05;
		}
	}
	
}
