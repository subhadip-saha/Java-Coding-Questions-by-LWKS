//Java Program to check whether an element is present in two arrays in given 3 arrays
//Booking.com

package array_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LWKS6_ElementInAtleastTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//given 3 arrays
		
		Integer arr1[] = {1,2,3,9,8,7};
		Integer arr2[] = {4,1,2,10,15};
		Integer arr3[] = {5,1,2,4,10};
		
		//atfirst we need to get all unique elements from all three arrays, it can be done by HashSet
		//and then add all the elements to this HashSet, atfirst convert arrays into List and then List to Set
		
		//converting those arrays into Integer List
		List<Integer> list1 = Arrays.asList(arr1);
		List<Integer> list2 = Arrays.asList(arr2);
		List<Integer> list3 = Arrays.asList(arr3);
		
		//then adding those unique elements to the Set
		HashSet<Integer> hs = new HashSet<>();
		hs.addAll(list1);
		hs.addAll(list2);
		hs.addAll(list3);
		
		//It contains final list of answers
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		
		//we need to iterate through this HashSet and check those elements present in atleast two arrays and add
		//those elements in the finalList
		
		for(Integer number : hs)
		{
			if((list1.contains(number) && list2.contains(number)) ||
				list2.contains(number) && list3.contains(number) ||
				list3.contains(number) && list1.contains(number))
			{
				finalList.add(number);
			}
		}
		
		System.out.println(finalList);
	}

}
