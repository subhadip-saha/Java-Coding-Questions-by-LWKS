/*
 * How to declare,instantiate and initialize array?
 * Refer: 	https://www.educative.io/edpresso/how-to-initialize-an-array-in-java
 * 			https://www.geeksforgeeks.org/arrays-in-java/
 */ 

package array_questions;

public class LWKS2_ArrayInitializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Array Declaration
        int[] array;
        //Array Initialization
        array = new int[]{1,2,3,4,5};
		
        //Initializing array
        int[] array2 = new int[5]; 		//or, int array2[] = new int[5];
        array2 = new int[]{1,2,3,4,5}
        
        ;
		//creating, declaring and initializing an array in a single line.
		int arr[] = {10,60,40,100,20};
		
		//printing array elements using normal for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------------------------------------");
		
		//printing array elements using enhanced for loop - for each loop 
		for(int value : arr)
			System.out.println(value);
	}

}
