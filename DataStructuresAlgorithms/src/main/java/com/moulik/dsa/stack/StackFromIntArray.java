package com.moulik.dsa.stack;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StackFromIntArray {

	private int[] arr = new int[40];
	private int top = -1;
	
	public StackFromIntArray(int length) {
		this.arr = new int[length];
	}
	public void push(int elem) {
		arr[++top] = elem;
	}
	
	public int pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int[] display() {
		return Arrays.copyOf(arr, arr.length);
	}
	
	public static void main(String[] args) {

		StackFromIntArray newArr = new StackFromIntArray(20);
		System.out.println(newArr.size());
		
		newArr.push(2);
		newArr.push(11);
		newArr.push(7);
		newArr.pop();
		System.out.println("peek:"+newArr.peek());
		//Arrays.stream(newArr.arr).limit(newArr.size()).forEach(System.out::print);
		IntStream.of(newArr.arr).limit(newArr.size()).forEach(x-> System.out.print(x+","));
	}

}
