package com.bankapplication.dao.dbutil;

public class BankAccountQueries {
	
	public static String registerUsernameEmployee = "INSERT INTO project_schema.bankApp_register\n"
			+ "(username,password, email,usertype)\n"
			+ "VALUES(?, ?, ?,?);" ;
	
	
	public static String isValide = "SELECT id from project_schema.bankApp_register\n"
			     + "WHERE username = ? and password = ?";
	
	
	public static String isUserType = "SELECT usertype from project_schema.bankApp_register\n"
		     + "WHERE username = ? and password = ?";
	
	public static String isVerifyUsername = "SELECT username, email from project_schema.bankApp_register ;" ;
	

}
