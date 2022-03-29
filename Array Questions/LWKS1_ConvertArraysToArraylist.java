/*3 Different ways to convert arrays to Arraylist in Java
Refer: 	https://www.geeksforgeeks.org/conversion-of-array-to-arraylist-in-java/
		https://www.geeksforgeeks.org/arraylist-set-method-in-java-with-examples/
*/
package array_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LWKS1_ConvertArraysToArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colours = {"Red", "Green", "Blue", "Yellow"};
		
		//Method 1: Using Manual method to convert Array using add() method
		List<String> l = new ArrayList<String>(); // or, ArrayList<String> l = new ArrayList<String>();
		for(String value : colours)
			l.add(value);
		System.out.println(l);
		
		System.out.println("------------------------------------------------------------------------");
		
		//Method 2: using Collections.addAll	
		ArrayList<String> al = new ArrayList<>();
		Collections.addAll(al, colours);
		System.out.println(al);
		
		al.add("Purple");				//we can easily add new value also
		al.add("Cyan");
		System.out.println(al);
		
		al.set(2, "SkyBlue");		//we can replace existing element with new element using set(index, new Element) method defined in ArrayList class.
		System.out.println(al);
		
		System.out.println("----------------------------------------------------------------------------");
		
		//Method 3: using Arrays.asList		
		List list = Arrays.asList(colours);
		System.out.println(list);
		
		list.set(0, "Orange");		//we can replace existing element with new element using set(index, new Element) method defined in ArrayList class. 
		System.out.println(list);
		
		/*list.add("sky");						//Since returned List is fixed-size List, we can’t add more element(s)
		System.out.println(list);				//Runtime error: UnsupportedOperationException*/
		
		//It is therefore recommended to create new ArrayList and pass Arrays.asList(array reference) as an argument to it	
		ArrayList<String> arrli = new ArrayList<String>(list);
		arrli.add("Pink");
		arrli.add("White");
		System.out.println(arrli);
		

		

		

	}

}
