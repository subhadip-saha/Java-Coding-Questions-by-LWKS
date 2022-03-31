//How to create an array and add elements in array?

//an array is a container that holds data of single type.
//Array is a fundamental construct which allows to store and access large number of values conveniently.

package array_questions;

public class LWKS3_ArrayCreateAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring and initializing an array
		int arr[] = new int[5];
		
		//adding elements in each index, by default int type array takes value 0 
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 50;
		//arr[4] = 10;
		
		//retrieving array elements
		for(int value : arr)
			System.out.println(value);
		
		System.out.println("------------------------------------------------");
		
		//retrieving array element at index 3
			System.out.println(arr[3]);
	}

}
