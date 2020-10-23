package stringbuilderbuffer;

import java.util.Arrays;

public class LastCharUpper1 {
	
	public static void main(String[] args) {
		
		String s = "hello mukesh kumar chaudhary";
		
		StringBuilder sb = new StringBuilder();
		
		
		
	    String arr[] = s.split(" ");
	    
	    System.out.println( Arrays.toString(arr));
	    
	    for(String word : arr) {
	    	
	    	sb.append(word.substring(0, word.length()-1));
	    	sb = sb.append(Character.toUpperCase(word.charAt(word.length()-1))).append(" ");
      }
	    
	    
	    System.out.println();
	    System.out.println("After made upper charter of every word");
	    System.out.println(sb.toString().trim());
	}

}
