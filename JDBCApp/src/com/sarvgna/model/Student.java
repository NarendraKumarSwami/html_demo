package com.sarvgna.model;

public class Student {
	
	
	   private int rollNo;
	   
	   private String name;
	   
	   private String gender;
	   
	   
	   private int marks;
	   
	   
	   
	   public Student() {
		// TODO Auto-generated constructor stub
	}
	   
	   public Student( String name, String gender, int marks) {
			super();
			this.name = name;
			this.gender = gender;
			this.marks = marks;
		}




	public Student(int rollNo, String name, String gender, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", marks=" + marks + "]";
	}
	   
	   
	   
	   
	   

}
