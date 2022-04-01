//5 Different ways to print elements in an Array in Java?

package array_questions;

import java.util.Arrays;

public class LWKS4_PrintArrayElements {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub

		int arr1[] = new int{1,2,3};			//wrong syntax
		int arr2[] = new int[]{1,2,3};			//correct syntax
		int arr3[] = {1,2,3};					//correct syntax
		
		
		//creating and initializing array in two lines
		
		//String str[];
		//str = new String[]{"Red", "Green", "Blue", "Yellow"};
		
		//String str[] = new String[4];
		//str =  new String[]{"Red", "Green", "Blue", "Yellow"}; 
		
		
		//creating and initializing array in multi lines
		//String str[] = new String[4];
		//str[0] = "Red";
		//str[1] = "Green";
		//str[2] = "Blue";
		//str[3] = "Yellow";
		
		//creating and initializing array in one line
		//String str[] = new String[]{"Red", "Green", "Blue", "Yellow"};
		String str[] = {"Red", "Green", "Blue", "Yellow"};
		
		System.out.println(str);
		
		It prints [Ljava.lang.String;@5d22bbb7
		In Object class we have toString() method. Whenever we call System.out.println(str); it will call
		Object class's toString() method which in turn calls getClass().getName()+@Interger.hashcode
		So, we cannot directly prints the elements of an array in this way. 
	*/	
		
		
		
		String str[] = {"Red", "Green", "Blue", "Yellow"};
		
		//1. Traditional way before Java 1.5 using for loop
		
		System.out.println("---------using classic for loop---------");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		//2. By using Enhanced for loop - this came after java 5
		
		System.out.println("---------using enhanced for loop(for-each loop)---------");
		for(String value : str) {
			System.out.println(value);
		}
		
		//3. By using Arrays.asList() - we can convert an array into arraylist and we know Collection class overwrites toString() method to print content

		System.out.println("---------using Arrays.asList() method---------");
		System.out.println(Arrays.asList(str));
		
		/*Limitation of this approach: It does not content the elements of array if the array is of primitive type - like int, float, double
		here array is of String type i.e. Object type
		
		int arr[] = {1, 2, 3, 4};
		System.out.println(Arrays.asList(arr));		//o/p: [[I@2d363fb3] */
		
		//4. By using Arrays.toString() method and Arrays.deepToString() to print content
		//It is far best and recommended way of printing values from an array. It comes in Java 5 onwards like static imports, varargs, generics
		//using Arrays.toString() method - prints both primitive types as well as objects for 1-D array
		//using Arrays.deepToString() method - prints both primitive types as well as objects for 2-D array or multidimensional array means Array of arrays(array inside another array)0 in java
		
		int arr[] = {1, 2, 3, 4};
		System.out.println("---------using Arrays.toString() method---------");
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(arr));	
		
		int arr2D[][] = new int[][] {{1, 2, 3},{5, 6, 7}};
		System.out.println("---------using Arrays.deepToString() method---------");
		System.out.println(Arrays.toString(arr2D));		//[[I@2d363fb3, [I@7d6f77cc]
		System.out.println(Arrays.deepToString(arr2D));
		
		//5. By using stream, we can print the array elements
		
		System.out.println("---------using stream method and lambda expresion---------");
		Arrays.asList(str).stream().forEach(s -> System.out.println(s));
		//Another way using streams
		System.out.println("---------another way: using stream method---------");
		Arrays.stream(str).forEach(System.out::println);
	}

}

/*
o/p: 
		---------using classic for loop---------
		Red
		Green
		Blue
		Yellow
		---------using enhanced for loop(for-each loop)---------
		Red
		Green
		Blue
		Yellow
		---------using Arrays.asList() method---------
		[Red, Green, Blue, Yellow]
		---------using Arrays.toString() method---------
		[Red, Green, Blue, Yellow]
		[1, 2, 3, 4]
		---------using Arrays.deepToString() method---------
		[[I@2d363fb3, [I@7d6f77cc]
		[[1, 2, 3], [5, 6, 7]]
		---------using stream method and lambda expresion---------
		Red
		Green
		Blue
		Yellow
		---------another way: using stream method---------
		Red
		Green
		Blue
		Yellow
*/