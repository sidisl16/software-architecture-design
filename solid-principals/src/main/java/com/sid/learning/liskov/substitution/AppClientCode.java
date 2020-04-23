package com.sid.learning.liskov.substitution;

public class AppClientCode {

	/**
	 * Liskov substitution
	 * 
	 * We usually creates hireachy of classes. Sub types must be substitutable with
	 * base class
	 * 
	 * e.g. List<String> list = new ArrayList<>();
	 * 
	 * We can solve this using Template pattern
	 */
	public static void main(String[] args) {
		// NormalVehicle is super type of car
		NormalVehicle normalVehicle = new Car();
		normalVehicle.speed();
		normalVehicle.addFuel();

		// ElectricVehicle is supper type of Electric car
		ElectricVehicle electricVehicle = new ElectricCar();
		electricVehicle.speed();
		electricVehicle.chargeBattery();

	}
}