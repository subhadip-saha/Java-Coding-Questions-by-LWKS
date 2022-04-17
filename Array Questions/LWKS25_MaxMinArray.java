//Java Program to find maximum and minimum number in an array 

package array_questions;

import java.util.Scanner;

public class LWKS25_MaxMinArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];		//initialize the array with given size
		
		//iterating through the array for taking the input
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {				//arr.length means size means total no. of elements in the array
			arr[i] = sc.nextInt();
		}
		
		//atfirst initialize max and min to the 0th index element that is first element.
		int max = arr[0], min = arr[0];
		
		//maximum logic- compare each and every element in array with max, if it's greater update the max value
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		//minimum logic- compare each and every element in array with min, if it's lesser update the min value
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}

}
