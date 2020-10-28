package com.mukesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConnectionDemo {
	
//    private String url ="jdbc:postgresql://localhost:5432/postgres";
//	private String user="postgres";
//	private String password = "Revature";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
	    String url ="jdbc:postgresql://localhost:5432/postgres";
		String user="postgres";
		String password = "Revature";
		
		try {
			
			//---Register the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			
			
			// Open Connection
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Successfully Done!!");
			
			
			// Create Statement
			
			Statement st = conn.createStatement();
			String sql = "Select * from public.company;";
			
			//Execute Query
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Query Executed");
			
			
			// Process Results
			
			while(rs.next()) {
				
				System.out.println("Id = "+rs.getInt("id"));
				System.out.println("Id = "+rs.getString("name"));
				System.out.println("Id = "+rs.getInt("age"));
				System.out.println("Id = "+rs.getString("address"));
				System.out.println("Id = "+rs.getInt("salary"));
				System.out.println("Id = "+rs.getDate("join_date"));
				System.out.println();

			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
