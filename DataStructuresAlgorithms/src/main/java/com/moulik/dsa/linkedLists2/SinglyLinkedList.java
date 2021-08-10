package com.moulik.dsa.linkedLists2;

import com.moulik.dsa.bean.linkedlists.SinglyNode;

/**
 * 	A LL is a sequential list of nodes that hold data and that point to other nodes also containing data.
 *	
 *	They are used in:
 *	1. List, Queue and Stack implementations
 *	2. Great for creating circular lists
 * 	3. Can easily model real world objects like trains
 * 	4. Used in seperate chaining, which is present in certain hashtable implementations to deal with hashing collisions.
 * 	5. often in implementation of adjacency lists for graphs.
 * 
 * 	34	------> 84 ---------> 21 -------> 90 -------> 29 ------> 30 ------> null
 * 	HEAD			Pointer				Node(s)					Tail
 * 
 * 	SinglyLinkedLists hold a reference only to the next node.
 * 	DoublyLinkedLists hold a reference to the next and the previous node.
 * 
 * 	In both of the LLs, you need a reference to the head and tail node to do quick additions/removals (from both ends in DoublyLLs).
 * 		
 * 	
 */
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
	
	/**
	 * 	This method inserts a value 't' at a particular index 'index'. It will throw IndexOutOfBoundsException if index entered is not correct.
	 * 	Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
	 * 
	 * node1 ----> node2 ----> node3 ----> node4 ----> null
	 * 
	 * insertAtIndex(2):
	 * 
	 * node1 ----> node2 ----> newNode ----> node3 ----> node4 ----> null
	 * 
	 * We need two variables to traverse because we can't traverse back.
	 * 
	 * @param index	: The index at which node needs to be inserted. It is 0-based, so it can be 0,1,2...n-1 and n (for last position)
	 * @param t		: The value of the node
	 */
	public void insertAtIndex(int index, T t) {
		if (size == 0) {
			if(index == 0) {
				insertFirst(t);
			} else {
				throw new IndexOutOfBoundsException("Index is incorrect"+index);
			}
		} 
		if (size > 0) {
			if (index == 0) {
				insertFirst(t);
			} else if (index == size) {
				insertLast(t);	//insertLast(t) is equal to insertAtIndex(size, t)
			} else if (index > size || index < 0) {
				throw new IndexOutOfBoundsException("Index is incorrect:"+index);
			} else {
				SinglyNode<T> newNode = new SinglyNode<T>();
				SinglyNode<T> prevNode = null;
				SinglyNode<T> nodeAtIndex = null;
				newNode.setData(t);
				int m = 1;
				
				//For each node, we have to find the place for index. That is, the node at index and node before index
				//We use element m = 1 to traverse the list since there is no index in LinkedList. So m++ if it is not position for index-1
				for(SinglyNode<T> i = head.getNext(), j = head; i != null; i=i.getNext(), j = j.getNext()) {
					if(m == index) {
						nodeAtIndex = i;
						prevNode = j;
						break;
					} else {
						m = m+1;
					}
				}
				prevNode.setNext(newNode);
				newNode.setNext(nodeAtIndex);
				++size;
			}
		}
	}
	
	
	/**
	 * node1 ----> node2 ----> node3 ----> node4 ----> null
	 * 
	 * removeAtIndex(2):
	 * 
	 * node1 ----> node2 ----> node4 ----> null
	 *
	 * We need two variables to traverse because we can't traverse back.
	 *
	 * @param index: the position at which it the node is removed
	 */
	public T removeAtIndex(int index) {
		SinglyNode<T> nodeAtIndex = null; //Node to remove. i is used to find node to remove.
		SinglyNode<T> previousNode = null; //j is used to find previous node
		int m = 1; //Since the loop is starting from 1st element, not 0th element
		if(size == 0) {
			throw new IndexOutOfBoundsException("List is already empty");
		}
		if(index == 0) {
			removeFirst();
		} else if( index == size) {
			removeLast();
		} else if( index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Invalid Index");
		} else {
			
			for(SinglyNode<T> i = head.getNext(), j = head; i != null; i = i.getNext(), j = j.getNext()) {
				if(m == index) {
					previousNode = j;
					nodeAtIndex = i;
					break;
				} else {
					m = m+1;
				}
			}
			previousNode.setNext(nodeAtIndex.getNext());
			size--;
			
		}
		return nodeAtIndex.getData();
	}
	
	public T removeFirst() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("List is already empty");
		}
		SinglyNode<T> node = head; //Node to remove
		head = head.getNext();
		size--;
		return node.getData();
	}
	
	public T removeLast() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("List is already empty");
		}
		SinglyNode<T> node = tail; //Node to remove
		SinglyNode<T> lastButOneNode = null;
		for(SinglyNode<T> i = head; i != tail; i = i.getNext()) {
			if(i.getNext() == tail) {
				lastButOneNode = i;
				break;
			}
		}
		lastButOneNode.setNext(null);
		tail = lastButOneNode;
		size--;
		return node.getData();
	}
	
	
	public void printAllBooks() {
		for(SinglyNode<T> i = head; i != null; i=i.getNext()) {
			System.out.println(i.getData());
		}
	}

}
