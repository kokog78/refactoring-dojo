export class AccountType {

    static PREMIUM = new AccountType();
    static SIMPLE = new AccountType();

    public isPremium(): boolean {
        return this === AccountType.PREMIUM;
    }

}
