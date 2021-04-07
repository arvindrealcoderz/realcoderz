package com.arvind.realcoderz;

import java.util.Scanner;

public class Square {

	private double sides;
	
	public Square() {
		System.out.println("square constructor ");
	}
	
	public Square(double sides) {
		super();
		this.sides = sides;
	}



	public int calculateArea(){
		return (int)(sides*sides);
	}
	

}
