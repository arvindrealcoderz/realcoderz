package com.arvind.realcoderz;

import java.util.Scanner;

public class AreaDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter plot length ");
		double length=sc.nextDouble();

		System.out.print("Enter plot width ");
		double width=sc.nextDouble();

		System.out.print("Enter construction area length ");
		double constLength=sc.nextDouble();

		System.out.print("Enter construction area width ");
		double constWidth=sc.nextDouble();
		
		double openArea=calculateArea(length,width,constLength,constWidth);
		System.out.println("Open area are "+openArea);
		
		
	}

	public static double calculateArea(double length, double width, double constLength, double constWidth) {
		double openArea=0;
		openArea=length*width-constLength*constWidth;
		return openArea;
	}
}
