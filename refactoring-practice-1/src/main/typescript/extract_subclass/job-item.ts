/*
 * A labor mezőtől függően az osztály máshogyan számol. Emeljük ki ezt a viselkedést egy LaborItem osztályba!
 */
import {Employee} from "./employee.js";

export class JobItem {

    public constructor(private unitPrice: number, private quantity: number, private employee: Employee, private labor: boolean) {
    }

    public getTotalPrice() {
        return this.getUnitPrice() * this.quantity;
    }

    public getUnitPrice() {
        return (this.labor ? this.employee.getRate() : this.unitPrice);
    }

    public getQuantity() {
        return this.quantity;
    }

    public getEmployee() {
        return this.employee;
    }

}
