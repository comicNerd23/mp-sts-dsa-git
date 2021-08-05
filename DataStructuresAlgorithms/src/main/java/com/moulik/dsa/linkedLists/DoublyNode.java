package com.moulik.dsa.linkedLists;

public class DoublyNode<T> {
	
	
	private T data; //It can be any data type, e.g. String, Int, Book etc
	private DoublyNode<T> next; //Reference to the next pointer
	private DoublyNode<T> previous; //Reference to the next pointer
	
	public T getData() {
		return data;
	}
	
	public void setData(T t) {
		this.data = t;
	}
	
	public DoublyNode<T> getNext() {
		return next;
	}
	
	public void setNext(DoublyNode<T> t) {
		this.next = t;
	}

}
