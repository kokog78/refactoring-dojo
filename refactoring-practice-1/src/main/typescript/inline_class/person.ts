/*
 * Olvasszuk be a Phone osztályt a Person osztályba!
 */
import {Phone} from "./phone.js";

export class Person {

    private name: string;
    private officePhone: Phone = new Phone();

    public getName() {
        return this.name;
    }

    public setName(name: string) {
        this.name = name;
    }

    public getOfficePhone(): Phone {
        return this.officePhone;
    }
}
