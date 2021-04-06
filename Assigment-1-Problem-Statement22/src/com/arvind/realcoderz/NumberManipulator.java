package com.arvind.realcoderz;

import java.util.Scanner;

public class NumberManipulator {
	public  static int reverseNumber(int number){
		int num=number;
		int rev=0;
		while (num!=0) {
			int r= num%10;
			rev=rev*10+r;
			num=num/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ");
		int n=sc.nextInt();
		
		System.out.println("reverse of the  number is "+ reverseNumber(n));
		
	}
	
}
