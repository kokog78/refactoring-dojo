package dojo.extract_subclass;

/*
 * A labor mezőtől függően az osztály máshogyan számol. Emeljük ki ezt a viselkedést egy LaborItem osztályba!
 */
public class JobItem {

	private final double unitPrice;
	private final int quantity;
	private final Employee employee;
	private final boolean labor;
	
	public JobItem(double unitPrice, int quantity, Employee employee, boolean labor) {
		super();
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.employee = employee;
		this.labor = labor;
	}
	
	public double getTotalPrice() {
		return getUnitPrice() * quantity;
	}
	
	public double getUnitPrice() {
		return (labor ? employee.getRate() : unitPrice);
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
}
