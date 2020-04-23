package com.sid.learning.command.pattern.queue.model;

public class App {

	/**
	 * Commands package a piece of computation ... this computation may be invoked
	 * long after the command objects are created
	 * 
	 * - it can be invoked by different threads !!! - schedulers, thread pools, job
	 * queues ...
	 * 
	 */
	public static void main(String[] args) {
		Algorithm algorithm = new Algorithm();

		Thread thread1 = new Thread(() -> {
			algorithm.produce();
		});

		Thread thread2 = new Thread(() -> {
			algorithm.consume();
		});

		thread1.start();
		thread2.start();
	}
}
