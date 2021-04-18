package com.arvind.test;

public class Tester1 {
	public static void main(String[] args) {
		Integer x=1000;
		long y=1000;
		Integer z=1000;
		System.out.println(x==y);
		System.out.println(x==z);//both are pointing to diffrent object
	}// main
}// class
