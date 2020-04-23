package com.sid.learning.template.pattern;

public class BubbleSort extends Algorithm {

	private int[] arr;

	public BubbleSort(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void initialize() {
		System.out.println("initializing... length of an array -> " + arr.length);
	}

	@Override
	public void sorting() {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	@Override
	public void printResult() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
