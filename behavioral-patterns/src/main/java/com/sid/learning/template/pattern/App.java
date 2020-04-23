package com.sid.learning.template.pattern;

public class App {

	/**
	 * In Template pattern, an abstract class exposes defined way / template to
	 * execute its methods
	 * 
	 * Its subclasses can override the method implementation as per need but the
	 * invocation is to be in the same way as defined by an abstract class
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = {1,5,2,8,3,-1};
		Algorithm bubbleSort = new BubbleSort(arr);
		bubbleSort.sort();
		
		int[] arr2 = {1,5,2,8,3,-1};
		Algorithm insertionSort = new InsertionSort(arr2);
		insertionSort.sort();
	}
}
