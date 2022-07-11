// Write one servlet which will fetch the records from customer table and display the same

package TODO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class homeworkServlet
 */
@WebServlet("/homeworkServlet")
public class homeworkServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
			
	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chinmay", "root", "cdac");
			PreparedStatement pst = conn.prepareStatement("select * from tbl_customer");
			//pst.setString(1, tbl_)
			
			ResultSet rs = pst.executeQuery();
			
			PrintWriter out = response.getWriter();
			
			 response.setContentType("text/html");  
	         out.write("<html><body>");
			
			//start the table
			out.write("<table border=1 width=50% height=50%>");  
            out.write("<tr><th>name</th><th>email</th><th>mobileno</th><th>username</th><th>password</th>");
			
			while(rs.next())
			{
				String x = rs.getString("name");
				String y = rs.getString("email");
				Long z = rs.getLong("mobileno");
				String a = rs.getString("username");
				String b = rs.getString("password");
				
				 out.println("<tr><td>" + x + "</td><td>" + y + "</td><td>" + z + "</td><td>" + a + "</td><td>" + b + "</td></tr>"); 
			}
			out.write("</table>");
			out.write("</html></body>");
			
			conn.close();
	}
	catch(Exception e){
		//out.println("error");
	}
//	finally {
//		try {
//			conn.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	}
}
