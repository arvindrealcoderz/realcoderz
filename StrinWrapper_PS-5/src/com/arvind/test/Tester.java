package com.arvind.test;

public class Tester {
	public static void main(String[] args) {
		
		String str="java";
		//Create StringBuffer Object
		StringBuffer sb=new StringBuffer("java");
		//sb.insert(9, "prgramming");// java.lang.StringIndexOutOfBoundsException: offset 9, length 4
		System.out.println(sb);
		str.concat("excercise");
		if(sb.length()<6 ||str.equals("java"))
			System.out.println(sb);
		sb.delete(2,7);
		System.out.println(sb);
	}//main
}//class
