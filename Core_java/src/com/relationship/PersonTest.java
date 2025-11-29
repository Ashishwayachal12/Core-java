package com.relationship;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person(1234, "smith", 22, 2177128712l);
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.mobNo);

		p.addpan("3676732");
		System.out.println(p.pan.panNo);
	}

}
