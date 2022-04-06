// How to sort elements in array in asc and desc order in java?

package array_questions;

import java.util.Arrays;
import java.util.Collections;

public class LWKS17_SortingOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"n", "z", "b", "m", "y", "a"};
		
		System.out.println("Before sorting: ");
		for(String value : str)
			System.out.print(" " + value);
		
		System.out.println();
		
		System.out.println("After sorting in ascending order: ");
		Arrays.sort(str);
		for(String value : str)
			System.out.print(" " + value);		
		
		System.out.println();
		
		System.out.println("After sorting in descending order: ");		
		Arrays.sort(str, Collections.reverseOrder());		//comparator
		for(String value : str)
			System.out.print(" " + value);
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		//for integer numbers
		
		Integer arr[] = {33, 2, 58, 1, 56, 34};		//we cannot use int becuase Arrays.sort(arr, Collections.reverseOrder()); will not work
		
		System.out.println("Before sorting: ");
		for(int value : arr)
			System.out.print(" " + value);
		
		System.out.println();
		
		System.out.println("After sorting in ascending order: ");
		Arrays.sort(arr);
		for(int value : arr)
			System.out.print(" " + value);		
		
		System.out.println();
		
		System.out.println("After sorting in descending order: ");		
		Arrays.sort(arr, Collections.reverseOrder());
		for(int value : arr)
			System.out.print(" " + value);
	}

}
