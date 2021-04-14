package com.arvind.test;

public class Tester {
	int x=12;
	static Tester reset(Tester obj) {
		obj=null;
		return obj;
	}
	public static void main(String[] args) {
		Tester o1=new Tester();
		o1=reset(o1);
		System.out.println(o1.x);//NPE :: becouse o1 is null
		
		
		
	}
}//class
