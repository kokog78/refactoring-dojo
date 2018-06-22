import {Account} from "../../../main/typescript/move_method/account.js";
import {AccountType} from "../../../main/typescript/move_method/account-type.js";

describe('move_method: Account', () => {

    it('getBankCharge_should_calculate_bank_charge_correctly', () => {
        let account1: Account = new Account(AccountType.SIMPLE);

        account1.setDaysOverdrawn(0);
        expect(account1.getBankCharge()).toBe(4.5);

        account1.setDaysOverdrawn(10);
        expect(account1.getBankCharge()).toBe(22.0);

        let account2: Account = new Account(AccountType.PREMIUM);

        account2.setDaysOverdrawn(0);
        expect(account2.getBankCharge()).toBe(4.5);

        account2.setDaysOverdrawn(5);
        expect(account2.getBankCharge()).toBe(14.5);

        account2.setDaysOverdrawn(10);
        expect(account2.getBankCharge()).toBe(18.35);
    });
});