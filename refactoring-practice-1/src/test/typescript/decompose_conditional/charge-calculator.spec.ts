import {ChargeCalculator} from '../../../main/typescript/decompose_conditional/charge-calculator.js';

describe('decompose_conditional: ChargeCalculator', () => {

    it('should_calculate_charge_correctly', () => {
        let calculator: ChargeCalculator = new ChargeCalculator(10, 9, 20);
        expect(calculator.calculateChargeForMonth(0, 10)).toBe(110.0);
        expect(calculator.calculateChargeForMonth(10, 10)).toBe(110.0);
        expect(calculator.calculateChargeForMonth(6, 10)).toBe(100.0);
    });
});