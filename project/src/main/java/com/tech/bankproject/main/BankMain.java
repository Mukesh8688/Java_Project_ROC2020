package com.tech.bankproject.main;

import java.util.Scanner;

import com.tech.bankproject.exception.BusinessException;
import com.tech.bankproject.model.LogInModel;
import com.tech.bankproject.model.SignUpModel;



public class BankMain {
	
	

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println();
		System.out.println("Welcome Bank Application Version 1.0");
		System.out.println("====================================");
		
		
	    int mainMenuChoice = 0; 
     	
		do {
			System.out.println();
	        System.out.println(" **** MAIN MENU **** ");		
		    System.out.println();		
		    System.out.println("1) Log In ");
		    System.out.println("2) Sign Up ");
		    System.out.println("3) Admin");
		    System.out.println("4) EXIT");
		    System.out.println("Please enter appropriate choice(1-4) :) ");
		
		 
		// to prevent from enter event from keyboard
		    try {
		    	mainMenuChoice = Integer.parseInt(scanner.nextLine());
		    }catch(NumberFormatException e) {
		    	System.out.println();
		    	System.out.println("You didn't choose any option !!!");
		    	mainMenuChoice = 0;
		    }
		
		    
			
			switch (mainMenuChoice) {
			
			  case 1: 
				   
				  /*
				   * this option for log in section
				   * For Bank Customer
				   * For Bank Employee
				   * For Admin
				   */
				  
				   LogInModel login = new LogInModel();
				   login.loginBankApp();
				   
					break ;	
						
				
		     case 2: 
	
		          /* For Sign Up Section 
		           * Register Customers' username ,password, email 
		    	  */
		    	 
		    	 
		    	 SignUpModel signup = new SignUpModel();
		    	 try {
		    		 
					signup.bankCustomerSignupMethod();
					
				  } catch (BusinessException e) {
					  
					  System.out.println();
					  System.out.println(" REGISTRATIOM FAIL !!! ");
					  System.out.println(e.getMessage());
					  System.out.println();
					
	
					
				  }
		    	 
		    	
				break;
				
				
		     case 3:
		    	 
		    	 
		    	   System.out.println();
		    	   System.out.println("==== Warning !!! This option is for admin User only =====");
		    	   System.out.println();
				   System.out.println("If you are not admin user . Please type 8 to exit this section == OR == Enter any Number to continue ...");
				   
		           int admin = 0;
		           
		           try {
		             Integer.parseInt(scanner.nextLine());
		           }catch(NumberFormatException e){
		        	   admin = 0;
		           }
		           
		           if(admin !=8) {
		        	   
		        	   System.out.println();
		        	   System.out.println("THANK YOU for your interest .... under CONSTRUCTION ....");
		        	   
		           }else {
		        	   
		        	   break;
		           }
		        	   
		
		    	 
		    	 break;
		    	 
		     case 4: // number 4 for EXIT system
		    	 System.out.println("\n");
		    	 System.out.println("<<<=== THANK YOU FOR USING BANK APPLICATION VERSION 1.0 ===>>");
		    	 break;
		    	 
		    	 
	
			default:
				System.out.println();
				System.out.println("Please Choose Right option ... Or Type 4 for Exit Application ");
				break;
			}

		
		
        }while( mainMenuChoice != 4); 
		
		
		
		scanner.close();

	}
	
	

}
