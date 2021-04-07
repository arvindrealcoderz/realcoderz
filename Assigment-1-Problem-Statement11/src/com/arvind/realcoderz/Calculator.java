package com.arvind.realcoderz;

import java.util.Scanner;

public class Calculator {
	static int calculateSum(int fno, int sno) {
		return fno+sno;
	}
	static int calculateDifference(int fno, int sno) {
		return fno-sno;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int fno=sc.nextInt();
		System.out.println("Enter a number ");
		int sno=sc.nextInt();
		int sum=calculateSum(fno, sno);
		int diff=calculateDifference(fno, sno);
		System.out.println("sum of to number \t: "+sum);
		System.out.println("diffrenec of to number \t: "+diff);
		
		
		
	}

}
