package com.moulik.dsa.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

/**
 * Stack is a DS where elements are added/removed only from one side (also called Top). It implements LIFO.
 *
 * In this stack, we are adding/removing elements at the end of the list.
 */
public class StackFromArrayList<T> implements Iterable<T> {
	
	private List<T> list = new ArrayList<>();
	
	private int top = -1;
	
	public StackFromArrayList() { }
	
	public StackFromArrayList(int size) {
		list = new ArrayList<>(size);
	}
	
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void push(T t) {
		if(isEmpty()) {
			list.add(t);
			top++;
		} else {
			list.add(top+1, t);
			top++;
		}
	}
	
	public T pop() {
		T t;
		if(isEmpty()) {
			throw new EmptyStackException();
		} else {
			t = list.remove(top);
			top--;
		}
		return t;
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	@Override
	public String toString() {
		return "StackFromArrayList [" + list + "]";
	}
}
