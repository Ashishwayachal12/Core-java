package com.relationship;

public class Student {

	int id;
	String name;
	int age;

	Department department;

	public Student(int id, String name, int age, String dname, String hodName) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		if (dname.equalsIgnoreCase("CSE")) {
			department = new Department("CSE", "smith");
		} else if (dname.equalsIgnoreCase("EEE")) {
			department = new Department("EEE", "Allen");
		} else if (dname.equalsIgnoreCase("ISE")) {
			department = new Department("ISE", "King");
		}

	}

}
