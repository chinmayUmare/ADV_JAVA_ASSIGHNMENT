package component;



import org.springframework.stereotype.Component;

@Component("loginServ")
public class LoginService1 {

	public boolean isValidUser(String username, String password) {
		if(username.equals("majrul") && password.equals("123"))
			return true;
		return false;
	}
}

