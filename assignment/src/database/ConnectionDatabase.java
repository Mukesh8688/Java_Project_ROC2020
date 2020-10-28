package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Connection con = null;
		
		try {
			 // for register
			Class.forName("org.postgresql.Driver");
			
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Revature");
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			System.err.println(e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
			
		}
		
		System.out.println("Opened database Successfully");




	}

}
