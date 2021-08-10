package com.moulik.dsa.linkedLists2;


/**
 * 								PROs															CONs	
 * 	SinglyLL			Use less memory, simpler implementation						Cannot easily access previous elements
 * 	DoublyLL			Can be traversed backwards									Use 2X memory
 * 
 * 
 * 							SinglyLL							DoublyLL
 * 	Search					O(n)								O(n)
 * 	Insert at head			O(1)								O(1)
 * 	Insert at tail			O(1)								O(1)
 * 
 * 	Remove at head			O(1)								O(1)
 * 	Remove at tail			O(n)								O(1)
 * 	Remove in the middle	O(n)								O(n)
 *
 * 
 */
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
	
	/**
	 * This method inserts a value 't' at a particular index 'index'. It will give an IllegalStateException if index entered is not correct.
	 * Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
	 * 
	 * node1 ----> node2 ----> node3 ----> node4 ----> null
	 * 
	 * 
	 * insertAtIndex(2):
	 * 
	 * node1 ----> node2 ----> newNode ----> node3 ----> node4 ----> null
	 * 
	 * @param index	: The index at which node needs to be inserted. It is 0-based, so it can be 0,1,2...n-1
	 * @param t		: The value of the node
	 */
	public void insertAtIndex(int index, T t) {
		if (size == 0) {
			if(index == 0) {
				insertFirst(t);
			} else {
				throw new IllegalStateException("Index is incorrect:"+index);
			}
		}
		if(size > 0) {
			if(index == 0) {
				insertFirst(t);
			} else if(index == size) {
				insertLast(t);	//insertLast(t) is equal to insertAtIndex(size, t)
			} else if(index > size || index < 0) {
				throw new IllegalStateException("Index is incorrect:"+index);
			} else {
				Node<T> newNode = new Node<T>();
				newNode.data = t;
				Node<T> nodeAtIndex = null;
				int m = 0;
				//For each node, we have to find the place for index. That is, the node at index. We don't need previous node since we can traverse backwards
				//We use element m = 0 to traverse the list since there is no index in LinkedList. So m++ if it is not position for index-1
				for(Node<T> i = head; i != null; i = i.next ) {
					if(index == m) {
						nodeAtIndex = i;
						break;
					} else {
						m = m+1;
					}
				}
				newNode.next = nodeAtIndex;
				newNode.previous = nodeAtIndex.previous;
				
				nodeAtIndex.previous.next = newNode;
				nodeAtIndex.previous = newNode;
				size++;
				
			}
		}
	}
	
	public T removeAtIndex(int index) {
		Node<T> node = null; //Node to remove
		int m = 1; //Since the loop is starting from 1st element, not 0th element
		if(size == 0) {
			throw new IndexOutOfBoundsException("List is already empty");
		}
		if(index == 0) {
			return removeFirst();
		} else if( index == size-1) {
			return removeLast();
		} else if( index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Invalid Index");
		} else {
			
			for(Node<T> i = head.next; i != null; i = i.next) {
				if(m == index) {
					node = i;
					break;
				} else {
					m = m+1;
				}
			}
			node.previous.next = node.next;
			node.next.previous = node.previous;
			--size;
		}
		return node.data;
	}
	
	public T removeFirst() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("List is already empty");
		}
		Node<T> node = head; //Node to remove
		head = head.next;
		head.previous = null;
		size--;
		return node.data;
	}
	
	public T removeLast() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("List is already empty");
		}
		Node<T> node = tail; //Node to remove
		tail = tail.previous;
		tail.next = null;
		
		size--;
		return node.data;
	}
	
	public void printAllBooks() {
		for(Node<T> i = head; i != null; i=i.next) {
			System.out.println(i.data);
		}
	}
	
	//A simple DoublyNode with data, next and previous member variables
	private class Node<T> {
		
		private T data;
		private Node<T> next;
		private Node<T> previous;
			
	}
	

}
