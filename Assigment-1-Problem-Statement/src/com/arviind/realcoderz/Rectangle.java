package com.arviind.realcoderz;

public class Rectangle {
	private double length;
	private double breadth;
	
	public Rectangle() {
		System.out.println("0 param rectangle ..");
	}
	
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}


	void calculateArea() {
		System.out.println("Area of rectangle \t: "+length*breadth);
	}
}
