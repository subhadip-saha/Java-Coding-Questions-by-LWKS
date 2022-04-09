//How to find common elements from two arrays in java?

package array_questions;

public class LWKS43_CommonElementsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1,2,3,4,5};
		int arr2[] = {3,4,5};
		
		//Iterating arr1
		for(int i = 0; i < arr1.length; i++)
		{
			//Iterating arr2
			for(int j = 0; j < arr2.length; j++)
			{
				//comparing each element of array 1 with array 2
				if(arr1[i] == arr2[j])
					System.out.println(arr1[i]);
			}
		}
	}

}
