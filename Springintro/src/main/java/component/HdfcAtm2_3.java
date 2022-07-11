package component;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HdfcAtm2_3 implements Atm2_1 {

	@Autowired
	private Bank2_2 bank;
	
	public void withdraw(int acno, double amount) {
		System.out.println("Customer at HdfcAtm wants to withdraw money..");
		bank.withdraw(12345, acno, amount);
	}

}

