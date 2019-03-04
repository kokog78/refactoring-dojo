package dojo.replace_data_value_with_object;

public class OrderUtils {

	public static int getNumberOfOrdersFor(String customerName, Order ... orders) {
		int result = 0;
		for (Order order : orders) {
			if (order.getCustomer().equals(customerName)) {
				result++;
			}
		}
		return result;
	}
	
}
