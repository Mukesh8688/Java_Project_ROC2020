package validation;


import java.util.Scanner;

public class ValidationInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your character letter for check vowel or not");
		while(!sc.hasNext("[aeiou]")) {
		
		     System.out.println("That is not vowel");
	          sc.next();
		}
		
	
		String s = sc.next();
	
		System.out.println("This is vowel : " + s );
		
		
		System.out.println("Finished");

	}

}
