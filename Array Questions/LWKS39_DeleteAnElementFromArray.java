//How to delete an element from array in java?
//Refer: https://www.tutorialspoint.com/How-to-delete-elements-from-an-array

package array_questions;

import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;	//has to include this jar file

public class LWKS39_DeleteAnElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {10,20,30,40,50};
		System.out.println("Original Array:" + Arrays.toString(arr));
		
		//int [] result = ArrayUtils.remove(myArray, 2);
		//System.out.println(Arrays.toString(result))	// [10, 20, 40, 50]
		
	}

}
