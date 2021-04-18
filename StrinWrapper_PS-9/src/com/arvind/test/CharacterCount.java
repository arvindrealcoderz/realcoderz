package com.arvind.test;

public class CharacterCount {
	public static void main(String[] args) {
		System.out.println(CharacterCount.countCharacter("hello", 'l'));
	}// main

	public static int countCharacter(String string, char ch) {
		int count = 0;
		// calculate length of the String
		int length = string.length();
		for (int i = 0; i < length; i++)
			// check wether string is match
			if (ch == string.charAt(i))
				// count number of iteration
				count++;
		return count;
	}
}// class
