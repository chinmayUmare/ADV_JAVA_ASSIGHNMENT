package Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterService {
	
	public boolean isCustomerPresent(String email) {
		Connection conn = null;
		try {
			// following line throw CNFE
			Class.forName("com.mysql.cj.jdbc.Driver");
			//following line throw SQLE
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chinmay", "root", "cdac");
			
			boolean present = false;
			
			// query run karnya sathi apn 'PreparedStatement' line lihto
			PreparedStatement pst = conn.prepareStatement("select count(*) from tbl_customer where email = ?");
			//ya line through query mdhe que mark chya jagi value(email) takt aho
			pst.setString(1, email);
			//
			ResultSet rs = pst.executeQuery(); // in 'rs' the query in 'pst' is executed and save in 'rs' 
			if(rs.next()) {                    // coz of 'rs.next()' it will act like cursor and go to next query
				int c = rs.getInt(1);          // coz of getInt(1) value at index 1 will got 
				if (c == 1)
					present = true;
			}
			return present;
		}
		
		catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace(); // 'printStackTrace()' print all exception msg at console
			return false;
		}
		
		finally {
			try { conn.close();}
			catch(Exception e) { }
		}
	}
	
	public void register(String name, String email, int mobileNo, String username, String password) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			                                               //localhost:portNo/database, user, password
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chinmay", "root", "cdac");
			PreparedStatement st = conn.prepareStatement("insert into tbl_customer(name, email, mobileno, username, password) values(?, ?, ?, ?, ?)");
			st.setString(1, name);
			st.setString(2, email);
			st.setInt(3, mobileNo);
			st.setString(4, username);
			st.setString(5, password);
			
			st.executeUpdate();
		}
		
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try { conn.close(); } catch(Exception e) { } 
		}
	}

}
