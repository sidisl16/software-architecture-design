package com.sid.learning.single.responsibility;

public class BookPersistance {
	
	public void save(Book book) {
		System.out.println("Persisting book -> " + book);
	}
}
