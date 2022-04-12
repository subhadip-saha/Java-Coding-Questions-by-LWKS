//How to search for a value in java array using binarySearchMethod?

package array_questions;

import java.util.Arrays;

public class LWKS34_SearchForAValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,5,1,4,2};
		System.out.println("Before sorting: " + Arrays.toString(arr));
		
		//array elements need to be sorted to use binarySearch(), otherwise it will return undefined value
		Arrays.sort(arr);		
		System.out.println("After sorting: " + Arrays.toString(arr));
		
		//binarySearch() returns the index of the target element is found	
		int index = Arrays.binarySearch(arr, 3);	//2
		//int index = Arrays.binarySearch(arr, 6);	//element 6 is not there, it will give undefined value
		
		
		if(index != -1)
			System.out.println("Element found at: " + index);
		else
			System.out.println("Element not found");
	
		
		
		System.out.println("---------------------------------------------");
		
		//Another Case
		int arr1[] = {1,2,3,4,5,3,2,3,4};		//repeated elements 
		System.out.println("Before sorting: " + Arrays.toString(arr1));
		
		//array elements need to be sorted to use binarySearch(), otherwise it will return undefined value
		Arrays.sort(arr1);		
		System.out.println("After sorting: " + Arrays.toString(arr1));
		
		//If the array contains multiple elements with the specified value, 
		//there is no guarantee which one will be found.
		int index1 = Arrays.binarySearch(arr1, 3);
		
		if(index1 != -1)
			System.out.println("Element found at: " + index1);
		else
			System.out.println("Element not found");
	}

}
