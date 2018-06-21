package dojo.replace_delegation_with_inheritance;

/*
 * Tegyük az Employee osztályt a Person leszármazottjává, ezáltal szüntessük meg a delegálást!
 */
public class Employee {

	private final Person person;

	public Employee(Person person) {
		super();
		this.person = person;
	}
	
	public String getName() {
		return person.getName();
	}
	
	public void setName(String name) {
		person.setName(name);
	}
	
	@Override
	public String toString() {
		return "Employee: " + person.getLastName();
	}
}
