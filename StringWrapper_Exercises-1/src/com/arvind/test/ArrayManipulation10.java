package com.arvind.test;

public class ArrayManipulation10 {

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c' };
		char[] ch1 = removerCharacter(ch, 'c');
		for (char ch2 : ch1)
			System.out.println(ch2);
	}

	public static char[] removerCharacter(char[] array, char ch1) {
		int count = 0;
		char[] newarray = new char[array.length - 1];
		for (int i = 0, k = 0; i < array.length; i++) {
			if (array[i] == ch1) {
				continue;
			}
			newarray[k++] = array[i];
		}
		return newarray;
	}

}
