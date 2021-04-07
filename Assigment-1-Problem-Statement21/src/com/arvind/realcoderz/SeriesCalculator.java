package com.arvind.realcoderz;

import java.util.Scanner;

public class SeriesCalculator {
	public static int calculateSum(int n){
		int sum=0;
		int a=1,d=2;
		sum=(n/2)*(2*a*(n-1)*d);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Sum of the number ");
		int n=sc.nextInt();
		
		System.out.println("sum of nth number is "+ calculateSum(n));
		
	}
}
