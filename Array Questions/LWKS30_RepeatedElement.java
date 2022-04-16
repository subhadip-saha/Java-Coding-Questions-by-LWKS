//Java Program to find repeating element in an array 

package array_questions;

public class LWKS30_RepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//value of array should be less than length of the array, otherwise ArrayIndexOutOfBounds exception
		//int arr[] = {5,6,9,4,7,6,9};		
		int arr[] = {5,6,1,4,2,4,1};
		int temp[] = new int[arr.length];		//initially all values of temp array will be 0
		
		for(int i = 0; i < temp.length; i++)
		{
			if(temp[arr[i]] == 1)
				System.out.println(arr[i]);
			else
				temp[arr[i]]++;		
		}
	}

}
