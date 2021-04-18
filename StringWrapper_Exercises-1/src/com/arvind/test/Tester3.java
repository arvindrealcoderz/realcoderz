package com.arvind.test;


public class Tester3 {
	public static void main(String[] args) {
		Boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		if (((b1 & b2) | (b1 & b3) & b3)) {
			System.out.println("alpha");
		}
		if (((b1 = false) | (b1 & b2) | (b1 & b3) & b3)) {
			System.out.println("beta");
		}
	}//main
}//class
