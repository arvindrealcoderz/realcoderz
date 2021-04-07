package com.arvind.realcoderz;

public class Tester {
	public static void main(String[] args) {
		int x=0,y=0;
		x=5+y++;
		System.out.println(x+" "+y);// 5 1
		
		x=0;y=0;
		x=5+(++y);
		System.out.println(x+" "+y);// 5 1
		
	}
}
