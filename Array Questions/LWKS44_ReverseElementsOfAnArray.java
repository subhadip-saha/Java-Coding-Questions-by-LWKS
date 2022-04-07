//Java Program to reverse the elements in array?

package array_questions;

import java.util.Stack;

public class LWKS44_ReverseElementsOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an empty Stack
		Stack stack = new Stack();
		
		// Use add() method to add elements
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);
        
        // Removing elements using pop() method
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		// Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stack);
                                            
		
	}

}
