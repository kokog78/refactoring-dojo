package dojo.inline_class;

/*
 * Olvasszuk be a Phone osztályt a Person osztályba!
 */
public class Person {

	private String name;
	private Phone officePhone = new Phone();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Phone getOfficePhone() {
		return officePhone;
	}
}
