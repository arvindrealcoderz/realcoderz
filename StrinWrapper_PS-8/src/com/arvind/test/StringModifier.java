package com.arvind.test;

public class StringModifier {
	public static void main(String[] args) {
		System.out.println(StringModifier.insertCharacter("Hello", 'a', 2));
	}//main
	
	
	
	public static String insertCharacter(String str, char ch, int position) {
		//calculate length of the String 
	    int len = str.length();
	    //create a char array with length+1 size
	    char[] updatedArr = new char[len + 1];
	    str.getChars(0, position, updatedArr, 0);
	    updatedArr[position] = ch;
	    str.getChars(position, len, updatedArr, position + 1);
	    return new String(updatedArr);
	}
}//class
