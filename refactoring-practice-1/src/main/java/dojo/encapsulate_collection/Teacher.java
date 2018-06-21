package dojo.encapsulate_collection;

import java.util.HashSet;
import java.util.Set;

public class Teacher {

	private final Set<Course> courses = new HashSet<>();
	
	/*
	 * Ez a lekérdező metódus a teljes kollekciót visszaadja, azon minden szolgáltatást elérünk.
	 * Set<Course> helyett csak Iterable<Course> típust szeretnénk kiengedni, és a már használt
	 * szolgáltatásokhoz egy-egy metódust készíteni a Teacher osztályba.
	 */
	public Set<Course> getCourses() {
		return courses;
	}
	
}
