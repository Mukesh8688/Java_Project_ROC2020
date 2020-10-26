package demodefaultstaticpack;

public interface Drawable {
	
	public void draw();
	
	default void method() {
		System.out.println("This is default method in Interface");
	
	}
	
	
	static int cube(int a) {
		return a*a*a;
	}

}
