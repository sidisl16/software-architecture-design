package com.sid.learning.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	private List<Observer> observers;
	private int pressure;
	private int humidity;
	private int temperature;

	public WeatherStation() {
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.onUpdate(pressure, humidity, temperature);
		}
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObserver();
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObserver();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyAllObserver();
	}
}
