package com.arvind.inheritance;

public class Employee {
	String empid;
	//User defined constructor 
	public Employee() {
		System.out.println("Employee  param constructor");
	}
	//String Param constructor 
	public Employee(String empid) {
		super();//Used to call super class constructor 
		this.empid = empid;
		System.out.println("Name ::"+this.empid);
	}
	
	
	

}
