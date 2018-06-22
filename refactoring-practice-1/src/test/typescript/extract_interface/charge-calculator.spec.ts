import {ChargeCalculator} from "../../../main/typescript/extract_interface/charge-calculator.js";
import {Employee} from "../../../main/typescript/extract_interface/employee.js";

describe('extract_interface: ChargeCalculator', () => {

    it('calculateCharge_should_calculate_charge_correctly', () => {
        let calculator: ChargeCalculator = new ChargeCalculator();
        let employee: Employee = new Employee();
        employee.setRate(20.0);

        employee.setSpecialSkilled(false);
        expect(calculator.calculateCharge(employee, 10)).toBe(200.0);

        employee.setSpecialSkilled(true);
        expect(calculator.calculateCharge(employee, 10)).toBe(210.0);
    });
});