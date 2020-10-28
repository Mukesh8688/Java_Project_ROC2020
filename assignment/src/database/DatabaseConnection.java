package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	
	//jdbc url
	//jdbc username
	//jdbc password
	
	
	private final String url = "jdbc:postgresql://localhost/postgres";
	private final String user ="postgres";
	private final String password ="Revature";
			
	
	private Connection connect() {
		
		Connection conn = null;
		
		try{
			
			   conn = DriverManager.getConnection(url, user, password);
			
	           if(conn != null) {
				
				System.out.println("Connected to PostgreSQL Server Successfully");
	           }
			
		}catch(SQLException e) {
			
		  e.printStackTrace();
				
			
		}
		
		return conn;
		
	}

	public static void main(String[] args) {
		
		DatabaseConnection sqlConn = new DatabaseConnection();
		Connection conn= sqlConn.connect();
		
		Statement stmt = null;
		
		try {
		
		stmt = conn.createStatement();
		
		String sql = "Select * from company;" ;
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			
			int id = rs.getInt("id");
			String name = rs.getString("Name");
			
			//display
			System.out.println("Id = :" +id);
			System.out.println("Name =:" + name);
					
					
		}
			rs.close();	
			
			
		String sqlInsert = "insert into company " +
		"values(10,'Preet',10,'chicago',2000000,'2007-12-12');";
		
		stmt.executeUpdate(sqlInsert);
				
		}catch(SQLException e) {
			e.getStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(stmt !=null)
					conn.close();
				
			}catch(SQLException e) {
				
			}
			
			try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		}
		
		
	}
		

}
