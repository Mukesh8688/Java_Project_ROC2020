package wrapperpack;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer i1 = 10;
		Integer i2 = 10;
		Integer i3 = new Integer(10);
		Integer i4 = 12;
		
		
		System.out.println("i1==i2 :" + (i1==i2));
		System.out.println("i1==i3 :" + (i1==i3));
		System.out.println("i1==i4 :" + (i1==i4));
		
		
		System.out.println("i1.equal(i2) : " + i1.equals(i2));
		System.out.println("i1.equal(i3) : " + i1.equals(i3));
		System.out.println("i1.equal(i4) : " + i1.equals(i4));
		
		
		System.out.println("hashcode of i1 :" + i1.hashCode());
		System.out.println("hashcode of i2 :" + i2.hashCode());
		System.out.println("hashcode of i3 :" + i3.hashCode());
		System.out.println("hashcode of i4 :" + i4.hashCode());
		
		System.out.println(" i1 :" + i1.getClass());
		
		System.out.println("i with toString :" + i1.toString());
		System.out.println("i with parseInt :" + i1.parseInt(i1.toString()));
		
		int a =5;  // primitive datatype
		
		Integer i5 =a; // Autoboxing
		
		System.out.println("a:" + a);
		System.out.println("i5:" + i5);
		
		i5 = 99;
		a =i5;
		
		System.out.println("");
		System.out.println("a:" + a);
		System.out.println("i5:" + i5);
		
		
		
		System.out.println("Convert String to Integer");
		
		String s = "120";
		Integer i6 = Integer.parseInt(s);
		System.out.println("i6 :" + i6);
		
		String s1 = "120mm";
		//Integer i7 = Integer.parseInt(s1);
		//System.out.println("i7 :" + i7);
		
		
		// Any thing can be converted 
		
		int b =300;
		s = b + "" ; // easily converted into string 
		
		System.out.println("s :" + s);
		
		
       // CompareTo methods
		
		System.out.println("CompareTo method");
		Integer i7 = 5;
		System.out.println("i7.comparedTo(100) " + i7.compareTo(100));
		System.out.println("i7.comparedTo(5) " + i7.compareTo(5));
		System.out.println("i7.comparedTo(2) " + i7.compareTo(2));
		
		
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toHexString(20));
		System.out.println(Integer.toOctalString(20));
		
		
		Float f = i7.floatValue();
		System.out.println("f =" +f);
		
		
		// Double, Float and Long
		
		Double d = i7.doubleValue();

		System.out.println("d = " + d);
		
		Long l = i7.longValue();
		System.out.println("l = " + l);
		
		
		
		// ASCII value
		
		char m = 'a';
		char n = 'A';
		
		int x = m;
		int y = n;
		System.out.println("ACII Value \"a\" :" +x );
		System.out.println("ACII Value \"A\" :" +y );
		
		
		
		
		

	}

}
