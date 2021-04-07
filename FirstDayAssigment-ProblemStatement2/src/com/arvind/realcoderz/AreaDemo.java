package com.arvind.realcoderz;

import java.util.Scanner;

public class AreaDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter basic salary ");
		double basicSalary=sc.nextDouble();

		System.out.print("Enter HRA salary ");
		double hra=sc.nextDouble();

		System.out.print("Enter DA salary ");
		double da=sc.nextDouble();

		System.out.print("Enter pf  ");
		double pf=sc.nextDouble();
		
		double gs=calculateGrassSalary(basicSalary,hra,da,pf);
		System.out.println("Open area are "+gs);
		
		
	}

	public static double calculateGrassSalary(double basicSalary, double hra, double da, double pf) {
		
		return basicSalary*hra*da*pf;
	}
}
