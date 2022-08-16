package com.moulik.dsa.stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;


/**
 * In this stack, we are adding/removing elements at the end of the list.
 */
public class StackFromLL<T> implements Iterable<T> {
	
	private LinkedList<T> list = new LinkedList<>();
	
	public StackFromLL() {}
	
	public StackFromLL(T t) {
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
