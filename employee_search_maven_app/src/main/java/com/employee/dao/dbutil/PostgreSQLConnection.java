package com.employee.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import com.employee.dao.dbutil.DbUtilProp;

public class PostgreSQLConnection {
	
 private static Connection connection;
	
  private PostgreSQLConnection() {
	  
  }
  
  // Built static getConnection method with Connection return type object
	
  
  public static Connection getConnection() throws ClassNotFoundException,SQLException{
	  
	  Class.forName(DbUtilProp.DRIVER);
	  
	  String username = "postgres";
	  String password = "Revature";
	  
	  connection = DriverManager.getConnection(DbUtilProp.URL, username, password);
	  
	  return connection;
  }
	

}
