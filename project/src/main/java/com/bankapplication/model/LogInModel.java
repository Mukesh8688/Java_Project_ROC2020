package com.bankapplication.model;

import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.customer.CustomerMenu;
import com.bankapplication.model.employee.EmployeeMenu;
import com.bankapplication.services.BankServicesInterface;
import com.bankapplication.services.impl.BankSerciesInterfaceImpl;

import java.util.Scanner;



public class LogInModel {
	
	
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	 // create object to interact BankServices
	private static BankServicesInterface bankServicies = new BankSerciesInterfaceImpl();
	
	
	// for load User information
    private static RegisterModel registermodel = new RegisterModel();
	 
     
	 
	 /*
	  * LoginBankApp method
	  * Used for enter Bank Application 
	  * Verify Username and Password
	  * Verify Usertype too like Bank Customer , Bank Employee and Admin
	  */
	 
	 public void loginBankApp() {
		 
		 // asking Username and Password login section
		 registermodel.askingUsernamePassword();
		 
		 
				try {
					
					
					if(bankServicies.isVerifyUsernamePassword(registermodel.getUsername(), registermodel.getPassword())) {
						   
						   System.out.println();
					       System.out.println("You Logged in  Successfully !!");
					       System.out.println();
						
						   int menuUsertype = bankServicies.isVarifyUsertype(registermodel.getUsername(), registermodel.getPassword());
						   
						   
						   
						   /*
						    * switch used for Usertype
						    * 1 For Bank Customer
						    * 2 For Bank Employee
						    * 3 For admin
						    */
						   switch (menuUsertype) {
						   
								
						   case 1: //  Bank Customer
							 
							   
							   CustomerMenu customerMenu = new CustomerMenu();
							   customerMenu.displayCustomerMenu();
							   
							   break;
									
									
									
								
						   case 2: // Bank Employee
			
                               EmployeeMenu employeeMenu = new EmployeeMenu();
                               System.out.println(" ******** WELCOME "+ registermodel.getUsername().toUpperCase()+" ********** ");
                               employeeMenu.displayEmployeeMenu();
							   
									
									
							   break;
									
								
						   case 3: // For Admin
							   
							   System.out.println(" !!! YOU ARE ADMIN USER !!!! ");
							   System.out.println();
							   System.out.println("... Under CONSTRUCTION ...");
							   
									
									
							   break;	
		
								
						   default:
							   
							    System.out.println("Sorry!!!  Username and Password doesn't Exist ... Please Try Again...\n"
								   		+ "OR... Please Contanct Bank Employee !!! \n"
								   		+ "THANK YOU");
							   
							   break;
							
									
								
						   }
						
							
							
								
						
	   
					  }else {
						  
						  System.out.println();
						  throw new BusinessException(" Username and Password don't match ......Please Try Again... \n "
						  		+ "If you aren't existing Bank Customer ... \n "
						  		+ "PLEASE Sign Up first CHOOSE 2 OPTION... \n"
						  		+ " *** THANK YOU ***" );
					  }
				} catch (NumberFormatException | BusinessException e1) {
					  System.out.println();
					  System.out.println(e1.getMessage());
				}
				
				
	 }			
	

}
