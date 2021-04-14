package com.arvind.inheritance;

public class Manager extends Employee {
	int salary;
	//its is 0 param constructor not default constructor 
	public Manager() {
			System.out.println("Manager ) param constructor Manager()");
	}
	//int param constructor 
	public Manager(int salary) {
		super();
		this.salary = salary;
		System.out.println("Salary::"+this.salary);
		
	}//close constructor 
	
	
}//class
