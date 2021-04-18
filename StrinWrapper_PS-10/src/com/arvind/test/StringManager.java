package com.arvind.test;

public class StringManager {
	public static void main(String[] args) {
		System.out.println(StringManager.insertString("Hello World", "Java", 'W'));
	}// main

	public static String insertString(String string1, String string2, char ch) {
		int count = 0;
		// create a empty string
		String newstr = "";
		// calculate length of the String
		int length = string1.length();
		for (int i = 0; i < length; i++) {
			// check wether string is match
			if (ch == string1.charAt(i)) {
				newstr += string2;
			} // if
			newstr += string1.charAt(i);
		} // for

		return newstr;
	}
}// class
