package dojo.pull_up_method;

public class Main {

	public static void main(String[] args) {
		Tester tester = new Tester("Alice");
		Programmer programmer = new Programmer("Bob");
		tester.printDescription();
		programmer.printDescription();
	}
}
