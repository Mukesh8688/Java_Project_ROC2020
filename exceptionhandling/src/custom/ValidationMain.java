package custom;

import java.util.Scanner;


public class ValidationMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		
		int age = Integer.parseInt(scan.next());
		
		
		Validation v = new Validation();
		
		try {
			if(v.isValidAge(age)) {
				System.out.println("Age is valide");
			}
		}catch(BussinessCheckedException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			
			if(v.isValidMobileNumber("+1-7734028688")) {
				System.out.println("Mobile number is validated");
			}
			
			
		}catch(BussinessCheckedException e) {
			
		      System.out.println(e.getMessage());
			
		}


	}

}
