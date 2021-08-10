package com.moulik.dsa.arrays1;

/**
 * Dynamic Arrays are a collection of elements which can grow or shrink in size as required.
 * 
 * Access	-	O(1)
 * Search	-	O(n)
 * Insertion-	O(n)
 * Appending-	O(1)
 * Deletion	-	O(n)
 *
 *	To implement Dynamic Arrays, one way is to use Static arrays
 *	1. Create a static array with an initial capacity
 *	2. Add elements to the underlying static array, keeping track of the number of elements
 *	3. If adding another element will exceed the capacity, then create a new static array with twice the capacity and copy the original elements into it
 * 
 * 	DynamicArrays are similar to ArrayLists in Java
 */
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
	
	public T removeAt(int rm_index) {
		if(rm_index < 0 || rm_index >= len) {
			//Throw IndexOutofBoundsException here
			return null;
		}
		T elem = arr[rm_index];
		for(int i=rm_index;i<len-1;i++) {
			arr[i] = arr[i+1];
		}
		len--;
		actualCapacity--;
		return elem;
	}
	
	public boolean remove(T j) {
		if(indexOf(j) != -1) {
			removeAt(indexOf(j));
			return true;
		}
		return false;
	}
	
	public int indexOf(T j) {
		int x = -1;
		for(int i=0; i<len; i++) {
			if(arr[i]==j) {
				x = i;
				break;
			}
		}
		return x;
	}
	
	public void printAllElements() {
		for(int i=0; i<len; i++) {
			System.out.println(arr[i]);
		}
		
	}
	

}
