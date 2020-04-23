package com.sid.learning.facade.pattern;

public class App {

	/**
	 * This pattern provides a unified interface to a set of interfaces in a system
	 * 
	 * It defines a high level interface that makes the subsystem easier to use
	 * 
	 */
	public static void main(String[] args) {

		SortingManager manager = new SortingManager();
		manager.doBubbleSort();
		manager.doMergeSort();
		manager.doQuickSort();
	}
}
