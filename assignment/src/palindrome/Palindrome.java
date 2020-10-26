package palindrome;

import java.util.Scanner;


public class Palindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String s = "";
		
		System.out.println("Enter your text:");
		
		if(sc.hasNextInt()) {
			
			// for integer
			System.out.println("This is integer number");
			num = sc.nextInt();
			
			int orgnum = num;
			int temp = 0;
			while(num >0) {
				
				temp = (temp*10) + num%10;
				num = num%10;
			}
			
			if(orgnum == temp) {
				System.out.println("This is palindrom");
			}else {
				System.out.println("This is not palindrom");
			}
			
			
		}else{
			// for text
			System.out.println("This is text");
			 s = sc.next();
			
		    
			StringBuilder sb = new StringBuilder(s);
			
			
			System.out.println(sb.reverse());
			System.out.println(s.equals(sb.reverse().toString()));
			
			
			if(s.equals(sb.reverse().toString())) {
				
				System.out.println("palindrome");
			}else {
				System.out.println("Not palindrome");
			}
        
		}
		
		
		
//		System.out.println();
//		System.out.println("Enter your number:");
//		Integer a = Integer.parseInt(sc.next());
//		
//		
//		String string = a + "";
		

		
		
		sc.close();
	}

}
