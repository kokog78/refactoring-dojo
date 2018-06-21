import {Employee} from "./employee.js";

export class ChargeCalculator {

    /*
     * Az Employee osztályból csak két mezőt használ. Emeljük ki ezeket egy Billable interfészbe!
     */
    public calculateCharge(employee: Employee, days: number): number {
        let base: number = employee.getRate() * days;
        if (employee.isSpecialSkilled()) {
            return base * 1.05;
        } else {
            return base;
        }
    }

}