import {Order} from "./order.js";

export class OrderUtils {

    public static getNumberOfOrdersFor(customerName: string, orders: Order[]) {
        let result = 0;
        for (let order of orders) {
            if (order.getCustomerName() === customerName) {
                result++;
            }
        }
        return result;
    }

}
