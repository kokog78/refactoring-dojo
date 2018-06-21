package dojo.replace_type_code_with_class;

public class Person {

	public static final int O = 0;
	public static final int A = 1;
	public static final int B = 2;
	public static final int AB = 3;
	
	/*
	 * Ehelyett a primitív érték helyett készítsünk egy BloodGroup nevű osztályt!
	 */
	private final int bloodGroup;

	public Person(int bloodGroup) {
		super();
		this.bloodGroup = bloodGroup;
	}
	
	public int getBloodGroup() {
		return bloodGroup;
	}
}
