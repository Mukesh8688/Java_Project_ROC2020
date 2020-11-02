package com.tech.jdbc.dbutil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class PostgresDbConnection {
	
	private static Connection connection;
	
	// making constructor private  not allowing  initialize object
	private PostgresDbConnection() {
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		
		Class.forName("org.postgresql.Driver");
		
		String url="jdbc:postgresql://localhost:5432/postgres";			
		String username="postgres";
		String password="Revature";
		
		//String password = System.getenv()
		
		connection = DriverManager.getConnection(url, username, password);
		
		return connection;
		
		
	}

}
