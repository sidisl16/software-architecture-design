package com.sid.learning.decorator.pattern;

public class Sugar extends BevarageDecorator {

	private Bevarage bevarage;

	public Sugar(Bevarage bevarage) {
		super(bevarage);
		this.bevarage = bevarage;
	}

	@Override
	public int getCost() {
		return this.bevarage.getCost() + 5;
	}

	@Override
	public String getDescription() {
		return this.bevarage.getDescription() + " sugar";
	}

}
