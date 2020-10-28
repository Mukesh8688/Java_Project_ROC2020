package maven.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	
	
	private String url ="jdbc:postgresql://localhost:5432/postgres";
	private String user="postgres";
	private String password = "Revature";
	
	
	public static Connection connect() {
		
		JdbcConnection obj = new JdbcConnection();
		
		Connection conn =null;
		
		try {
			
		//---Register the Driver
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded Successfully");
		
		
		// Open Connection
		conn = DriverManager.getConnection(obj.getUrl(), obj.getUser(), obj.getPassword());
		System.out.println("Connection Successfully Done!!");
		
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	
	

	public static void main(String[] args) {
		
	
  		Connection conn = connect();

		
		try {
			
			
			
//			//---Register the Driver
//			Class.forName("org.postgresql.Driver");
//			System.out.println("Driver Loaded Successfully");
//			
//			
//			// Open Connection
//			conn = DriverManager.getConnection(obj.getUrl(), obj.getUser(), obj.getPassword());
//			System.out.println("Connection Successfully Done!!");
			
			
			
			// Create Statement
			
			Statement st = conn.createStatement();
			//Statement st1 = conn.createStatement();
			String sql = "Select * from public.company;";
						
			
			//Execute Query
			ResultSet rs = st.executeQuery(sql);
			
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
			
			
			// insert query
//			   String sql4 ="Insert into public.companytest values(7,'Preet',3000);";
//			   int n =	 st.executeUpdate(sql4);
//			   System.out.println("Insert data no of time : " + n);
			  
			
		
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	
	
	
	
	
	
	// getter and setter

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
