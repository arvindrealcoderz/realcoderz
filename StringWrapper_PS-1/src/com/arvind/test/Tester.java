package com.arvind.test;

public class Tester {
	public static void main(String[] args) {
		String stmt="Java is programming language ";
		for(String token:stmt.split("//s"))
			System.out.println(token+" ");
	}
}
