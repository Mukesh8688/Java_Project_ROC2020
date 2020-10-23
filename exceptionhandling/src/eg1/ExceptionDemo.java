package eg1;

public class ExceptionDemo {

	public static void main(String[] args) {
		
       int x =10;
       int y = 0;
       
       int res =0;
       
       try {
    	   
    	   res = x/y;
    	   System.out.println("");
    	   
       }catch(ArithmeticException e) {
    	   
    	   System.out.println(" We can't divided by zero");
    	   
       }

	}

}
