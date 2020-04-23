package com.sid.learning.decorator.pattern;

public abstract class BevarageDecorator implements Bevarage {

	protected Bevarage bevarage;

	public BevarageDecorator(Bevarage bevarage) {
		this.bevarage = bevarage;
	}

	@Override
	public int getCost() {
		return this.bevarage.getCost();
	}

	@Override
	public String getDescription() {
		return this.bevarage.getDescription();
	}

}
