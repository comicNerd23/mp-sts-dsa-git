package com.moulik.dsa.dynamicArrays;

import com.moulik.dsa.bean.Book;

public class Test {

	public static void main(String[] args) {

		Book b1 = new Book("Harry Potter 1", 42.00, 217);
		Book b2 = new Book("Harry Potter 2", 42.00, 297);
		Book b3 = new Book("Harry Potter 3", 42.00, 317);
		
		/*int size = 2;
		Book[] books = new Book[size];
		books[0] = b1;
		books[1] = b2;
		books[2] = b3;
		
		display(books);*/
		
		DynamicArray<Book> booksDA = new DynamicArray<Book>(2);
		booksDA.add(b1);
		
		booksDA.printAllElements();
		System.out.println("-----------");
		booksDA.add(b2);
		booksDA.printAllElements();
		System.out.println("-----------");
		booksDA.add(b3);
		booksDA.printAllElements();
		System.out.println("-----------");
		booksDA.add(b2);
		booksDA.add(b3);
		booksDA.printAllElements();
	}

	private static void display(Book[] books) {
		for(int i = 0; i<books.length; i++) {
			System.out.println(books[i]);
		}
		
	}


}
