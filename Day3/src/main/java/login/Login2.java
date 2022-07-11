package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login2
 */
@WebServlet("/Login2")
public class Login2 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//FOLLOWING LINE ACTS LIKE SOP STATEMENT
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginService loginservice = new LoginService();
		boolean isValid = loginservice.isValidUser(username, password);
		
		//if something is wrong in the 'if' statement then it will not show any error so type carefully
		if(isValid) {
			String rememberMe = request.getParameter("rememberMe");
			if(rememberMe != null && rememberMe.equals("yes")) {
				Cookie c1 = new Cookie("uname", username);
				c1.setMaxAge(60*60*24);
				Cookie c2 = new Cookie("upass", password);
				c1.setMaxAge(60*60*24);
				response.addCookie(c1);
				response.addCookie(c2);
				
			}
		response.sendRedirect("welcome1.html");}
			else
				response.sendRedirect("login2.html");
		}
	}

