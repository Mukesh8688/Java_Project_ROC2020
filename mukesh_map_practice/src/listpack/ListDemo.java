package listpack;

import java.util.List;
import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		
     // ArrayList
		
     System.out.println("ArrayList :");		
		
     List<Integer> al = new ArrayList<>();
     
     al.add(10);
     al.add(20);
     al.add(20);
     al.add(40);
     al.add(null);
     al.add(1, 30 );
     
     System.out.println("al = " + al);
     
     System.out.println("al of toString() = " + al.toString());
     
     System.out.println("al of get() = " + al.get(2));
     
    al.remove(1); // delete
    
    System.out.println("\nAfter Delete ");
    
    System.out.println("al = " + al);
    
    System.out.println("\nUpdate");
    al.set(1, 50);   // update
    
    System.out.println("al = " + al);
    
     
     

	}

}
