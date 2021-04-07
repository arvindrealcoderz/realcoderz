package com.arvind.realcoderz;

public class BankAccount{
	private int AccNo;
	private double balance;
	private String accType;
	
	public BankAccount() {
		System.out.println("Bank Acoount 0 param ");
	}
	
	public BankAccount(int accNo, double balance, String accType) {
		AccNo = accNo;
		this.balance = balance;
		this.accType = accType;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getAccNo() {
		return AccNo;
	}
	public double getBalance() {
		return balance;
	}
	public String getAccType() {
		return accType;
	}
	
	@Override
	public String toString() {
		return "BankAccount [AccNo=" + AccNo + ", balance=" + balance + ", accType=" + accType + "]";
	}
	
	double deposit(double amt) {
		return amt+balance;
	}
	
	double withdraw(double amt) {
		return balance-amt;
	}
}
