package com.sid.learning.observer.pattern;

public class WeatherObserver implements Observer {

	public WeatherObserver(Subject subject) {
		subject.addObserver(this);
	}

	@Override
	public void onUpdate(int pressure, int humidity, int temperature) {
		System.out.println("Pressure: " + pressure + " Humidity: " + humidity + " Temperature: " + temperature);
	}
}
