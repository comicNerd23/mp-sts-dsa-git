package com.moulik.dsa.stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;


/**
 * Stack is a DS where elements are added/removed only from one side (also called Top). It implements LIFO.
 *
 * In this stack, we are adding/removing elements at the end of the list.
 */
public class StackLL<T> implements Iterable<T> {
	
	private LinkedList<T> list = new LinkedList<>();
	
	public StackLL() {}
	
	public StackLL(T t) {
		list.add(t);
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void push(T t) {
		list.addLast(t);
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return list.removeLast();
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return list.peekLast(); 
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	@Override
	public String toString() {
		return "StackLL [" + list + "]";
	}
	
	

}
