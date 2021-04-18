package com.arvind.test;


public class Tester4 {
	public static void main(String[] args) {
		
		
		
	}//main
	int doX(Long x, Long y) {
		return 1;
	}
	int doX(long x , long y) {
		return 2;
	}
	int doX(Integer x, Integer y) {
		return 3;
	}
	int doX(Number x , Number y) {
		return 4;
	}
	//CE :this is not methods overloading 
	// we can not create same name as metghods name
//	void main(String[] args) {
//		new Tester4().go();
//	}
	
	void go() {
		short s=7;
		System.out.println(doX(s, s));
		System.out.println(doX(7, 7));
	}
	
}//class
