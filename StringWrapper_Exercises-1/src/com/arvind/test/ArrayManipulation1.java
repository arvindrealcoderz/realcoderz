package com.arvind.test;

public class ArrayManipulation1 {

	public static void main(String[] args) {
		int[] i=changeNumber(new int[] {2,5,6});
		for(int i1:i)
			System.out.print(i1+",");
		System.out.println();
	}
	public static int[] changeNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				array[i] = array[i] - 1;
			else
				array[i] = array[i] + 1;
		}
		return array;
	}
}
