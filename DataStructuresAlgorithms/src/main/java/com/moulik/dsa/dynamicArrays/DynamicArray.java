package com.moulik.dsa.dynamicArrays;

public class DynamicArray<T> {
	
	public int len; //Filled Elements in the array
	private int actualCapacity; //Total Capacity of the array
	private T[] arr;
	
	public DynamicArray() {
		System.out.println("Setting initial capacity of "+3);
		actualCapacity = 3;
		arr = (T[]) new Object[actualCapacity];
	}
	
	public DynamicArray(int capacity) {
		System.out.println("Setting initial capacity of "+capacity);
		actualCapacity = capacity;
		arr = (T[]) new Object[capacity];
	}
	
	public int size() {
	    return len;
	 }
	
	
	public void add(T t) {
		
		
		if(len+1 > actualCapacity) {
			if(actualCapacity == 0) actualCapacity = 1;
			//Resize the array to double
			actualCapacity = actualCapacity*2;
			T[] newArr = (T[]) new Object[actualCapacity];
			for(int i = 0; i<arr.length; i++ ) {
				newArr[i] = arr[i];
			}
			
			newArr[arr.length] = t;
			len = len+1;
			arr = newArr;
			System.out.println("Actual Capacity Now:"+actualCapacity);
		} else {
			arr[len] = t;
			len = len + 1;
		}
	}
	
	public void printAllElements() {
		for(int i=0; i<len; i++) {
			System.out.println(arr[i]);
		}
		
	}
	

}
