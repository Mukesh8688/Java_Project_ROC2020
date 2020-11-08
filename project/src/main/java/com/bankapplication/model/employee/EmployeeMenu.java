package com.bankapplication.model.employee;

import java.util.Scanner;

public class EmployeeMenu {
	
	private Scanner scanner = new Scanner(System.in);
	
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
					 // View Customer Account
					 System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
						   
						 // Creating Bank Account
										
								
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
							 
				
					 // System.out.println("Thank You for interesting ... This option still Under CONSTRUCTION !!!");
					
					
				    break;	 
	
									
						 
				 default:
							 
							
					 System.out.println();
							
					 System.out.println("SORRY !!! .. This is INVALIDE choice Menu Number !!");
					
					 System.out.println();
					
					 System.out.println("PLEASE reenter right choice number ...  Thank YOU");
										
							
					 break;
									
						 
				 }
				    		
		     
		  }while(menuEmployeeChoice != 4);
		  
	
	
	 }


}
