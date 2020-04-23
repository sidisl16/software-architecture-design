package com.sid.learning.adapter.pattern;

public class BicycleAdapter implements Vehicle {

	private Bicycle bicycle;

	public BicycleAdapter(Bicycle bicycle) {
		this.bicycle = bicycle;
	}

	@Override
	public void accelerate() {
		bicycle.go();
	}

}
