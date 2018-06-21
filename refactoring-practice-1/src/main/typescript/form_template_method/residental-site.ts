import {Site} from "./site.js";

export class ResidentalSite extends Site {

    public constructor(units: number, rate: number) {
        super(units, rate);
    }

    public getBillableAmount() {
        let base = this.getUnits() * this.getRate();
        let tax = base * Site.TAX_RATE;
        return base + tax;
    }

}