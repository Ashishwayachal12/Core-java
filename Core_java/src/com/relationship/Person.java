package com.relationship;

public class Person {
	int id;
	String name;
	int age;
	long mobNo;

	public Person(int id, String name, int age, long mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobNo = mobNo;
	}

	PanCard pan;

	public void addpan(String panNo) {
		if (age >= 18) {
			pan = new PanCard(panNo, id);
		} else {
			System.out.println("Age is invalid");
		}
	}

}
