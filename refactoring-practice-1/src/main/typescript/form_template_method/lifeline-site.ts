import {Site} from "./site.js";

export class LifelineSite extends Site {

    public constructor(units: number, rate: number) {
        super(units, rate);
    }

    public getBillableAmount() {
        let base = this.getUnits() * this.getRate() * 0.5;
        let tax = base * Site.TAX_RATE * 1.2;
        return base + tax;
    }

}