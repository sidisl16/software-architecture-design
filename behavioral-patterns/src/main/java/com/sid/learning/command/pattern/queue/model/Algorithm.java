package com.sid.learning.command.pattern.queue.model;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algorithm {

	private BlockingQueue<TaskSolver> queue;

	public Algorithm() {
		queue = new ArrayBlockingQueue<>(10);
	}

	public void produce() {
		try {
			for (int i = 0; i < 10; i++) {
				queue.put(new TaskSolver(new Task(i)));
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

	public void consume() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				queue.take().execute();
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
