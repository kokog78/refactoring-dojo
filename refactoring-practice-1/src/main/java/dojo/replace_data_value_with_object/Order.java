package dojo.replace_data_value_with_object;

public class Order {

	/*
	 * Hozzunk létre a customer mezőnek egy saját osztályt.
	 */
	private final String customer;

	public Order(String customer) {
		super();
		this.customer = customer;
	}
	
	public String getCustomerName() {
		return customer;
	}
	
}
