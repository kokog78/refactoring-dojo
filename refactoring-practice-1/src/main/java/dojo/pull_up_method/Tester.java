package dojo.pull_up_method;

public class Tester extends Employee {

	public Tester(String name) {
		super(name);
	}

	public String getDescription() {
		return "Tester: " + getName();
	}
	
}
