package in.hp.todolist.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnections {

	private static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft","root","root");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	/*
	 * We have provided the getConnection() inside the static{} because
	 * we want to get only one object of the getConnection() 
	 * */
	
	public static Connection getConnection() {
		return con;
	}
	
}
