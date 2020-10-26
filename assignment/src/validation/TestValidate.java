package validation;

import java.util.Scanner;

public class TestValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your text");
	
		while(!sc.hasNext("[aeiou]")) {
			
			System.out.println("that is not vowel");
			sc.next();
		}
		
		
		System.out.println("Mukesh --");

	}

}
