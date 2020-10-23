package staticpack;

public class Calculator {
	
	// override polymorphism
	
	public int add(int a, int b) {
		
		return a +b;
	}
	
	public float add(float a, float b) {
		
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		
		return a +b+c;
	}
	
	public static void add(int a, int b, int c, int d) {
		
		int sum = a+b+c+d;
		
		System.out.println(" All sum =" +sum);
	}


}
