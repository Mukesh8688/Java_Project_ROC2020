package overriding;

public class MovileV2 extends MobileV1{
	
	public void messaging() {
		
		System.out.println("Send Message feature in V2");
	}
	
	
	@Override
	public void displayMenu() {
		System.out.println("Mobile menu in V2 is GRID");
	}
	

}
