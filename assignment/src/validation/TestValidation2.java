package validation;

import java.util.Scanner;

public class TestValidation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner sc = new Scanner(System.in);
		
        int x=0;
        int y =0;
        String s = "";
        
		System.out.println("Enter your text");
		if(sc.hasNextInt()) {
			System.out.println("This is integer");
			x = sc.nextInt();
			//y = sc.nextInt();
			
		}else {
			System.out.println("This is not integer");
			
			s = sc.next();
		}
	
		System.out.println("your number is : " + x );
		System.out.println("your second number is : " + y );
		System.out.println("This is text is : " + s);
		System.out.println("Mukesh --");

	}

}
