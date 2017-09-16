

package ooad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class CreateConnection {
	
	private Connection conn=null;
	
	public void getConnection(){
		
		try { 
		       
		       if (conn == null || conn.isClosed()) {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root",
							"123789");  //(url, user, password)(user is mysql user, not app user) 
					} 
		    }
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "JDBC Driver Not Found!");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
		}
	}

}

