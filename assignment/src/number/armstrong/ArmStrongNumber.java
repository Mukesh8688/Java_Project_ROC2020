package number.armstrong;


import java.util.Scanner;

public class ArmStrongNumber {
	
	
	public static int cube(int n) {
		return n*n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
		
		
	   // declare some varibles
		
		int origNum = n;
		int sum = 0;
		
		while(n!=0) {
			
			int lastNum = n%10;
			
			sum = sum + cube(lastNum);
			
			
			n = n/10;
		}
		
		
		if(sum == origNum) {
			
			System.out.println("ArmStrong  Number ");
		}else {
			System.out.println("Not Arm Strong Number");
		}
				
				
		
		

	}

}
