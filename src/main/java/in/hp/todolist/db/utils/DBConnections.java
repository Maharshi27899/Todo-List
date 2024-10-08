package in.hp.todolist.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnections {

	public static final String DB_NAME = "todo";
	public static final String DB_USER= "root";
	public static final String DB_PASSWORD = "root";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/"+DB_NAME;
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		if(conn == null) {
			conn = getConnection(DB_URL,DB_USER,DB_PASSWORD);
		}
		
		return conn;
	}

	private static Connection getConnection(String dbUrl, String dbUser, String dbPassword) {
		try {
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(dbUrl,dbUser,dbPassword);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
}
