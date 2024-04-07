package com.learning.core.day1session1;

public class D01P01 {
	public static void main (String [] args ) {
		String title="Java Programming";
		double price=350;
		
		Book book=new Book(title,price);
		//book.createBook(title, price);
		book.showBook(book);
		
	}

}

class Book {
	
	private String book_title;
	private double book_price;
	
	public String getBook_title() {
		return book_title;
	}
	
		
	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public Book(String book_title, double book_price) {
		super();
		this.book_title = book_title;
		this.book_price = book_price;
	}



	public static Book createBook(String title, double price) {
		
		return new Book(title, price);
		
	}
	
	public static void showBook(Book book) {
		
		System.out.println("book title :"+ book.getBook_title());
		
		System.out.println("book price :"+ book.getBook_price());
	
	}
	
}

	

