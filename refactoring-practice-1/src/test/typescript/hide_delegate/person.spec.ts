import {Person} from "../../../main/typescript/hide_delegate/person.js";
import {Department} from "../../../main/typescript/hide_delegate/department.js";

describe('hide_delegate: Person', () => {

    it('should_access_department_manager', () => {
        let bob: Person = new Person();
        let john: Person = new Person();
        let department: Department = new Department();
        department.setManager(bob);
        bob.setDepartment(department);
        john.setDepartment(department);

        let manager: Person = john.getDepartment().getManager();

        expect(manager).toBe(bob);

    });
});