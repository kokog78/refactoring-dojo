package dojo.replace_data_value_with_object;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class OrderUtilsTest {

	@Test @org.junit.Test
	public void getNumberOfOrdersFor_should_calculate_numbers_of_order_correctly() {
		assertThat(OrderUtils.getNumberOfOrdersFor("Bob", new Order("Bob", 1), new Order("Jane", 2)))
			.isEqualTo(1);
	}
}
