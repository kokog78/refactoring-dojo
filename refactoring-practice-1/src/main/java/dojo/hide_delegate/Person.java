package dojo.hide_delegate;

/*
 * Hozzunk létre egy getManager metódust, ami visszaadja a department.manager értékét,
 * így elrejthető a department mező.
 */
public class Person {

	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
}
