package atmandbank;

import org.springframework.stereotype.Component;

@Component("citibank-v2")
public class CitiBank2_4 implements Bank2_2 {

	public boolean isAccountPresent(int acno) {
		if(acno == 10101010)
			return true;
		return false;
	}

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("Customer of CitiBank wants to withdraw money..");
	}
}

