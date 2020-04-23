package com.sid.learning.observer.pattern;

public interface Observer {
	public void onUpdate(int pressure, int humidity, int temperature);
}
