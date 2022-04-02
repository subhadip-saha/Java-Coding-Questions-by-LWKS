//Write a java program to create an array by taking input ?

package array_questions;

import java.util.Scanner;

public class LWKS5_CreateArrayByTakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array"); 		//no. of elements you want to store in the array
		int size = sc.nextInt();
		
		int arr[] = new int[size];		//generating an array of that size
		
		System.out.println("Enter the values one by one"); 		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//printing the array elements using classic for loop
		/*for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}*/
		//printing the array elements using enhanced for loop
		for(int value : arr)
			System.out.println(value);
	

		//--------------------------------------------------------------------------------------------------
		//we can take input to array using foreach loop. It successfully executes.
		/*for(int val : arr)
		{
			val = sc.nextInt();
		}	*/
		
		//But at the time of printing, it gives wrong o/p i.e. all 0s because int default value is 0
		
		//we can take input to array using foreach loop. It successfully executes.
		//But at the time of printing, it gives wrong o/p i.e. all null because String default value is null
		
		/*
		String str[] = new String[3];
		 
		for(String val : str)
		{
			val = sc.next();
		}
		
		for(String value : str)
			System.out.println(value);*/
		
		/*
		 *So, can we take input to array using foreach loop?
		 * No, it's not possible. An enhanced for loop gives you copies of the array elements (or the elements of the 
		 * Iterable ) you are iterating over, so assigning values to them doesn't change the original array 
		 * (or Iterable )
		 */

		sc.close();
	}

}
