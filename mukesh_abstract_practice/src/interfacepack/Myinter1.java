package interfacepack;

public interface Myinter1 {
	
	int a = 100; // by default static and final
	
	void method1();
	public abstract void method2();
	
	public abstract void common();
	
	
	
	
	public interface InnerInterface{
		
		public abstract void innermethod();
	}

}
