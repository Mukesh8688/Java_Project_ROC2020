package staticpack;

import eg1.DataType;

public class DisplayCalculator {

	public static void main(String[] args) {
	
       Calculator cal = new Calculator();
       
       int sum1 = cal.add(4, 6);
       System.out.println("Sum1=" + sum1);
       
       System.out.println(" Sum2 =" + cal.add(2, 4, 5));
       
       
       System.out.println("Sum 3 ="  + cal.add(34.23f, 32.45f));
       
       Calculator.add(4, 2, 5, 3);
    		   
       
       
       // display method from package eg1
       
       DataType obj = new DataType();
       
       obj.nonStatic();

	}

}
