package com.arvind.realcoderz;

import java.util.Scanner;

public class Triangle {
	private double sides;
	
	public Triangle() {
		System.out.println("Triangle.Triangle()");
	}
	
	
	
	public Triangle(double sides) {
		super();
		this.sides = sides;
	}



	public int calculateArea(){
		return (int)(0.433*sides*sides);
	}
	
}
