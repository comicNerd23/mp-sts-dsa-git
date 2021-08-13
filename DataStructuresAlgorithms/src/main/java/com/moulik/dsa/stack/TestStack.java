package com.moulik.dsa.stack;

import java.util.Iterator;

public class TestStack {

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
		
		Iterator<Integer> it = stack.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
	}

}
