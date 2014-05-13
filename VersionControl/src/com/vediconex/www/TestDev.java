package com.vediconex.www;

public class TestDev {

	
	public static void main(String[] args) {
		
		Taxation t = new Student("Jenkins", 22, "Politics", "Oxford");
		Student s = new Student("Mattius", 24, "Philosophy", "Oxford");
		Person p = new Student("Nadine", 25, "Philosophy", "Oxford");
		
		p = (Student)t;	
		s = (Student)t;
	}

}
