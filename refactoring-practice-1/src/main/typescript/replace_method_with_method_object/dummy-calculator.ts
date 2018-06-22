export class DummyCalculator {

    /*
     * Hozzunk létre egy Gamma osztályt, aminek a compute metódusa kiszámolja, amit kell.
     */
    public computeGamma(inputVal: number, quantity: number, yearToDate: number) {
        let importantValue1 = (inputVal * quantity) + this.delta();
        let importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        let importantValue3 = importantValue2 * 7;
        // etc
        return importantValue3 - 2 * importantValue1;
    }

    private delta() {
        return 10;
    }

}
