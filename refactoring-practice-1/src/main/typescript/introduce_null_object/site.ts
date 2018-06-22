/*
 * A null vizsgálatok helyett hozzunk létre egy NullCustomer osztályt, és az adjon vissza olyan értékeket, amiket
 * a null vizsgálatok eredményei adtak vissza.
 */
import {Customer} from "./customer.js";
import {BillingPlan} from "./billing-plan.js";

export class Site {

    private customer: Customer;

    public setCustomer(customer: Customer) {
        this.customer = customer;
    }

    public getCustomerName(): string {
        if (this.customer == null) {
            return "occupant";
        } else {
            return this.customer.getName();
        }
    }

    public getBillingPlan(): BillingPlan {
        if (this.customer == null) {
            return BillingPlan.BASIC;
        } else {
            return this.customer.getBillingPlan();
        }
    }

    public getWeeksDelinquent(): number {
        if (this.customer == null) {
            return 0;
        } else {
            return this.customer.getBillingHistory().getWeeksDelinquentInLastYear();
        }
    }
}
