/*
 * A leszármazott osztályok getBillableAmount metódusai nagyon hasonló dolgot csinálnak.
 * Készítsünk a számukra itt egy sablonfüggvényt, ami két absztrakt függvényt hív meg:
 * getBaseAmount és getTaxAmount!
 */
export abstract class Site {

    static TAX_RATE = 0.27;

    public constructor(private units: number, private rate: number) {
    }

    public getUnits() {
        return this.units;
    }

    public getRate() {
        return this.rate;
    }

}
