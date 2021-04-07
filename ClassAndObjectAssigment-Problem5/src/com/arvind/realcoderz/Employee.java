package com.arvind.realcoderz;

public class Employee {
	private int empno;
	private String name;
	private String dept;
	private double salary;

	public int getEmpno() {
		return empno;
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

	public void setEmpno(int empno) {
		this.empno = empno;
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
		return "Employee [empno=" + empno + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
