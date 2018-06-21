package dojo.introduce_null_object;

public class Customer {

	private final String name;
	private final BillingPlan billingPlan;
	private final BillingHistory billingHistory = new BillingHistory();
	
	public Customer(String name, BillingPlan billingPlan) {
		super();
		this.name = name;
		this.billingPlan = billingPlan;
	}
	
	public String getName() {
		return name;
	}
	
	public BillingPlan getBillingPlan() {
		return billingPlan;
	}
	
	public BillingHistory getBillingHistory() {
		return billingHistory;
	}
}
