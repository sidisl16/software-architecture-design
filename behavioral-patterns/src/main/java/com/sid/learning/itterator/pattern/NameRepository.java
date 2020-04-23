package com.sid.learning.itterator.pattern;

public class NameRepository {

	private String[] names = new String[] { "John", "Doe", "Scott", "Tiger", "Sarah" };

	public Iterator getIterator() {
		return new NameIterator(names);
	}

}
