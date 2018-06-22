export class PriceCalculator {

    public constructor(private unitPrice: number, private quantity: number) {
    }

    public getPrice(): number {
        let basePrice = this.quantity * this.unitPrice;
        let discountLevel;
        if (this.quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }
        let finalPrice = this.getDiscountedPrice(basePrice, discountLevel);
        return finalPrice;
    }

    /*
     * Ebből a metódusból távolítsuk el mindkét paramétert úgy, hogy helyettesítjük
     * őket egy getBasePrice és egy getDiscountLevel metódushívással!
     */
    private getDiscountedPrice(basePrice: number, discountLevel: number): number {
        if (discountLevel == 1) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }
    }

}
