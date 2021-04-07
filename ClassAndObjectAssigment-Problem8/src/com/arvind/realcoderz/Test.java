package com.arvind.realcoderz;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		 int empNo=0;
		 String name="";
		 String dept="";
		 double salary=0.0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of "
				+ " object \t: ");
		int sizeOfArray=sc.nextInt();sc.nextLine();
		Employee[] emp=new Employee[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			System.out.print("Employee number \t:");
			empNo=sc.nextInt();sc.nextLine();
			System.out.print("Employee Name \t:");
			name=sc.nextLine();
			System.out.print("Employee dept \t:");
			dept=sc.nextLine();
			System.out.print("Employee salary \t:");
			salary=sc.nextDouble();sc.nextLine();
			System.out.println(emp[i]);
			emp[i]=new Employee(empNo, name, dept, salary);
			
		}
		//for displaying data 
		int min=0;
		for (int i = 0; i < emp.length; i++) {
			min=(int) emp[0].getSalary();
			if(min>emp[i].getSalary()){
				min=(int) emp[i].getSalary();
			}
		}
		System.out.println(min);
		for (int i = 0; i < emp.length; i++) {
			if(min==emp[i].getSalary())
				System.out.println(emp[i].toString());
		}
		
		
		
	}
}
