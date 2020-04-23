package com.sid.learning.singleton.pattern;

public enum Counter {

	INSTANCE;

	private int counter;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
