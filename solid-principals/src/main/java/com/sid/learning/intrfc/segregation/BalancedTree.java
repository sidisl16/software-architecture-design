package com.sid.learning.intrfc.segregation;

public class BalancedTree implements IBalancedtree {

	@Override
	public void rotateLeft() {
		System.out.println("Rotating BT left");
	}

	@Override
	public void rotateRight() {
		System.out.println("Rotating BT right");
	}

	@Override
	public void findMax() {
		System.out.println("Finding max BT");
	}

	@Override
	public void findMin() {
		System.out.println("Finding min BT");
	}

	@Override
	public void traverse() {
		System.out.println("Traversing BT");
	}

}
