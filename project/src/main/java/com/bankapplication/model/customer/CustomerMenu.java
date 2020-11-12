package com.bankapplication.model.customer;


import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.account.BankAccountRegister;
import com.bankapplication.services.BankServicesInterface;
import com.bankapplication.services.impl.BankSerciesInterfaceImpl;

public class CustomerMenu {
	
	
	/* create Bank Services Interface object to access bank services */
	
	private static BankServicesInterface bankServicesInterface = new BankSerciesInterfaceImpl();

	
	private Scanner scanner = new Scanner(System.in);	
	
	/* create object for log4j */
	
	private static Logger logger = Logger.getLogger(CustomerMenu.class);
	
	
	// Bank Account object
	BankAccountRegister bankAccountRegister = new BankAccountRegister();
	
	
	public CustomerMenu() {
		
	}
	
	
	
		
    public void displayCustomeServicerMenu()  {
		 
		 
		int menuCustomeChoice = 0;
	    
	    
		  do {   
			     System.out.println("\n");
			     logger.fatal(" ******** WELCOME ********** ");
		    	 System.out.println(); 
		    	 logger.fatal(" Services Menu ");
		    	 logger.fatal("==============================");
		    	 logger.fatal("1) Apply for New Bank Account ");
		    	 logger.fatal("2) View Account Balance");
		    	 logger.fatal("3) Withdraw ");
		    	 logger.fatal("4) Deposit ");
		    	 logger.fatal("5) Balance Transfer");
		    	 logger.fatal("6) Exit");
		    	 logger.fatal("===============================");
		    	 logger.fatal("Please enter appropriate choice(1-6) :) ");
			     
			     
			     // try catch for Number format Exception
			     try {
			    	 menuCustomeChoice = Integer.parseInt(scanner.nextLine());
			     }catch(NumberFormatException e) {
			    	 
				    System.out.println();
				    logger.fatal("You didn't choose any option !!!");
			    
			    	 menuCustomeChoice = 0;
			     }
			     
			     
						    
			     /*
			      * switch used for Bank Services Menu option
			      */
			
				 switch (menuCustomeChoice) {
						
					
			     case 1:
						
						 // Creating Bank Account
						 
						
						CustomerInfo customerInfo = new CustomerInfo();
						 
						 
						boolean isSuccess = false;
						
						try {
							
							bankAccountRegister = BankAccountRegister.askBankAccountDetail(customerInfo);
							
							//System.out.println(bankAccountRegister);
							
							isSuccess = bankServicesInterface.applyNewBankAcoount(customerInfo , bankAccountRegister);
							
						} catch (BusinessException e) {
							
							System.out.println(e.getMessage());;
						}
						 
						 if (isSuccess == true) {
							logger.fatal("You opened Bank Account Successfully!");
						 }else {
							logger.fatal("Sorry !!!Account haven't been opend yet ... Please Try Again Or Contact Any Local Bank Agent !!");
							logger.fatal("...THANK YOU...");
						
						 }
											
									
					     break;
					  
								
									
							 
				 case 2:// for retrieve account balance
								 
					      CustomerViewAccBalance accountViewBalance = new CustomerViewAccBalance();
					      try {
							accountViewBalance.askAccoutParameter();
							bankServicesInterface.viewAccountBalance(accountViewBalance, CustomerViewAccBalance.choice);
							
						  } catch (BusinessException e) {
							logger.fatal(e.getMessage());
						  }
                          
					      
						 
								 
								 
					     break;
											

							 
				case 3:  
						 
				         /* Withdraw section */
						/* This is Withdraw Bank Services
						* 1 - for withdraw
						* 2 - for deposit
						*/
						 
						 System.out.println();
						 
						 int withdrawTransactionType =1;
						 logger.fatal(" You are in Withdraw Section ");
						 logger.fatal("-----------------------------");
						 
						 try {
							 
							int accountTypeChoice =  bankAccountRegister.getAccountTypeChoice();
							
					        int success = bankServicesInterface.bankTransaction(accountTypeChoice, withdrawTransactionType);
							
						   if(success == 1) {
							  
							   logger.fatal("Your bank transaction successfully done ....");
							
						   }
					
							
						} catch (BusinessException e) {
							logger.fatal(e.getMessage());
						}
						 
						 
							    
							  
											
								
					     break;	
					     
			    case 4:  
						 
						 /* This is a deposit section
							* 1 - for making a withdraw
							* 2 - for making a deposit
							*/
							 
							 System.out.println();
							 
							 int depositTransactionType =2;
							 logger.fatal(" You are in Deposit Section ");
							 logger.fatal("---------------------------");
							 
							 try {
								 
								int accountTypeChoice =  bankAccountRegister.getAccountTypeChoice();
								
						        int success = bankServicesInterface.bankTransaction(accountTypeChoice, depositTransactionType);
								
							   if(success == 1) {
								  
								   logger.fatal("Your bank transaction successfully done ....");
								   logger.fatal("See You Again ...");
							   }
						
								
							} catch (BusinessException e) {
								logger.fatal(e.getMessage());
							}
							 
					 
							    
							  
											
								
					     break;	
								
								 
			   case 5:  
						  
						  // Balance Tranfer  Section
						 
						BalanceTranfer balanceTranfer = new BalanceTranfer();
						int success = 0;
						 
						try {
							
							balanceTranfer = BalanceTranfer.getAllRequiredInfo();
							
							success = BalanceTranfer.transferAmount(balanceTranfer);
							
						} catch (BusinessException e) {
						
							logger.fatal(e.getMessage());
						}
						
					
						 
  						if(success == 1) {
  							
  							logger.fatal("Balance Tranfer Succefully Done ...");
  						}
  		
					     break;	
									 
								 
								 
							 
			  case 6:
						 // EXIT from Customer's Services Menu		
						 System.out.println("\n");
						 logger.fatal("<<<== THANK YOU FOR USING SERVICES ==>>");
   
						
					    break;	 

										
							 
			  default:
								 
								
						 System.out.println();
								
						 logger.fatal("SORRY !!! .. This is INVALIDE choice Menu Number !!");
						
						 System.out.println();
						
						 logger.fatal("Please reenter right choice number For Bank Servie Menu ...  Thank YOU");
											
								
						 break;
										
							 
					 }
		
				    		
		     
		 }while(menuCustomeChoice != 6);
		  
		
	
	 }
	 
	 
}
