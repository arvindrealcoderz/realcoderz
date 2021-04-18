package com.arvind.test;

public class Tester {
	public static void main(String[] args) {

		String s1=null;
		String s2=null;
		if(s1==s2)
			System.out.println("A");
		if(s1.equals(s2))// it java.lang.NullPointerException
			System.out.println("B");
	}//main
}//class
