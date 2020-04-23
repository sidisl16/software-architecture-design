package com.sid.learning.open.closed;

public class AppClientCode {

	/**
	 * Open/Closed principle states open for extension but closed for modification.
	 * WE SHOULD KEEP AS MUCH EXISTING CODE UNCHANGED AS POSSIBLE
	 * 
	 * We have to design every new module, if we add new behavior we should not
	 * modify existing code.
	 * 
	 * A class should not extend other class explicitly We should have common
	 * interface.
	 * 
	 * We make sure these principles should not violated 1. Strategy pattern
	 * 2.Template pattern
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// Implemented strategy pattern
		SorterManager sorterManager = new SorterManager();
		sorterManager.sort(new InsertionSort());
		sorterManager.sort(new MergeSort());
	}
}
