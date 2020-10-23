package overriding;

public class MainMobile {

	public static void main(String[] args) {
		
		
		MovileV2 v2 = new MovileV2();   // implicite casting
		
		v2.displayMenu();
		
		
		
		// object casting
		
		MobileV1 v1 = new  MovileV2();
		
		v1.displayMenu();  // before casting
		
		
		// after object casting
		// Explicit casting
		MovileV2 v21 = (MovileV2)v1;
		v21.displayMenu();
		v21.messaging();
		v21.calling();
		
		
		
		

	}

}
