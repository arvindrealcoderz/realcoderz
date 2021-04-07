package com.arvind.realcoderz;

import java.util.Locale.Category;
import java.util.Scanner;

public class Toy {
	private String categor;
	private double price;
	private double discount;
	
	public Toy() {
		System.out.println("Toy 0 param constructor ..");
	}

	public Toy(String categor, double price, double discount) {
		this.categor = categor;
		this.price = price;
		this.discount = discount;
	}

	public String getCategor() {
		return categor;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public static void main(String[] args) {
		Toy one=new Toy("mango",500, 10);
		Toy two=new Toy("apple",600, 7);
		Toy three=new Toy("Lion",5100, 10);
		Toy four=new Toy("Rabitt",800, 10);
		
		System.out.println(leastPrice(one,two,three,four));	
		
	}

	public static String leastPrice(Toy one, Toy two, Toy three, Toy four) {
		Toy o=one;
		if(two.getPrice()<o.getPrice())
			o=two;
		if(three.getPrice()<o.getPrice())
			o=three;	
		if(four.getPrice()<o.getPrice())
				o=four;
		return o.getCategor();
	}
	
}
