package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_to_sql {
	
public  Connection getConnection() {
		
		String url = "jdbc:mysql://localhost/";
		String dbName = "vtc";
		String user="root";
		String pwd="";
		
		
		Connection connect = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		     try {
		connect = (Connection) DriverManager.getConnection(url+dbName,user,pwd);

		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		} catch (ClassNotFoundException e) {e.printStackTrace();
		}
		return connect;
		}
}
