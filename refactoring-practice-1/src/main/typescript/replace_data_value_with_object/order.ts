export class Order {

    /*
     * Hozzunk létre a customer mezőnek egy saját osztályt.
     */
    public constructor(private customer: string) {
    }

    public getCustomerName() {
        return this.customer;
    }

}
