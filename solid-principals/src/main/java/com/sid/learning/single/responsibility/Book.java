package com.sid.learning.single.responsibility;

public class Book implements BookHandler {

	private int noOfPages;
	private String author;
	private BookPersistance bookPersistance;
	private BookPrinter bookPrinter;

	public Book(int noOfPages, String author) {
		super();
		this.noOfPages = noOfPages;
		this.author = author;
		this.bookPersistance = new BookPersistance();
		this.bookPrinter = new BookPrinter();
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 
	 * Separate the save and print methods. We cannot use saveAndPrint as a single
	 * method.
	 */
	@Override
	public void save() {
		bookPersistance.save(this);
	}

	@Override
	public void print() {
		bookPrinter.print(this);
	}

	@Override
	public String toString() {
		return "Book [noOfPages=" + noOfPages + ", author=" + author + "]";
	}
}
