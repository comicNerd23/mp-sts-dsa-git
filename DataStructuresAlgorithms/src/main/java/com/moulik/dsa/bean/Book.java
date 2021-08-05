package com.moulik.dsa.bean;

import java.math.BigDecimal;

public class Book {
	
	private String name;
	private double price;
	private int pages;
	
	public Book(String name, double price, int pages) {
		super();
		this.name = name;
		this.price = price;
		this.pages = pages;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", pages=" + pages + "]";
	}

	
}
