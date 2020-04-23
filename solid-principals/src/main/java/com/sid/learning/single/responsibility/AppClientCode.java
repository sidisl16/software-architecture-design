package com.sid.learning.single.responsibility;

public class AppClientCode {

	/**
	 * Single responsibility principle example. If a class/method does more than one
	 * procedure. It is advisable to change into multiple with help of interfaces. 
	 * 
	 */
	public static void main(String[] args) {
		BookHandler bookHandler = new Book(100, "Sid");
		bookHandler.save();
		bookHandler.print();
	}

}
