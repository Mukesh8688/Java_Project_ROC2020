package stringbufferbuilderpack;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer sb = new StringBuffer("hello");
		
		System.out.println( "sb = " + sb);
		
		sb.append(" Mukesh").append(" Kumar").append(" Chaudhary");
		
		System.out.println( "sb = " + sb);
		
		
		sb.insert(1, "Preet");
		
		
		System.out.println(sb);
		
		sb.delete(2,4);
		
		System.out.println(sb);
		
		// reverse 
		System.out.println("Reverse = " + sb.reverse());
		
		
		
		String s = "5";
		System.out.println("String x :" + s.toString());
		
		

	}

}
