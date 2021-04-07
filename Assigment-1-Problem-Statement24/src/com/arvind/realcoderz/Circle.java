package com.arvind.realcoderz;

import java.util.Scanner;

public class Circle {
	private double radius;
	private static final double pi=3.14;
	public Circle() {
		System.out.println("circle 0 param ");
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public int calculateArea(){
		return (int)(pi*radius*radius);
	}
	
}
