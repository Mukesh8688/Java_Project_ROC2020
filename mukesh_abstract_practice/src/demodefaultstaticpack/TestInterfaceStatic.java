package demodefaultstaticpack;

public class TestInterfaceStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Drawable d = new Rectangle();
		
		d.draw();
		
		System.out.println("Cube :" + Drawable.cube(3));
		
		
		Rectangle r = new Rectangle();
		
		//r.cube(3);   this is diamond problem

	}

}
