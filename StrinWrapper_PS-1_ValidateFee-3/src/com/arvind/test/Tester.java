package com.arvind.test;

import com.nt.validate.CheckInfinite;

public class Tester {
	public static void main(String[] args) {
		CheckInfinite checkInfinite = new CheckInfinite();
		System.out.println(checkInfinite.validateFees(100d));
//		System.out.println(checkInfinite.validateFees(100d/0));
	}// main

}// class
