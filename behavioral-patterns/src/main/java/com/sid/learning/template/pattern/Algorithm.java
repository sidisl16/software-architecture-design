package com.sid.learning.template.pattern;

//Template abstract class - defined way to do the things
public abstract class Algorithm {

	public abstract void initialize();

	public abstract void sorting();

	public abstract void printResult();

	public void sort() {
		initialize();
		sorting();
		printResult();
	}
}
