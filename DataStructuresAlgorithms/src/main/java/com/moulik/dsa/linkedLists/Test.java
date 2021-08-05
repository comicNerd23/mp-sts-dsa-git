package com.moulik.dsa.linkedLists;

import com.moulik.dsa.bean.Book;

public class Test {

	public static void main(String[] args) {
		//SinglyLinkedList<Book> books = new SinglyLinkedList<Book>();
		DoublyLinkedList<Book> books = new DoublyLinkedList<Book>();
		Book b1 = new Book("Harry Potter 1", 42.00, 217);
		Book b2 = new Book("Harry Potter 2", 42.00, 297);
		Book b3 = new Book("Harry Potter 3", 42.00, 317);
		Book b6 = new Book("Harry Potter 6", 42.00, 617);
		Book b7 = new Book("Harry Potter 7", 42.00, 647);
		books.insert(b1); books.insert(b2); books.insert(b3);
		books.printAllBooks();
		System.out.println("-----------------");
		Book b4 = new Book("Harry Potter 4", 42.00, 417);
		books.insertAtIndex(3, b4);
		books.insertAtIndex(1, b6);
		books.insertFirst(b7);
		books.printAllBooks();

	}

}
