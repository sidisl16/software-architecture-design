package com.sid.learning.intrfc.segregation;

public class BinarySearchTree implements Tree {

	@Override
	public void findMax() {
		System.out.println("Finding max BST");
	}

	@Override
	public void findMin() {
		System.out.println("Finding min BST");
	}

	@Override
	public void traverse() {
		System.out.println("Traversing BST");
	}

}
