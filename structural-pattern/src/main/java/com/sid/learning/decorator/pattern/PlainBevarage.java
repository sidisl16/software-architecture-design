package com.sid.learning.decorator.pattern;

public class PlainBevarage implements Bevarage {

	@Override
	public int getCost() {
		return 1;
	}

	@Override
	public String getDescription() {
		return "plain";
	}

}
