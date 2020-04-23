package com.sid.learning.adapter.pattern;

public class App {

	/**
	 * 
	 * Adapter pattern -> Converts an interface of a class into Other interface that
	 * client expect.
	 * 
	 * It enables class working together that could not be otherwise because of the
	 * incompatible interfaces
	 * 
	 * Composition is very important !!! favor composition over inheritance
	 * 
	 */
	public static void main(String[] args) {

		Vehicle car = new Car();
		Vehicle bus = new Bus();
		Vehicle bicycle = new BicycleAdapter(new Bicycle());
		
		car.accelerate();
		bus.accelerate();
		//Using adapter
		bicycle.accelerate();
	}
}
