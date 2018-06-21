package dojo.extract_interface;

import java.util.Date;

public class Employee {

	private String firstName;
	private String lastName;
	private String middleName;
	private Date dateOfBirth;
	private double rate;
	private boolean specialSkilled;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public boolean isSpecialSkilled() {
		return specialSkilled;
	}
	
	public void setSpecialSkilled(boolean specialSkills) {
		this.specialSkilled = specialSkills;
	}
	
	
	
}
