package dojo.extract_class;

/*
 * Emeljük ki a telefonszámot egy külön osztályba!
 * Előtte írjuk meg a szükséges teszteket getOfficeAreaCode, getOfficeNumber metódusok számára!
 */
public class Person {

	private String officeAreaCode;
	private String officeNumber;
	private String name;
	
	public String getOfficeTelephoneNumber() {
		return "(" + officeAreaCode + ") " + officeNumber;
	}
	
	public String getOfficeAreaCode() {
		return officeAreaCode;
	}
	
	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}
	
	public String getOfficeNumber() {
		return officeNumber;
	}
	
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
