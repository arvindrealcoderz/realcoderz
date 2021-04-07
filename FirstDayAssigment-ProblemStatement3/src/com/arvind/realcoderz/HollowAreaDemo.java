package com.arvind.realcoderz;

import java.util.Scanner;

public class HollowAreaDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter hollow outer radius ");
		double outerRadius=sc.nextDouble();

		System.out.print("Enter hollow inner radius");
		double innerRadius=sc.nextDouble();
		
		System.out.print("Enter hollow height");
		double height=sc.nextDouble();
		
		
		double gs=hollowArea(outerRadius,innerRadius,height);
		System.out.println("Area of hollowgram  "+gs);
		
		
	}

	public static double hollowArea(double outerRadius, double innerRadius,double height) {
		 final double pi=3.14;
		double d=pi*((Math.pow(outerRadius, 2))*(Math.pow(innerRadius, 2)))*height;
		return d;
	}
}
