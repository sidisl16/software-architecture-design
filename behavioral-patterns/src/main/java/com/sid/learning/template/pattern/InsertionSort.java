package com.sid.learning.template.pattern;

public class InsertionSort extends Algorithm {

	private int[] arr;

	public InsertionSort(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void initialize() {
		System.out.println("initializing... length of an array -> " + arr.length);
	}

	@Override
	public void sorting() {
		int len = arr.length;

		for (int i = 1; i < len; i++) {

			int j = i;
			int temp = arr[i];

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}

	@Override
	public void printResult() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
