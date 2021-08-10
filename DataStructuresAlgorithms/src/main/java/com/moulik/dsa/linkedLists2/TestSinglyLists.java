package com.moulik.dsa.linkedLists2;

import com.moulik.dsa.bean.Book;

public class TestSinglyLists {

	public static void main(String[] args) {
			
		SinglyLinkedList<Book> books = new SinglyLinkedList<>();
		Book b1 = new Book("Harry Potter 1", 42.00, 223);
		Book b2 = new Book("Harry Potter 2", 42.00, 251);
		Book b3 = new Book("Harry Potter 3", 42.00, 317);
		Book b4 = new Book("Harry Potter 4", 42.00, 636);
		Book b5 = new Book("Harry Potter 5", 42.00, 766);
		Book b6 = new Book("Harry Potter 6", 42.00, 607);
		Book b7 = new Book("Harry Potter 7", 42.00, 607);
		
		books.insert(b1); books.insert(b2); books.insert(b3);
		books.printAllBooks();
		System.out.println("-----------------");
		
		//books.insertAtIndex(3, b4);	//Will give an Exception since elements are 3 and max index can be 2
		//books.insertAtIndex(-2, b6);	//Will give an Exception since elements are 3 and min index can be 0
		books.insertAtIndex(2, b6);
		books.printAllBooks();
		System.out.println("-----------------");
		
		books.removeFirst();
		books.printAllBooks();
		System.out.println("-----------------");
		
		books.removeLast();
		books.printAllBooks();
		System.out.println("-----------------");
		
		books.insert(b3);
		books.insert(b4);
		books.printAllBooks();
		System.out.println("-----------------");
		
		Book x = books.removeAtIndex(2);
		System.out.println("Removed "+x);
		books.printAllBooks();
		System.out.println("-----------------");

	}

}
