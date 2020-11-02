package com.tech.bankproject.main;


import java.util.Scanner;

public class BankMain {
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println();
		System.out.println("Welcome Bank Application Version 1.0");
		System.out.println("====================================");
		
		
        int n = 0;
        
     
		// Asking existing customer Yes or No before enter main menu option
		System.out.println();
		System.out.println("Are you existing Customer ? ");
		
		do {
		System.out.println();		
		System.out.println("1) Please press 1 for existing Customer");
		System.out.println("2) Please press 2  for  Sign Up ");
		System.out.println("3) Please press 3  EXIT");
		
		n = Integer.parseInt(scanner.nextLine());
		
		switch (n) {
		
		  case 1: //System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
			// For Application Service Menu
		    
		      int menuChoice = 0;
		      do {
		    	 System.out.println(); 
				 System.out.println("Bank Service Menu");
				 System.out.println("-----------------");
				 System.out.println("1) Apply for Account ");
				 System.out.println("2) View Account Balance");
			     System.out.println("3) Exit");
			     
			     menuChoice = Integer.parseInt(scanner.nextLine());
						    
			     // for Bank Service Menu
				 switch (menuChoice) {
					
				 case 1:System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
				   
				 // Creating Bank Account
								
						break;
	      
							
				 case 2:System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
				 
				   // View Account Balance
								
								
					 break;
								
	
							
				 case 3:
					 
					// System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
		
		
								
					 break;

							
				 default:
					 
					 System.out.println("SORRY .. This is INVALIDE choice menu Number !!");
					 System.out.println("Please Reenter right choice number bank Servie Menu ... ");
								
					 break;
							
				 }
		    		
		      }while(menuChoice != 3);	
    
			
			
			break;
			
			
			
			
			
			
	     case 2: System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
	          // For Sign Up 
			
			break;
	     case 3:
	    	 
	    	 break;
	    	 
	    	 

		default:
			System.out.println("Please Retype right option ... Or Type 3 for Exit Application ");
			break;
		}

		
		
        }while(n!=3);
		
		
		System.out.println("THANK YOU for using  Bank Application Versioin 1.0");


	}

}
