package homework2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



/*
 * SD2x Homework #2
 * Implement the method below according to the specification in the assignment description.
 * Please be sure not to change the method signature!
 */

public class HtmlValidator {
	
	public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {

		/* IMPLEMENT THIS METHOD! */
		Stack<HtmlTag> stack = new Stack<HtmlTag>();
		
		stack.addAll(tags);

		return stack; // this line is here only so this code will compile if you don't modify it
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			queue.add(i);
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.addAll(queue);
		
		System.out.println(stack + " " + queue);
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
			System.out.println(queue.poll());		
		}
	}
	

}

