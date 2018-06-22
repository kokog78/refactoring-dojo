import {Employee} from "./employee.js";

export class Tester extends Employee {

    public constructor(name: string) {
        super(name);
    }

    public getDescription() {
        return "Tester: " + this.getName();
    }

}
