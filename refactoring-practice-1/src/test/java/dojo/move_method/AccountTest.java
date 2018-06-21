package dojo.move_method;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class AccountTest {

	@Test
	public void getBankCharge_should_calculate_bank_charge_correctly() {
		Account account1 = new Account(AccountType.SIMPLE);
		
		account1.setDaysOverdrawn(0);
		assertThat(account1.getBankCharge()).isEqualTo(4.5);
		
		account1.setDaysOverdrawn(10);
		assertThat(account1.getBankCharge()).isEqualTo(22.0);
		
		Account account2 = new Account(AccountType.PREMIUM);
		
		account2.setDaysOverdrawn(0);
		assertThat(account2.getBankCharge()).isEqualTo(4.5);
		
		account2.setDaysOverdrawn(5);
		assertThat(account2.getBankCharge()).isEqualTo(14.5);
		
		account2.setDaysOverdrawn(10);
		assertThat(account2.getBankCharge()).isEqualTo(18.35);
	}
}
