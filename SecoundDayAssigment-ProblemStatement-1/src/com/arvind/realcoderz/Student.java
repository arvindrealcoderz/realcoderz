package com.arvind.realcoderz;

public class Student {
	
	private int rollNo;
	private String name;
	private int marks;
	
	public Student() {
		System.out.println("Student.Student 0 param constructor ..");
	}

	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public static void main(String[] args) {
		Student one =new Student(101, "Arvind",500);
		Student two =new Student(102, "Raja",400);
		Student three =new Student(103, "Pooja",600);
		System.out.println("Student with highest marks is "+compareStudent(one,two,three));
	}

	public static String compareStudent(Student one, Student two, Student three) {
		Student st=one;
		if(two.getMarks()>st.getMarks())
			st=two;
		if(three.getMarks()>st.getMarks())
			st=three;
		return st.getName();
	}
	
	

}
