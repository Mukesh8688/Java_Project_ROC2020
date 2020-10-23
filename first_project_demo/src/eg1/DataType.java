package eg1;

public class DataType {

	public static void main(String[] args) {
		
     // data types
		
		byte a = 1;
		System.out.println("a = "+ a);
		
		short b = 23;
		System.out.println("b = " + b);
		
		int c = 234;
		System.out.println("c =" + c);
		
		long l = 998844434;
		System.out.println("l ="+l);
		
		float f = 98.34f;
		System.out.println("f =" +f);
		
		double d = 345.564d;
		System.out.println("d = "+d);
		
		char ch = 'M';
		System.out.println("ch = "+ ch);
		
		boolean isTrue = false;
		System.out.println("isTrue =" + isTrue);
		
		
		
		// casting
		
		c = b ; // implicity casting small to larger
		
		System.out.println(" c = " + c);

		
		b = (short)l;    // Explicity casting larger to smaller
		
		System.out.println("b = " + b);
	}
	
	public void nonStatic() {
		
		System.out.println("This is package eg1 method");
	}

}
