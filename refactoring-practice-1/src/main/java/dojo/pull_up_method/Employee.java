package dojo.pull_up_method;

/*
 * A leszármazott osztályok getDescription metódusa ugyanazt csinálja.
 * Hozzuk fel ide!
 */
public abstract class Employee {

	private final String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
