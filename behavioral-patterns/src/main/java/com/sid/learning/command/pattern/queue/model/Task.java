package com.sid.learning.command.pattern.queue.model;

public class Task {

	private int id;

	public Task(int id) {
		this.id = id;
	}

	public void solveProblem() {
		System.out.println("Solving problem with id -> " + id);
	}
}
