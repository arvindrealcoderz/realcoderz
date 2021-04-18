package com.arvind.test;


public class TryMe5 {
	Integer A;
	int a;
	public TryMe5(int a) {
		this.a=A+a;//java.lang.NullPointerException
		System.out.println(this.a);// null+""+a-->null1
	}
	public static void main(String[] args) {
		
		Integer A=new Integer(1);
		TryMe5 t=new TryMe5(A);
		
	}//main
}//class
