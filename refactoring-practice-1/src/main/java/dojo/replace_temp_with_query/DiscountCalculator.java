package dojo.replace_temp_with_query;

public class DiscountCalculator {

	private final int quantity;
	private final double itemPrice;
	
	public DiscountCalculator(int quantity, double itemPrice) {
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}
	
	public double getPrice() {
		double basePrice = quantity * itemPrice;
		double discountFactor;
		if (basePrice > 1000.0) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}
}
