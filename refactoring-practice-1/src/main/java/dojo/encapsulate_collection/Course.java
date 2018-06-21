package dojo.encapsulate_collection;

public class Course {

	private final String name;
	private final boolean advanced;
	
	public Course(String name, boolean advanced) {
		super();
		this.name = name;
		this.advanced = advanced;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isAdvanced() {
		return advanced;
	}
}
