package com.bankapplication.dao.dbutil;

public class BankAccountQueries {
	
	public static String registerUsernameEmployee = "INSERT INTO project_schema.bankApp_register\n"
			+ "(username,password, email,usertype)\n"
			+ "VALUES(?, ?, ?,?);" ;
	
	
	public static String isValide = "SELECT id,username,password,email,usertype from project_schema.bankApp_register\n"
			     + "WHERE username = ? and password = ?";
	
	
	public static String isUserType = "SELECT usertype from project_schema.bankApp_register\n"
		     + "WHERE username = ? and password = ?";
	
	public static String isVerifyUsername = "SELECT username, email from project_schema.bankApp_register ;" ;
	
	
	
	public static String insertBankAccount = "INSERT INTO project_schema.bank_account\n"
			+ "(balance, openingbalance, accountname, customers_customerid, dateopened, interest, account_status, accounttype, branchloc)\n"
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);" ;
	
	
	public static String insertCustomerInfo = "INSERT INTO project_schema.bank_customers\n"
			+ "(firstname, lastname, address, city, state, phonenumber, ssn, joindate, customer_registerid, zipcode)\n"
			+ "VALUES(?,?,?,?,?,?,?,?,?,?);";
			
	
	
	public static String insertTranactions = "INSERT INTO project_schema.bank_transactions\n"
			+ "(trans_type, amount, account_accountnumber, total_balance, transactiondate)\n"
			+ "VALUES(?, ?, ?, ?, ?,?);";
	

}
