package com.bankapplication.model.account;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import java.util.Date;
import java.time.LocalDate;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.TriggeringEventEvaluator;

import com.bankapplication.model.customer.CustomerInfo;



public class BankAccountRegister {
	
	/* Setting Date Format MM-dd-yyyy ( Month-days- year) */
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	
	//log4j
	private static Logger logger = Logger.getLogger(BankAccountRegister.class);
	
	
	//Scanner
	Scanner scanner = new Scanner(System.in);
	
	
	// Bank Account variable declaration
	
	private int customerAccountNum ;
	private double balance ;
	private double openingBalance;
	private String accountName;
	private int customerId;
	private Date dateOpened;
	private double interest;
	private int accountStatus;
	private int accountType;
	private String branchLoc;
	
	
	public  BankAccountRegister() {
		
	}
	
	
	
	
	public int getCustomerAccountNum() {
		return customerAccountNum;
	}


   
	/* Database gives Auto Unique AccountNumber */

//	public void setCustomerAccountNum(int customerAccountNum) {
//		this.customerAccountNum = customerAccountNum;
//	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	public double getOpeningBalance() {
		return openingBalance;
	}




	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}




	public String getAccountName() {
		return accountName;
	}




	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}




	public int getCustomerId() {
		return customerId;
	}


   
	/* it's retrieved from customer info account */

//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}




	public Date getDateOpened() {
		return dateOpened;
	}




	public void setDateOpened(Date dateOpened) {
		this.dateOpened = dateOpened;
	}




	public double getInterest() {
		return interest;
	}




	public void setInterest(double interest) {
		this.interest = interest;
	}




	public int getAccountStatus() {
		return accountStatus;
	}




	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}




	public int getAccountType() {
		return accountType;
	}




	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}




	public String getBranchLoc() {
		return branchLoc;
	}




	public void setBranchLoc(String branchLoc) {
		this.branchLoc = branchLoc;
	}

   
	
	public void askAccountType() {
		 System.out.println();
		 System.out.println("Select the Account What you want !!!");
		 logger.fatal("Type 1 - Checking Account :");
		 logger.fatal("Type 2 - Saving Account :");
		 logger.fatal("Type 3 - EXIT ");
		 
		 System.out.println();
		// System.out.println("**** NOTE *** By Default it takes Checking Account****");	   
	}
	
	
	public int verifyAccountType() {
		
		int accType = 3;
	   
		 try {
		    	accType = Integer.parseInt(scanner.nextLine());
		    	logger.error("Accouttype:" + accType);
		    }catch(NumberFormatException e) {
//		        System.out.println("SORRY !! Please choose Integer Number(1-3) *** ");
//		        System.out.println();
		    }
		    	
		return accType;
	}

	
	
	
	
	

	public void askBankAccountDetail(CustomerInfo customerinfo) {
		
		//boolean isVarifyAccount = false;
		
		/* 
		 * Account Number inserted by Auto increatement by Database
		 * Format 7 digit integer length
		 */
		
		/* Before create Any Bank Account 
		 * Asking Account Type
		 * 1 - Checking Account
		 * 2 - Saving Account
		 * 3 - EXIT
		 */
		
		askAccountType();
		
		int accoutType = verifyAccountType();
		
		if(accoutType != 3) {
			
				setAccountType(accoutType);
				logger.trace("AccoutType:" + accoutType);
						
				/* asking customer personal information */
						
				if(accoutType == 1) {
					setAccountName("Checking Account");
					setInterest(0.1);
				}else if(accoutType == 2) {
					setAccountName("Saving Account");
					setInterest(2);
							
				}else {
					setAccountName("None");
					setInterest(0);
				}
		
						
						
				/* Asking Customer personal information */
				customerinfo.askCustomerDetail();
						
						
						
				/* setting balance and opening balance */
						
				logger.fatal("Entere Your Opening Balance Amount : $");
				double openingBalance = Double.parseDouble(scanner.nextLine());
				if(openingBalance > 0) {
				    setBalance(openingBalance);
				    setOpeningBalance(openingBalance);
					logger.trace("opening Balance :$" + getOpeningBalance() );
					logger.trace("Balance :$" + getBalance() );
				}else {
							
					System.out.println("Negetive Amount not allow to open Bank Account !!");
					setBalance(0);
					setOpeningBalance(0);
				}
						
						
				// opended Date
						
				setDateOpened(new Date());
						
						
			   /*
			    * By Default it's 1
			    * 1 - active 
				* 2 - Suspend
			    * 3 - Closed
			    * Employee User have authority to manipulate this status with  proper valid Reasons
			    */
						
				setAccountStatus(1);
						
				/*
				 * On this Bank Application have only one branch now 
				 * format State and Number(4 digit)  e.g  IL0001
				 */
						
						setBranchLoc("IL0001");
						
		}else {
			
			System.out.println("Sorry !!!  You didn't Choose any Account Type !!! ");
			System.out.println("...Please Type Again...");
			System.out.println();
		}
					
	}
	
	
	
	
	@Override
	public String toString() {
		return "BankAccountRegister [customerAccountNum=" + customerAccountNum + ", balance=" + balance
				+ ", openingBalance=" + openingBalance + ", accountName=" + accountName + ", customerId=" + customerId
				+ ", dateOpened=" + dateOpened + ", interest=" + interest + ", accountStatus=" + accountStatus
				+ ", accountType=" + accountType + ", branchLoc=" + branchLoc + "]";
	}




	
	
	
	

}
