package com.moulik.dsa.stack;

import java.util.Iterator;

/**
 * A Stack is a one-ended linear DS which models a real-world stack by having two primary operations: push and pop.
 * 
 * When and where are Stacks used?
 * 1. Used by undo mechanisms in text editors.
 * 2. Used in compiler syntax checking for matching brackets and braces.
 * 3. Can be used to model a pile of books/plates.
 * 4. Used behind the scenes to support recursion by keeping track of previous functions calls.
 * 5. Can be used to Depth-First search on a graph.
 * 
 * Complexity:
 * 		Push		O(1)
 * 		Pop			O(1)
 * 		Peek		O(1)
 * 		Searching	O(n)
 * 		Size		O(1)
 *
 */
public class StackDemo {

	public static void main(String[] args) {

		//StackLL<Integer> stack = new StackLL<>();
		StackFromArrayList<Integer> stack = new StackFromArrayList<>();
		stack.push(6);
		stack.push(9);
		stack.push(21);
		
		System.out.println(stack);
		stack.pop();
		stack.pop();
		System.out.println(stack);
		stack.push(2);
		System.out.println(stack);
		stack.push(4);
		System.out.println(stack);
		
		System.out.println("size:"+stack.size());
		
		Iterator<Integer> it = stack.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
	}

}
