//How to reverse the order of elements in collection(arraylist) in java?

package array_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LWKS21_ReverseElementsInACollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Create a collection(arraylist, set) and add all elements into it.		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Before reversing: " + list);
		
		//2. Pass that collection to Collections.reverse() method
		Collections.reverse(list);
		System.out.println("After reversing: " + list);	
	}

}
