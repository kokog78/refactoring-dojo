package dojo.replace_data_value_with_object;

public class OrderUtils {

	public static int getNumberOfOrdersFor(String customerName, Order ... orders) {
		int result = 0;
		for (Order order : orders) {
			if (order.getCustomerName().equals(customerName)) {
				result++;
			}
		}
		return result;
	}
	
}
