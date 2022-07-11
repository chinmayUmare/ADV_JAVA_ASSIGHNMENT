package assighnment2;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Day01Assig2")
public class Assighnment2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int year = Integer.parseInt(request.getParameter("bdate1"));
		int month = Integer.parseInt(request.getParameter("bdate2"));
		int date = Integer.parseInt(request.getParameter("bdate3"));
		
		LocalDate dob = LocalDate.of(year, month, date);  
		LocalDate curDate = LocalDate.now();  
		Period period = Period.between(dob, curDate);  
		int yyyy1 =period.getYears();
		int month1 =period.getMonths();
		int dd1 =period.getDays();
		
//		version:01
//		out.write("<p>version:01");
//		out.write("<h1>Your age is : "+yyyy1+" Years");
		
//		version:02
		out.write("<p>version:02");
		out.write("<h1>You are : "+yyyy1+" years "+month1+" months "+dd1+" days old");
	}
}