package com.sid.learning.liskov.substitution;

public class Car implements NormalVehicle {

	@Override
	public void speed() {
		System.out.println("Normal vehicle speed up...");
	}

	@Override
	public void addFuel() {
		System.out.println("Normal vehicle adding fuel...");
	}

}
