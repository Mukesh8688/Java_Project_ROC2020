package practice_projects;
import java.util.Scanner;



public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your data :");
		
		String word = "madam";
		
		StringBuffer sb = new StringBuffer(word);
		
		sb.reverse();
		
		String wordSecond = sb.toString();
		
		if(word.equals(wordSecond)) {
			
			System.out.println("This is palindrome");
		}else {
			System.out.println("This is not palindrome");
		}
		
		
		
		// For interger
		
		int x = 101;
		
		String s = x + "";
		
	    if(new StringBuffer(s).reverse().toString().equals(s)) {
	    	
	    	System.out.println("This is palindrome");
		}else {
			System.out.println("This is not palindrome");
		}
		
		
		
		
		

	}

}
