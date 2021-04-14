package com.arvind.test;

import com.arvind.inheritance.Colorable;
import com.arvind.inheritance.Individual;
import com.arvind.inheritance.Sub;
import com.arvind.inheritance.Super;

public class Tester {
	public static void main(String[] args) {
		System.out.println(new Sub() instanceof Super);
		System.out.println(new Sub() instanceof Colorable);
		System.out.println(new Super() instanceof Sub);
		//System.out.println(new Individual() instanceof Super);--: ncompatible conditional operand types Individual and Super
		
		
	}
}
