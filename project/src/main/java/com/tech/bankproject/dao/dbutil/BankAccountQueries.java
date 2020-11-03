package com.tech.bankproject.dao.dbutil;

public class BankAccountQueries {
	
	public static String registerUsername = "INSERT INTO project_schema.bankApp_register\n"
			+ "(username,password, email)\n"
			+ "VALUES(?, ?, ?);" ;
	
	
	public static String isValide = "SELECT id from project_schema.bankApp_register\n"
			     + "WHERE username = ? and password = ?";

}
