package component;



import org.springframework.stereotype.Component;

@Component
public class CitiBank2_4 implements Bank2_2 {

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("Customer of CitiBank wants to withdraw money..");
	}
}

