import {Employee} from "../../../main/typescript/extract_subclass/employee.js";
import {JobItem} from "../../../main/typescript/extract_subclass/job-item.js";

describe("JobItem", () => {

    it('getTotalPrice_should_calculate_price_correctly', () => {
        let john: Employee = new Employee(10.0);

        let j1: JobItem = new JobItem(20.0, 10, john, false);
        expect(j1.getTotalPrice()).toBe(200.0);

        let j2: JobItem = new JobItem(20.0, 10, john, true);
        expect(j2.getTotalPrice()).toBe(100.0);
    });
});