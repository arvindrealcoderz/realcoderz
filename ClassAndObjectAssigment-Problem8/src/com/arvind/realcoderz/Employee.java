package com.arvind.realcoderz;

public class Employee{
	
	private int empNo;
	private String name;
	private String dept;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empNo, String name, String dept, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}


	public int getEmpNo() {
		return empNo;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
	
}
