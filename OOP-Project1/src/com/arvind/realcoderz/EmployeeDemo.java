package com.arvind.realcoderz;

import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id ");
		String empId=sc.nextLine();
		System.out.println("Enter Employee Name ");
		String empName=sc.nextLine();
		System.out.println("Enter Employee Address ");
		String Address=sc.nextLine();
		Address addr=new Address();
		addr.setAddr1("Faizabad");
		addr.setAddr2("Ayodhya");
		addr.setCity("Lucknow");
		addr.setPin("224171");
		Employee emp=new Employee();
		emp.setEmpid(empId);
		emp.setEmpName(empId);
		emp.setAddress(addr);
		
	}
	
	public static void storeData() {
		
	}
}
