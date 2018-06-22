import {BillingPlan} from "./billing-plan.js";
import {BillingHistory} from "./billing-history.js";

export class Customer {

    private billingHistory: BillingHistory = new BillingHistory();

    public constructor(private name: string, private billingPlan: BillingPlan) {
    }

    public getName() {
        return this.name;
    }

    public getBillingPlan(): BillingPlan {
        return this.billingPlan;
    }

    public getBillingHistory(): BillingHistory {
        return this.billingHistory;
    }
}
