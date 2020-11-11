package com.bankapplication.model.employee;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.customer.CustomerMenu;
import com.bankapplication.model.customer.CustomerViewAccBalance;
import com.bankapplication.services.BankServicesInterface;
import com.bankapplication.services.impl.BankSerciesInterfaceImpl;

public class EmployeeMenu {
	
	/* create Bank Services Interface object to access bank services */
	
	private static BankServicesInterface bankServicesInterface = new BankSerciesInterfaceImpl();

	
	private Scanner scanner = new Scanner(System.in);	
	
	/* create object for log4j */
	
	private static Logger logger = Logger.getLogger(CustomerMenu.class);
	

	
	
	public EmployeeMenu() {

	}
	
	public void displayEmployeeMenu() {
		 
		 
		int menuEmployeeChoice = 0;
	    
	    
		  do {   
			   
		    	 System.out.println(); 
				 System.out.println(" Employee Section Menu ");
				 System.out.println("=============================");
				 System.out.println("1) View Customer's Account. ");
				 System.out.println("2) View log of all transaction ");
				 System.out.println("3) Update Customer's Account Status.");
				 System.out.println("4) EXIT ");
				 System.out.println("==============================");
			     System.out.println("Please enter appropriate choice(1-4) :) ");
			     
			     
			     // try catch for Number format Exception
			     try {
			    	 menuEmployeeChoice = Integer.parseInt(scanner.nextLine());
			     }catch(NumberFormatException e) {
			    	 
				    System.out.println();
				   	System.out.println("You didn't choose any option !!!");
			    
			    	 menuEmployeeChoice = 0;
			     }
			     
			     
						    
			     /*
			      * switch used for Bank Services Menu option
			      */
				 switch (menuEmployeeChoice) {
					
				
				 case 1:
			            
					 
					 CustomerViewAccBalance customerviewAccBalance = new CustomerViewAccBalance();
					 int byAccViewChoice = 0;
					 
					 try {
						byAccViewChoice = customerviewAccBalance.askAccoutParametersByEmployee();
						bankServicesInterface.getAllAccountInfoByEmployee(byAccViewChoice, customerviewAccBalance.getAccountNumber());
						
					} catch (BusinessException e) {
						logger.fatal(e.getMessage());
					}					
								
				     break;
			      
							
								
						 
				 case 2:
					 // for view all transaction by account number
							 
					
					 
					 System.out.println("View all transactions by account number:");
					 System.out.println("------------------------------------------");
					 logger.fatal("Enter Account Number : ");
					 int accountNumber = Integer.parseInt(scanner.nextLine());
					 
					 try {
						 
						 
						 bankServicesInterface.getAllTransactionByAccountNumber(accountNumber);
						 
						 
					 }catch(BusinessException e) {
						 
						 logger.info(e.getMessage());
					 }
						 
	
					 
				     break;
										
	
						 
				 case 3:  
					 
					 // Approve or Reject Customer's Account
					 
					 System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
				     
					 System.out.println("Bank Account Status Admin Section :");
					 System.out.println("----------------------------------");
					 logger.fatal("Enter Account Number : ");
					 int accountNumberForStatus = Integer.parseInt(scanner.nextLine());
					 
					 try {
						 
						 
						 bankServicesInterface.changeBankAccountStatus(accountNumberForStatus);
						 
						 
						 
					 }catch(BusinessException e) {
						 
						 logger.info(e.getMessage());
					 }
						    
						  
										
							
				     break;	
							 
							 
							 
							 
						 
				 case 4:
							 
				
					 // EXIT from Employee  Menu		
					 System.out.println("\n");
					logger.fatal("<<=== You are Exit of Employee Menu ===>");
					 System.out.println("<<<== THANK YOU ==>>");
					
					
				    break;	 
	
									
						 
				 default:
							 
							
					 System.out.println();
							
					 System.out.println("SORRY !!! .. This is INVALIDE choice Menu Number !!");
					
					 System.out.println();
				
										
							
					 break;
									
						 
				 }
				    		
		     
		  }while(menuEmployeeChoice != 4);
		  
	
	
	 }


}
