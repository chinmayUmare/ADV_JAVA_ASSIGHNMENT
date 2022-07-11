package atmandbank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfcAtm-v2")
public class HdfcAtm2_3 implements Atm2_1 {

	@Autowired
	private List<Bank2_2> banks;
	
	public void withdraw(int acno, double amount) {
		System.out.println("Customer at HdfcAtm wants to withdraw money..");
		Bank2_2 currentBank = null;
		for(Bank2_2 bank : banks) {
			if(bank.isAccountPresent(acno)) {
				currentBank = bank;
				break;
			}
		}
		currentBank.withdraw(12345, acno, amount);
	}

}


