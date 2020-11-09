package com.bankapplication.model.customer;


import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.account.BankAccount;
import com.bankapplication.model.account.BankAccountRegister;
import com.bankapplication.services.BankServicesInterface;
import com.bankapplication.services.impl.BankSerciesInterfaceImpl;

public class CustomerMenu {
	
	
	/* create Bank Services Interface object to access bank services */
	
	private static BankServicesInterface bankServicesInterface = new BankSerciesInterfaceImpl();

	
	private Scanner scanner = new Scanner(System.in);	
	
	/* create object for log4j */
	
	private static Logger logger = Logger.getLogger(CustomerMenu.class);
	
	
	
	
	public CustomerMenu() {
		
	}
	
	
	
		
    public void displayCustomeServicerMenu()  {
		 
		 
		int menuCustomeChoice = 0;
	    
	    
		  do {   
			     System.out.println("\n");
			     System.out.println(" ******** WELCOME ********** ");
		    	 System.out.println(); 
				 System.out.println("Bank Application Customer's Services Menu");
				 System.out.println("-----------------------------------------");
				 System.out.println("1) Apply for New Bank Account ");
				 System.out.println("2) View Account Balance");
				 System.out.println("3) Withdraw ");
				 System.out.println("4) Deposit ");
				 System.out.println("5) Balance Transfer");
			     System.out.println("6) Exit");
			     System.out.println("Please enter appropriate choice(1-6) :) ");
			     
			     
			     // try catch for Number format Exception
			     try {
			    	 menuCustomeChoice = Integer.parseInt(scanner.nextLine());
			     }catch(NumberFormatException e) {
			    	 
				    System.out.println();
				    System.out.println("You didn't choose any option !!!");
			    
			    	 menuCustomeChoice = 0;
			     }
			     
			     
						    
			     /*
			      * switch used for Bank Services Menu option
			      */
			
					switch (menuCustomeChoice) {
						
					
					 case 1:
						
						 // Creating Bank Account
						 
						BankAccountRegister bankAccountRegister = new BankAccountRegister();
						CustomerInfo customerInfo = new CustomerInfo();
						 
						 
						boolean isSuccess = false;
						
						try {
							
							bankAccountRegister.askBankAccountDetail(customerInfo);
							
							System.out.println(bankAccountRegister);
							
							isSuccess = bankServicesInterface.applyNewBankAcoount(customerInfo , bankAccountRegister);
							isSuccess = true;
							
						} catch (BusinessException e) {
							
							e.printStackTrace();
						}
						 
						 if (isSuccess == true) {
							logger.fatal("You opened Bank Account Succefully!");
						 }else {
							logger.fatal("Sorry !!! Account haven't been opend yet ... Please Try Again Or Contact Any Local Bank Agent !!");
							System.out.println("...THANK YOU...");
						
						 }
											
									
					     break;
					  
								
									
							 
					 case 2:// for retrieve account balance
								 
						 System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
							 

						 
					     break;
											

							 
					 case 3:  
						 
						 System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
					 
							    
							  
											
								
					     break;	
					     
					 case 4:  
						 
						 System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
					 
							    
							  
											
								
					     break;	
								
								 
					 case 5:  
						 
						 System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
					 
							    
							  
											
								
					     break;	
									 
								 
								 
							 
					 case 6:
						 // EXIT from Customer's Services Menu		
						 System.out.println("\n");
						 System.out.println("<<<== THANK YOU FOR USING SERVICES ==>>");
   
						
					    break;	 

										
							 
					 default:
								 
								
						 System.out.println();
								
						 System.out.println("SORRY !!! .. This is INVALIDE choice Menu Number !!");
						
						 System.out.println();
						
						 System.out.println("Please Reenter right choice number For Bank Servie Menu ...  Thank YOU");
											
								
						 break;
										
							 
					 }
		
				    		
		     
		  }while(menuCustomeChoice != 6);
		  
		
	
	 }
	 
	 
}
