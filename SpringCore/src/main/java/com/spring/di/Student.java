package com.spring.di;

public class Student {
	private int id;
	private String studentName;
	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
//	public String getStudentName() {
//		return this.studentName;
//	}
	public void displayStudentInfo() {
		System.out.println("Student ID is : "+id);
		System.out.println("Student Name is : "+ studentName);
	}
}
