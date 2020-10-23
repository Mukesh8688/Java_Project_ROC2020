package staticpack;

public class StaticDemo {
	
	
	public static float discount = 9.5f;
	String product ;
	double cost ;

	public static void main(String[] args) {
		
      // example for static demo
		
		StaticDemo obj = new StaticDemo();
		
		
		myStaticMethod();
		
		obj.mynonStaticMethod();
		
		System.out.println("\n\n");
		
		
		// create object for first product
		StaticDemo obj1 = new StaticDemo();
		obj1.product = "TV";
		obj1.cost = 3000.34d;
	
		System.out.println("first obj1 product = " + obj1.product);
		System.out.println("first obj1 cost = " + obj1.cost);
		System.out.println("first obj1 discount = " + discount);
		
		
		
		// create object for second product
		
		System.out.println("\n\n");
		
		discount = 5.8f;
		
		StaticDemo obj2 = new StaticDemo();
		obj2.product = "Mobile";
		obj2.cost = 750.50d;
		
		System.out.println("first obj2 product = " + obj2.product);
		System.out.println("first obj2 cost = " + obj2.cost);
		System.out.println("first obj2 discount = " + discount);
		
		
		
		
		
		
		

	}
	
	public static void myStaticMethod() {
		
		System.out.println(" This is my static void methods");
	}
	
	public void mynonStaticMethod() {
		System.out.println("This is my non static void methods");
	}

	
	
}
