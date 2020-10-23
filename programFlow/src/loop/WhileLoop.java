package loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How manytime do you want try :");
        int count = scanner.nextInt();
        
        while(count>0) {
        	
     
		
				System.out.print("Enter your number :");
				int num = scanner.nextInt();
				
				
				// if else if condition
				if(num > 0 && num < 100) {
					System.out.println("You are in between 0 to 99");
				} else if (num < 100 && num < 200) {
					System.out.println("You are in between 101 to 199");
				}else {
					
					System.out.println("You aren't lucky !!! Try another day");
				}
				
				
				
				// nested if condition
				
				if(num>0 && num < 100) {
					
					if(num%2 == 0) {
						System.out.println("This is even number between 0 to 99");
					}else {
						System.out.println("This is odd number between 0 to 99");
						
					}
				}
				
				
				// switch condition
				
				switch (num) {
				case 10:
					System.out.println("You are lucky");
			
					break;
					
				case 20:
					System.out.println("You are lucky");
			
					break;
		
				default:
					System.out.println("Sorry !! Try Next Time");
					break;
				}
				
				
				count--;
				
		
        }
		
		

	}

}
