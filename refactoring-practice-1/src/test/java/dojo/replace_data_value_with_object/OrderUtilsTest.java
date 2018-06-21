package dojo.replace_data_value_with_object;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class OrderUtilsTest {

	@Test
	public void getNumberOfOrdersFor_should_calculate_numbers_of_order_correctly() {
		assertThat(OrderUtils.getNumberOfOrdersFor("Bob", new Order("Bob"), new Order("Jane"))).isEqualTo(1);
	}
}
