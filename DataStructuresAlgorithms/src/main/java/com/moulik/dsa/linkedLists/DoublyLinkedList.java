package com.moulik.dsa.linkedLists;

public class DoublyLinkedList<T> {
	
	private int size = 0;
	private Node<T> head = null;
	private Node<T> tail = null;
	
	public void insert(T t) {
		insertLast(t);
	}
	
	public void insertFirst(T t) {
		if(size==0) {
			Node<T> node = new Node<T>();
			node.data = t;
			node.next = node.previous = null;
			head = tail = node;
			size++;
			
		} else {
			Node<T> node = new Node<T>();
			node.data = t;
			node.next = head;
			node.previous = null;
			head.previous = node;
			head = node;
			size++;
		}
	}
	
	public void insertLast(T t) {
		if(size == 0) {
			Node<T> node = new Node<T>();
			node.data = t;
			node.next = node.previous = null;
			head = tail = node;
			size++;
		} else {
			Node<T> node = new Node<T>();
			node.data = t;
			node.next = null;
			node.previous = tail;
			tail.next = node;
			tail = node;
			size++;
		}
	}
	
	//0-based
	public void insertAtIndex(int index, T t) {
		if (size == 0) insertFirst(t);
		if(size > 0) {
			if(index == 0) insertFirst(t);
			else if(index == size) insertLast(t);
			else if(index > size) {
				System.out.println("Index out of bounds");
			} else {
				Node<T> node = new Node<T>();
				node.data = t;
				Node<T> temp = null;
				int m = 0;
				for(Node<T> i = head; i != null; i=i.next ) {
					if(index == m+1) {
						temp = i;
						break;
					} else {
						m = m+1;
					}
				}
				node.next = temp.next;
				node.previous = temp;
				temp.next = node;
				temp.next.previous = node;
				size++;
				
			}
		}
	}
	
	public void printAllBooks() {
		for(Node<T> i = head; i != null; i=i.next) {
			System.out.println(i.data);
		}
	}
	
	private class Node<T> {
		
		private T data;
		private Node<T> next;
		private Node<T> previous;
			
	}
	

}
