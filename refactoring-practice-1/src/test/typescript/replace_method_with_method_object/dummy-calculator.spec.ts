import {DummyCalculator} from "../../../main/typescript/replace_method_with_method_object/dummy-calculator.js";

describe('replace_method_with_method_object: DummyCalculator', () => {

    it('computeGamma_should_compute_gamma_correctly', () => {
        let calculator: DummyCalculator = new DummyCalculator();
        expect(calculator.computeGamma(1, 2, 3)).toBe(697);
        expect(calculator.computeGamma(1, 2, 3000)).toBe(21536);
    });
});