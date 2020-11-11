package com.bankapplication.model.employee;

import java.util.Scanner;

import org.apache.log4j.Logger;

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
				 System.out.println(" Employee Menu ");
				 System.out.println("-----------------");
				 System.out.println("1) View Customer's Account ");
				 System.out.println("2) View logs ");
				 System.out.println("3) Approve or Reject Customer's Account");
				 System.out.println("4) EXIT ");
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
					 // for view logs
							 
					 System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
						 
	
					 
				     break;
										
	
						 
				 case 3:  
					 
					 // Approve or Reject Customer's Account
					 
					 System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
				 
						    
						  
										
							
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
