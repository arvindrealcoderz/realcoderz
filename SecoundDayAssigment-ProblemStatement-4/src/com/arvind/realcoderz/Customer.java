package com.arvind.realcoderz;

import java.util.Locale.Category;
import java.util.Scanner;

public class Customer{
	private int custId;
	private long accId;
	private double creditCardCharg;
	
	public Customer() {
		System.out.println("Customer 0 param constructor ");
	}

	public Customer(int custId, long accId, double creditCardCharg) {
		
		this.custId = custId;
		this.accId = accId;
		this.creditCardCharg = creditCardCharg;
	}

	public int getCustId() {
		return custId;
	}

	public long getAccId() {
		return accId;
	}

	public double getCreditCardCharg() {
		return creditCardCharg;
	}
	
	
}