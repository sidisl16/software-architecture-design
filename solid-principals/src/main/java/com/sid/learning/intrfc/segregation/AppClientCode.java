package com.sid.learning.intrfc.segregation;

public class AppClientCode {

	/**
	 * Interface segregation principle
	 * 
	 * Sometimes we have to implement all the methods but we need few, is called
	 * "fat interface".
	 * 
	 * No Client should be forced to implement method that it never use.
	 * 
	 * We should break the interfaces such that it should meet exact needs of the
	 * client
	 *
	 */
	public static void main(String[] args) {

		Tree bst = new BinarySearchTree();
		bst.findMax();
		bst.findMin();
		bst.traverse();

		IBalancedtree bt = new BalancedTree();
		bt.findMax();
		bt.findMin();
		bt.traverse();
		bt.rotateLeft();
		bt.rotateRight();
	}
}
