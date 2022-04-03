//Java Program to find the first duplicate occurrence in an array
//Oracle

package array_questions;

public class LWKS7_FirstDuplicateOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//take one element, compare it every other elements in the array
		//if duplicate is found print that and return because we want only one first duplicate element 
		
		Integer arr[] = {1,2,3,4,1,2,7,15,8,7,3,6,5,15};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
					return;		//if return is not used, then it would print all duplicates
				}
			}
		}
		
	}

}
