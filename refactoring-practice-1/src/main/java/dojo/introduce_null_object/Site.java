package dojo.introduce_null_object;

/*
 * A null vizsgálatok helyett hozzunk létre egy NullCustomer osztályt, és az adjon vissza olyan értékeket, amiket
 * a null vizsgálatok eredményei adtak vissza.
 * Lépések:
 * - NullCustomer osztály és Customer.isNull metódus létrehozása
 * - NullCustomer példány és Customer.isNull metódusok behelyettesítése
 * - Feltételes utasítások megszüntetése, NullCustomer metódusainak implementálásával
 */
public class Site {

	private Customer customer;
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String getCustomerName() {
		if (customer == null) {
			return "occupant";
		} else {
			return customer.getName();
		}
	}
	
	public BillingPlan getBillingPlan() {
		if (customer == null) {
			return BillingPlan.BASIC;
		} else {
			return customer.getBillingPlan();
		}
	}
	
	public int getWeeksDelinquent() {
		if (customer == null) {
			return 0;
		} else {
			return customer.getBillingHistory().getWeeksDelinquentInLastYear();
		}
	}
}
