package com.tech.bankproject.main;


import java.util.Scanner;

import com.tech.bankproject.exception.BusinessException;
import com.tech.bankproject.model.RegisterModel;
import com.tech.bankproject.services.BankServicesInterface;
import com.tech.bankproject.services.impl.BankSerciesInterfaceImpl;

public class BankMain {
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 // create object to interact BankServices
		
		BankServicesInterface bankServicies = new BankSerciesInterfaceImpl();
		
		
		System.out.println();
		System.out.println("Welcome Bank Application Version 1.0");
		System.out.println("====================================");
		
		
		int userChoice = 0;
     
		// Asking existing customer Yes or No before enter main menu option
		System.out.println();
		System.out.println("Are you existing Customer ? ");
		
		do {
		System.out.println();		
		System.out.println("1) Existing Customer");
		System.out.println("2) Sign Up ");
		System.out.println("3) Admin");
		System.out.println("4) EXIT");
		System.out.println("Please enter appropriate choice(1-4) :) ");
		
		
		// to prevent from enter event from keyboard
	    try {
		    userChoice = Integer.parseInt(scanner.nextLine());
	    }catch(NumberFormatException e) {
	    	System.out.println("You didn't choose any option !!!");
	    	userChoice = 0;
	    }
	    
	    
	    // for register and login 
	    // Declare username and password variable
	    
	    String username = "";
	    String password = "";
	    
	    
		
		switch (userChoice) {
		
		  case 1: 
					// For Application Service Menu
			  
			  
				      RegisterModel registermodel = new RegisterModel();
				      registermodel.askingUsernamePassword();
				      
								try {
									
									if(bankServicies.isVerifyUsernamePassword(registermodel.getUsername(), registermodel.getPassword())) {
										 
									         System.out.println();
									         System.out.println("You entered Successfully !!");
									         System.out.println();
										      int menuChoice = 0;
										      do {
										    	 System.out.println(); 
												 System.out.println("Bank Service Menu");
												 System.out.println("-----------------");
												 System.out.println("1) Apply for Account ");
												 System.out.println("2) View Account Balance");
												 System.out.println("3) Balance Transfer");
												 
											     System.out.println("4) Exit");
											     System.out.println("Please enter appropriate choice(1-4) :) ");
											     
											     
											     // try catch for choose proper menuChoice variable
											     try {
											         menuChoice = Integer.parseInt(scanner.nextLine());
											     }catch(NumberFormatException e) {
											    	 //System.out.println();
											    	 //System.out.println("please choose right option...!!");
											    	 menuChoice = 0;
											     }
														    
											     // for Bank Service Menu
												 switch (menuChoice) {
													
												 case 1:System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
												   
												 // Creating Bank Account
																
														break;
									      
													
														
												 case 2:// for retrieve account balance
													 System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
												 
												  
																
																
													 break;
																
									
															
										
												 	 
												 case 3:  System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
												    
												  
																
													 break;	
													 
													 
													 
													 
												 case 4:
													 
														// System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
											
											
																	
														 break;	 
					
															
												 default:
													 
													 System.out.println();
													 System.out.println("SORRY !!! .. This is INVALIDE choice Menu Number !!");
													 System.out.println();
													 System.out.println("Please Reenter right choice number For Bank Servie Menu ...  Thank YOU");
																
													 break;
															
												 }
										    		
										      }while(menuChoice != 4);	
					   
									  }else {
										  System.out.println();
										  throw new BusinessException("Username and Password don't match ......Please Try Again");
									  }
								} catch (NumberFormatException | BusinessException e1) {
									  System.out.println();
									  System.out.println(e1.getMessage());
								}
					
					break;
					
					
					
					
					
			
	     case 2: 

	          // For Sign Up 
	    	 
	    	 
	    	 // create RegisterModel object for asking Username and Password input 
	    	 RegisterModel registerModel = new RegisterModel();
	    	 
	    	 System.out.println();
	    	 System.out.println("Welcome Bank Application Version1.0");
	    	 System.out.println();
	    	 
	    	 // taking input username,password and email from console
	    	 registerModel.askingUsernamePasswordEmail();
	    	
	    	 
	    	 int c = 0;
	    	 
	    	 
	    	 try {
	    		 
		    	 c =bankServicies.registerUsername(registerModel.getUsername(), registerModel.getPassword(), registerModel.getEmail());
		    	 
		    	 if(c != 0 ) {
		    		 System.out.println();
		    		 System.out.println("Registration Successfull Done !!");
		    	 }else {
		    		 System.out.println("Please Try Again !!");
		    	 }
	    	 
	    	 }catch(BusinessException e) {
	    		 System.out.println(e.getMessage());
	    	 }
	    	 
			
			break;
			
			
	     case 3:
	    	   System.out.println();
	    	   System.out.println("==== Warning !!! This option is for admin User only =====");
	    	   System.out.println();
			   System.out.println("If you are not admin user . Please type 8 to exit this section == OR == Enter any Number to continue ...");
			   
	           int admin = Integer.parseInt(scanner.nextLine());
	           
	           if(admin !=8) {
	        	   
	        	   System.out.println();
	        	   System.out.println("THANK YOU for your interest .... This is still under CONSTRUCTION .... THANK YOU");
	        	   
	           }else {
	        	   
	        	   break;
	           }
	        	   
	
	    	 
	    	 break;
	    	 
	     case 4: // number 4 for EXIT system
	    	 System.out.println("\n");
	    	 System.out.println("<<<== THANK YOU for using  Bank Application Versioin 1.0 ==>>");
	    	 break;
	    	 
	    	 

		default:
			System.out.println();
			System.out.println("Please Choose Right option ... Or Type 4 for Exit Application ");
			break;
		}

		
		
        }while( userChoice != 4); 
		
		
		


	}

}
