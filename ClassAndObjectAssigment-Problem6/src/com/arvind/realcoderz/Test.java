package com.arvind.realcoderz;

import java.util.Scanner;

public class Test {
	private static int accNo;
	private static String accType;
	private static double balance;
	
	public static void main(String[] args) {
		//create scanner class object
		Scanner sc=new Scanner(System.in);
		//read input data 
		System.out.print("Enter Account  Number ");
		accNo=sc.nextInt();sc.nextLine();
		System.out.print("Enter Account Type");
		accType=sc.nextLine();
		System.out.print("Enter Account Balance ");
		balance=sc.nextDouble();
		//create employee class object
		BankAccount bankacc=new BankAccount(10101,45552521.0,"Saving");
		bankacc.deposit(5000);
		System.out.println(bankacc.toString());
		//withdraw the account details
		bankacc.withdraw(5200);
		System.out.println(bankacc.toString());
		
		
	}
}
