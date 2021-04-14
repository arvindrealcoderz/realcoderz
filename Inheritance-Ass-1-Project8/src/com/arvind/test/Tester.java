package com.arvind.test;

import com.arvind.inheritance.Car;
import com.arvind.inheritance.Colorable;
import com.arvind.inheritance.Vehicle;

public class Tester {
	public static void main(String[] args) {
		Vehicle a=new 
				Car();
		Colorable i=(Colorable) a;
		Vehicle b=new Vehicle();
		Colorable j=(Colorable)b;
	}

}
