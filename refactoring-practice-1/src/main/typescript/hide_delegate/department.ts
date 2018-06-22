import {Person} from "./person.js";

export class Department {

    private manager: Person;

    public getManager() {
        return this.manager;
    }

    public setManager(manager: Person) {
        this.manager = manager;
    }
}
