import {OrderUtils} from "../../../main/typescript/replace_data_value_with_object/order-utils.js";
import {Order} from "../../../main/typescript/replace_data_value_with_object/order.js";

describe('replace_data_value_with_object: OrderUtils', () => {

    it('getNumberOfOrdersFor_should_calculate_numbers_of_order_correctly', () => {
        expect(OrderUtils.getNumberOfOrdersFor("Bob", [new Order("Bob"), new Order("Jane")]))
            .toBe(1);
    });
});