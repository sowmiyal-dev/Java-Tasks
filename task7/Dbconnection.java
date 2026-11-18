package task7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	String url="jdbc:mysql://localhost:3306/productdatabase";
	String username="root";
	String password="Sowmi2603";

	public Connection dbconnection(){
		Connection conn= null;
		try {
			conn=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}