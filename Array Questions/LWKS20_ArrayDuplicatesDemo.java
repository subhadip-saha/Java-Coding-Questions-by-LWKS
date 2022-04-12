//Write a java program to check whether array contains duplicates

package array_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class LWKS20_ArrayDuplicatesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring an string array
		String str[] = new String[] {"c", "c++", "java", "c"};
		
		//converting the string array to list
		List duplicateList = Arrays.asList(str);
		
		//converting the list to hashset
		Set duplicateSet = new HashSet<>(duplicateList);
		
		//if the list size and set size are not equal we can say array contains duplicates.
		//Because ser doesn't allow duplicates.
		if(duplicateList.size() != duplicateSet.size())
			System.out.println("The array containes duplicates");
		else
			System.out.println("The array does not contain duplicates");
	}

}
