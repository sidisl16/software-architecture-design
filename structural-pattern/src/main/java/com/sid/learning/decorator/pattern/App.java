package com.sid.learning.decorator.pattern;

public class App {

	/**
	 * 
	 * Important design principle -> classes should open for extension but closed
	 * for modification !!!
	 * 
	 * For example: ObserverPattern we can add new Observers + extend Subject
	 * without adding code to Subject
	 * 
	 * + DECORATOR PATTERN HELPS TO MAKE OPEN CLOSED PRINCIPLE COME TRUE
	 * 
	 * - our goal is to allow classes to be easily extended with new behavior
	 * without modifying existing code - it is good -> FLEXIBLE !!! if the
	 * requirements are changing we do not have to rewrite the whole application
	 * 
	 * - applying the open-closed principle everywhere can lead to hard to
	 * understand code !!!
	 * 
	 * ---------------------------------------------------------------------------------------
	 * 
	 * Decorator Pattern: attaches additional responsibilities to an object
	 * dynamically !!! Decorators provide a flexible alternative to sub classing for
	 * extending functionality
	 *
	 * For example: new LineNumberInputStream(new BufferedInputStream(new
	 * FileInputStream()));
	 */
	public static void main(String[] args) {
		Bevarage bevarage = new Milk(new Milk(new Sugar(new PlainBevarage())));

		System.out.println(bevarage.getCost());
		System.out.println(bevarage.getDescription());
	}
}
