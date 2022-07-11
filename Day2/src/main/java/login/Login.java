package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login.cdac")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//now we create one class and also create object for that 
		//and by that object we call one function called 'isValidUser'
		//and pass two parameter and it get boolean value and if it return true 
		//then it redirect to "welcome.html" and for false "login.html" by 
		// 'response.sendRedirect'
		LoginService loginservice = new LoginService();
		boolean isValid = loginservice.isValidUser(username,password);
		
		if(isValid)
			response.sendRedirect("welcome.html");
		else
			response.sendRedirect("login.html");
	}

}
