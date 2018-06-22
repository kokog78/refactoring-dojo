import {Site} from "../../../main/typescript/introduce_null_object/site.js";
import {BillingPlan} from "../../../main/typescript/introduce_null_object/billing-plan.js";
import {Customer} from "../../../main/typescript/introduce_null_object/customer.js";

describe('introduce_null_object: Site', () => {

    let site: Site = new Site();

    it('getCustomerName_should_return_right_customer_name', () => {
        site.setCustomer(new Customer("Bob", BillingPlan.PREMIUM));
        expect(site.getCustomerName()).toBe("Bob");

        site.setCustomer(null);
        expect(site.getCustomerName()).toBe("occupant");
    });

    it('getCustomerName_should_return_right_billing_plan', () => {
        site.setCustomer(new Customer("Bob", BillingPlan.PREMIUM));
        expect(site.getBillingPlan()).toBe(BillingPlan.PREMIUM);

        site.setCustomer(null);
        expect(site.getBillingPlan()).toBe(BillingPlan.BASIC);
    });

    it('getCustomerName_should_return_right_delinquent_weeks', () => {
        site.setCustomer(new Customer("Bob", BillingPlan.PREMIUM));
        expect(site.getWeeksDelinquent()).toBe(1);

        site.setCustomer(null);
        expect(site.getWeeksDelinquent()).toBe(0);
    });
});