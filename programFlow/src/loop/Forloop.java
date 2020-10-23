package loop;
import java.util.Random;

//import arraypack.ArraySearch;

public class Forloop {

	public static void main(String[] args) {
	
		
		
		int arr[] = new int[15];
		
		Random rnum = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnum.nextInt(100);
		}
		
		// print through loop
		
		System.out.print("Array Element: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" ");
			System.out.print(arr[i]);
			
		}
		
		System.out.print("\nArray Element Second time:");
		
		for (int i : arr) {
			System.out.print(" ");
			System.out.print(i);
		}
		
		
		// using binary search method from different package
		
		

	}

}
