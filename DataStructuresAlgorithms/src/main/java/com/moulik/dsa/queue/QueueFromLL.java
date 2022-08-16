package com.moulik.dsa.queue;

import java.util.LinkedList;

/**
 * 
 *
 */
public class QueueFromLL<T> {

	private LinkedList<T> list = new LinkedList<>();
	
	public void enqueue(T elem) {
		list.addLast(elem);
	}
	
	public T dequeue() {
		return list.removeFirst();
	}
}
