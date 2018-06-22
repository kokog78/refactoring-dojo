import {AccountType} from "./account-type.js";

export class Account {

    private daysOverdrawn: number;

    public constructor(private type: AccountType) {
    }

    public getDaysOverdrawn() {
        return this.daysOverdrawn;
    }

    public setDaysOverdrawn(daysOverdrawn: number) {
        this.daysOverdrawn = daysOverdrawn;
    }

    /*
     * Ezt a metódust helyezzük át az AccountType osztályba.
     */
    getOverdraftCharge(): number {
        if (this.type.isPremium()) {
            let result = 10.0;
            if (this.daysOverdrawn > 7) {
                result += (this.daysOverdrawn - 7) + 0.85;
            }
            return result;
        } else {
            return this.daysOverdrawn * 1.75;
        }
    }

    public getBankCharge(): number {
        let result = 4.5;
        if (this.daysOverdrawn > 0) {
            result += this.getOverdraftCharge();
        }
        return result;
    }
}
