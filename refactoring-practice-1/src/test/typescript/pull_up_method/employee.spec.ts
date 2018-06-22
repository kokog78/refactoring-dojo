import {Tester} from "../../../main/typescript/pull_up_method/tester.js";
import {Programmer} from "../../../main/typescript/pull_up_method/programmer.js";

describe('pull_up_method: Employee', () => {

    it('getDescription_should_return_description', () => {
        let tester: Tester = new Tester("Alice");
        let programmer: Programmer = new Programmer("Bob");
        expect(tester.getDescription()).toBe("Tester: Alice");
        expect(programmer.getDescription()).toBe("Programmer: Bob");

    });
});