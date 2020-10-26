package interfacepack;

public interface Myinter2 {
	
	int a =1000;
	
	void hello1();
	public abstract void hello2();
	
	public abstract void common();
	
	
	default void methoddefault() {
		
		System.out.println("This is default method inside Interface ");
	}

}
