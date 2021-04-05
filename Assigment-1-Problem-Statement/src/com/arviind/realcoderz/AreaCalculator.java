package com.arviind.realcoderz;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of rectangle ");
		double length=sc.nextDouble();
		System.out.print("Enter breadth of rectangle ");
		double breadth=sc.nextDouble();
		Rectangle rec=new Rectangle(length,breadth);
		rec.calculateArea();
	}

}
