package com.vediconex.www;

public class Student extends Person implements Taxation {
	
	private String course;
	private String university;
	private double taxCode;

       //making some random change to this file
	
	public Student(String name, int age, String course, String university) {
		super(name,age);
		this.course = course;
		this.university = university;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", university=" + university
				+ "Course=" + getCourse() + "University()= "
				+ getUniversity() + "]";
	}

	@Override
	public void displayTaxRate() {
		taxCode = 20.00;
		System.out.println(taxCode);
	}
	
	

}
