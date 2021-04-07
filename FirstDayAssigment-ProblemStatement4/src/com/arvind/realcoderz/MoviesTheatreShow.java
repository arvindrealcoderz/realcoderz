package com.arvind.realcoderz;

import java.util.Scanner;

public class MoviesTheatreShow {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter fixed cost of the ticket ");
		double fcost=sc.nextDouble();

		System.out.print("Enter variable cost of ticket ");
		double vcost=sc.nextDouble();
		
		System.out.print("Enter rate of ticket ");
		double rate=sc.nextDouble();
		
		
		double gs=profit(fcost,vcost,rate);
		System.out.println("Profit are   "+gs);
		
		
	}

	public static double profit(double fcost, double vcost, double rate) {
		return (fcost-vcost)*rate;
	}
}
