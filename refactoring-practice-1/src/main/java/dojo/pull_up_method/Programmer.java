package dojo.pull_up_method;

public class Programmer extends Employee {

	public Programmer(String name) {
		super(name);
	}

	public void printDescription() {
		System.out.println("Programmer: " + getName());
	}
	
}
