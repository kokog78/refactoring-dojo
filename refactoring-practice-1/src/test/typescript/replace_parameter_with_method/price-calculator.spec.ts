import {PriceCalculator} from "../../../main/typescript/replace_parameter_with_method/price-calculator.js";

describe('replace_parameter_with_method: PriceCalculator', () => {

    it('getPrice_should_calculate_price_correctly', () => {
        let calculator1: PriceCalculator = new PriceCalculator(90.0, 10);
        expect(calculator1.getPrice()).toBe(90.0);

        let calculator2: PriceCalculator = new PriceCalculator(90.0, 1000);
        expect(calculator2.getPrice()).toBe(4500.0);
    });
});