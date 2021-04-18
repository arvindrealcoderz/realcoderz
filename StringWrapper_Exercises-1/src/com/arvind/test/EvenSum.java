package com.arvind.test;

public class EvenSum {
	public static void main(String[] args) {
		int[] i = { 10, 15, 3 };
		System.out.println(getSmallest(i));
	}// main

	public static int getSmallest(int[] elements) {
		// storing first index value to minNum values
		int minNum = elements[0];
		for (int i = 1; i < elements.length; i++) {
			if (minNum > elements[i])
				minNum = elements[i];
		}
		return minNum;
	}

}
