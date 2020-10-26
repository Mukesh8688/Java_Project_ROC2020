package interfacepack;

public class Implementor implements Myinter1,Myinter2,Myinter1.InnerInterface {
	
	@Override
	public void method1() {
		
		System.out.println("This is Myinter1 interface method1");
	}
	
	@Override
	public void method2() {
		
		System.out.println("This is Myinter1 interface method2");
	}
	
	
	@Override
	public void hello1() {
		
		System.out.println("This is Myinter2 interface hello1");
	}
	
	
	@Override
	public void hello2() {
		
		System.out.println("This is Myinter2 interface hello2");
	}
	
	@Override
	public void innermethod() {
		
		System.out.println("This is innerInterface method----");
		
	}
	
	@Override
	public void common(){
		
		System.out.println("This is common method of both interface");
		
	}
	
	
}
