package TODO;

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

@WebServlet("/Display")
public class homeworkServlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chinmay", "root", "cdac");
			PreparedStatement st = conn.prepareStatement("select * from customer");
			
			ResultSet rs = st.executeQuery();
			PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<table border=1 width=50% height=50%>");  
            out.write("<tr><th>name</th><th>email</th><th>mobileNo</th><th>Username</th><th>password</th>");

			while(rs.next())
			{
				String s1= rs.getString("name");
				String s2= rs.getString("email");
				Long s3 = rs.getLong("mobileNo");
				String s4= rs.getString("username");
				String s5= rs.getString("password");
				
				out.write("<tr><td>" + s1 + "</td><td>" + s2 + "</td><td>" + s3 + "</td><td>" + s4 + "</td><td>" + s5 + "</td></tr>");
				out.write("</table");
				out.write("</html></body>");
			}
		}catch(Exception e) {
			
		}finally {
			try {
			conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}