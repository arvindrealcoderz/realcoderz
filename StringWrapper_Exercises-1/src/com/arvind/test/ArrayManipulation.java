package com.arvind.test;

public class ArrayManipulation {
	public static void main(String[] args) {
		System.out.println(getArraySum(new int[] { 5, 4, 3 }));
	}

	public static int getArraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

}
