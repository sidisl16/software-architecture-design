package com.sid.learning.decorator.pattern;

public class Milk extends BevarageDecorator {

	private Bevarage bevarage;
	
	public Milk(Bevarage bevarage) {
		super(bevarage);
		this.bevarage = bevarage;
	}
	
	@Override
	public int getCost() {
		return this.bevarage.getCost()+3;
	}
	
	@Override
	public String getDescription() {
		return this.bevarage.getDescription()+" milk";
	}

}
