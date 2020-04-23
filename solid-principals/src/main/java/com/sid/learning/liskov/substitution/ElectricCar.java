package com.sid.learning.liskov.substitution;

public class ElectricCar implements ElectricVehicle {

	@Override
	public void speed() {
		System.out.println("Electric car speed up...");
	}

	@Override
	public void chargeBattery() {
		System.out.println("Electric car charging battery...");
	}

}
