package dojo.replace_type_code_with_subclasses;

/*
 * Ebből az osztályból származtassunk le 3 alosztályt, minden típuskód érték számára egyet!
 */
public class Employee {

	public final static int ENGINEER = 0;
	public final static int SALESMAN = 1;
	public final static int MANAGER = 2;
	
	private final int type;

	public Employee(int type) {
		super();
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
	
	public double getBaseSalary() {
		switch (type) {
		case ENGINEER:
			return 1000.0;
		case SALESMAN:
			return 900.0;
		case MANAGER:
			return 2000.0;
		}
		throw new IllegalStateException("Invalid employee type!");
	}
}
