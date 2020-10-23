package arraypack;

import java.util.Arrays;

public class ArraySearch {
	
	
	public void arraySearch(int arr[], int searchItem) {
		
		boolean flag = false;
		int i;
		
		for ( i = 0; i < arr.length; i++) {
			if(arr[i] == searchItem) {
				flag =true;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("Item found in postion at "+ i);
			
		}else {
			System.out.println("Item didn't find !!");
			
		}
		
		
		System.out.println("Binary Search");
		System.out.println(Arrays.binarySearch(arr, searchItem));
		
		
		

	}
	
	
	public static void sortArray(int arr[]) {
		
		System.out.println(" \nUnsorted Array : " + Arrays.toString(arr));
		
		System.out.println("\n");
		
		System.out.println("Sorted Array : ");
	    Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	}
	
	public void deleteItem(int arr[],int pos) {
		
		int i;
		
		for (i = pos-1; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
			
		}
		arr[i] =0;
	}

}
