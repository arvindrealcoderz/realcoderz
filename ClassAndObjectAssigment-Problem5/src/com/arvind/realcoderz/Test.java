package com.arvind.realcoderz;

import java.util.Scanner;

public class Test {
	private static int empno;
	private static String empName;
	private static String dept;
	private static double salary;
	
	public static void main(String[] args) {
		//create scanner class object
		Scanner sc=new Scanner(System.in);
		//read input data 
		System.out.print("Enter Employee Number ");
		empno=sc.nextInt();sc.nextLine();
		System.out.print("Enter Employee Name ");
		empName=sc.nextLine();
		System.out.print("Enter Employee Dept ");
		dept=sc.nextLine();
		System.out.print("Enter Employee Salary ");
		salary=sc.nextDouble();
		
		//create employee class object
		Employee emp=new Employee();
		//set employee details to emp object
		emp.setEmpno(empno);
		emp.setName(empName);
		emp.setDept(dept);
		emp.setSalary(salary);
		
		System.out.println(emp.toString());
		
		
	}
}
