//How to copy arrays using Arrays.copyOf() method in java?

package array_questions;

import java.util.Arrays;

public class LWKS35_CopyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int originalarr[] = {10,20,30,40,50};
		System.out.println("Original :" + Arrays.toString(originalarr));
		
		//create a copied array of same lengt as that of originalarr
		int copiedarr[] = Arrays.copyOf(originalarr, originalarr.length);	
		
		System.out.println("copy: " + Arrays.toString(copiedarr));
		
		//in this way we can print
		for(int i = 0; i < copiedarr.length; i++)
			System.out.print(copiedarr[i] + ", ");
		//or, System.out.print(copiedarr[i] + ' ');
	}

}
