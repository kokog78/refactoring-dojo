package dojo.replace_data_value_with_object;

public class Order {
	
	private final int quantity;

	/*
	 * Hozzunk létre a customer mezőnek egy saját osztályt!
	 */
	private final String customer;

	public Order(String customer, int quantity) {
		super();
		this.customer = customer;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getCustomer() {
		return customer;
	}
	
}
