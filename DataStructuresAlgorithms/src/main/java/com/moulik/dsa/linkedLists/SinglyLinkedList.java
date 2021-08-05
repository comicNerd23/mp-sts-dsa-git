package com.moulik.dsa.linkedLists;

public class SinglyLinkedList<T> {
	
	private int size = 0;
	private SinglyNode<T> head = null;
	private SinglyNode<T> tail = null;
	
	public void insert(T t) {
		insertLast(t);
	}
	
	public void insertLast(T t) {
		if(size==0) {
			SinglyNode<T> node = new SinglyNode<T>();
			node.setNext(null);
			node.setData(t);
			head = node;
			tail = node;
		} else {
			SinglyNode<T> node = new SinglyNode<T>();
			node.setNext(null);
			node.setData(t);
			tail.setNext(node);
			tail = node;
		}
		++size;
	}
	
	public void insertFirst(T t) {
		if(size==0) {
			SinglyNode<T> node = new SinglyNode<T>();
			node.setNext(null);
			node.setData(t);
			head = node;
			tail = node;
		} else {
			SinglyNode<T> node = new SinglyNode<T>();
			node.setData(t);
			node.setNext(head);
			head = node;
		}
		++size;
	}
	
	//Index is 0-based, that is, first position is 0, second is 1 and so on.
	public void insertAtIndex(int index, T t) {
		if (size == 0 && index == 0) insertFirst(t);
		if (size > 0) {
			if (index == 0)
				insertFirst(t);
			else if (index == size)
				insertLast(t);
			else if (index > size) {
				System.out.println("Error. Incorrect Index Found");
			} else {
				SinglyNode<T> node = new SinglyNode<T>();
				node.setData(t);
				int m = 0;
				SinglyNode<T> temp = null;
				for(SinglyNode<T> i = head; i != null; i=i.getNext()) {
					if(m==index-1) {
						temp = i;
						break;
					} else {
						m = m+1;
					}
				}
				System.out.println();
				node.setNext(temp.getNext());
				temp.setNext(node);
				++size;
			}
		}
	}
	
	public T removeAtIndex(int index) {
		
		return null;
	}
	
	public void printAllBooks() {
		for(SinglyNode<T> i = head; i != null; i=i.getNext()) {
			System.out.println(i.getData());
		}
	}

}
