package com.arvind.realcoderz;

import java.util.Scanner;

public class PrimeChecker {
	static boolean checkPrime(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				count++;
		}
		return count == 0 ? true : false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ");
		int n=sc.nextInt();
		if(checkPrime(n))
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
		
			
		System.out.println();
	
	}

}
