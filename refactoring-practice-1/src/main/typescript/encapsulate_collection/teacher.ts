import {Course} from "./course.js";

export class Teacher {

    private courses: Course[] = [];

    /*
     * Ez a lekérdező metódus a teljes kollekciót visszaadja, azon minden szolgáltatást elérünk.
     * Set<Course> helyett csak Iterable<Course> típust szeretnénk kiengedni, és a már használt
     * szolgáltatásokhoz egy-egy metódust készíteni a Teacher osztályba.
     */
    public getCourses(): Course[] {
        return this.courses;
    }

}
