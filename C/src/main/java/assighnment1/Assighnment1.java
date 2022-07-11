package assighnment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newfile001")
public class Assighnment1 extends HttpServlet {

	private int two_inputs1;
	private int two_inputs2;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String two_inputs1 = request.getParameter("two_inputs1");
		String two_inputs2 = request.getParameter("two_inputs2");
		
		int x = Integer.parseInt(two_inputs1);
		int y = Integer.parseInt(two_inputs2);
		int sum = x+y;
		int sub = x-y;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Hello " +sum + "</h1>");
		out.write("<h1>Hello " +sub + "</h1>");
		out.write("</body></html>");
		out.write("<h1>Hello again</h1>");
	
	}

	


	
}