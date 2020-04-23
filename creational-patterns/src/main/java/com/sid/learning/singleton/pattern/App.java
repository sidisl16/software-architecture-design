package com.sid.learning.singleton.pattern;

public class App {

	/**
	 * 
	 * Singleton Pattern -> restricts the instantiation of a class to one object
	 * This is useful when only one object is needed to coordinate in the system.
	 * 
	 * For example -> Single database instance
	 */
	public static void main(String[] args) {

		Downloader d1 = Downloader.getInstance();
		Downloader d2 = Downloader.getInstance();

		System.out.println(d1 == d2);

		// But the above approach is not safe and requires lots of synchronization
		// Best way to implement this is to use ENUMS

		Counter.INSTANCE.setCounter(10);
		System.out.println(Counter.INSTANCE.getCounter());

	}
}
