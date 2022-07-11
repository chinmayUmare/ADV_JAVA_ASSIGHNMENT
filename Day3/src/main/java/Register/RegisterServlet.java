package Register;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register1.cdac")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int mobileNo = Integer.parseInt(request.getParameter("mobileNo"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		
		RegisterService res = new RegisterService();
		boolean present = res.isCustomerPresent(email);
		if(present) {
			out.write("<h1>It seems you are alerady user</h1>");
		}
		else {
			res.register(name, email, mobileNo, username, password);
			out.write("<h1>Registration successful</h1>");
		}
		
		out.write("</body></html>");
		
		
		
	}

}

