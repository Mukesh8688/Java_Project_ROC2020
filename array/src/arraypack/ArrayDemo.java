package arraypack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {1,2,3,4};
		
		for (int i = 0; i < ar.length; i++) {
			
			System.out.println(i);
			
		}
		
		ar[2] = 100;
		
		for(int x:ar) {
			
			System.out.println(x);
		}
		
		
		
		System.out.println("\n");
		ArraySearch obj = new ArraySearch();
		obj.arraySearch(ar,2);
		
		System.out.println("All elements");
		
		System.out.println(Arrays.toString(ar));
		
		
		ArraySearch.sortArray(ar);
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter position which you want to delete:");
		int pos = scanner.nextInt();
		obj.deleteItem(ar, pos);
		
		
		System.out.println("Array Element After delete:\n");
		System.out.println(Arrays.toString(ar));
	}

}
;