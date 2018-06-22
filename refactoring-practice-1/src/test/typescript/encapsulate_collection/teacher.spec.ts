import {Course} from "../../../main/typescript/encapsulate_collection/course.js";
import {Teacher} from "../../../main/typescript/encapsulate_collection/teacher.js";

describe('encapsulate_collection: Teacher', () => {

    it('should_find_advanced_courses', () => {
        let java: Course = new Course("Java Programming", false);
        let advancedJava: Course = new Course("Advanced Java Programming", true);

        let bob: Teacher = new Teacher();
        bob.getCourses().push(java);
        bob.getCourses().push(advancedJava);

        expect(bob.getCourses().length).toBe(2);

        expect(
            bob.getCourses()
                .filter(course => course.isAdvanced())
                .map(course => course.getName())
        ).toEqual(["Advanced Java Programming"]);

        bob.getCourses().splice(bob.getCourses().indexOf(advancedJava), 1);

        expect(bob.getCourses().length).toBe(1);

        expect(
            bob.getCourses()
                .filter(course => course.isAdvanced())
        ).toEqual([]);
    });
});