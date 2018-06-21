export class ChargeCalculator {

    static SUMMER_START_MONTH = 5;
    static SUMMER_END_MONTH = 7;

    constructor(private summerRate: number, private winterRate: number, private winterServiceCharge: number) {
    }

    calculateChargeForMonth(month: number, quantity: number): number {
        let charge = 0.0;
        if (month < ChargeCalculator.SUMMER_START_MONTH || month > ChargeCalculator.SUMMER_END_MONTH) {
            charge = quantity * this.winterRate + this.winterServiceCharge;
        } else {
            charge = quantity * this.summerRate;
        }
        return charge;
    }
}
