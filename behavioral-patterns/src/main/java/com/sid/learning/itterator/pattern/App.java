package com.sid.learning.itterator.pattern;

public class App {

	/**
	 * Iterator pattern is very commonly used design pattern in Java !!! This is
	 * used to get a way to access the elements of a collection object in sequential
	 * manner without any need to know its underlying representation
	 * 
	 */
	public static void main(String[] args) {

		NameRepository repository = new NameRepository();

		for (Iterator itr = repository.getIterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
}
