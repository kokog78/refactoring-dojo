import {Employee} from "./employee.js";

export class Programmer extends Employee {

    public constructor(name: string) {
        super(name);
    }

    public getDescription() {
        return "Programmer: " + this.getName();
    }

}
