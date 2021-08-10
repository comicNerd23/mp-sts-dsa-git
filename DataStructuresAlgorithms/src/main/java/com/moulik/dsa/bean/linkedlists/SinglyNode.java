package com.moulik.dsa.bean.linkedlists;

public class SinglyNode<T> {
	
	private SinglyNode<T> next; //Reference to the next pointer
	private T data; //It can be any data type, e.g. String, int, Object etc
	
	public T getData() {
		return data;
	}
	
	public void setData(T t) {
		this.data = t;
	}
	
	public SinglyNode<T> getNext() {
		return next;
	}
	
	public void setNext(SinglyNode<T> t) {
		this.next = t;
	}

}
