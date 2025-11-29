package com.oops;

public class Mobile_1 {
	String barnd;
	double price;
	String color;

	public static void details(Mobile_1 m) {
		System.out.println("brand is:" + m.barnd);
		System.out.println("color is:" + m.color);
		System.out.println("price is:" + m.price);
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		Mobile_1 m1 = new Mobile_1();
		m1.barnd = "oppo";
		m1.price = 367673.3;
		m1.color = "red";
		details(m1);

		m1.barnd = "redmi";
		m1.price = 367673.3;
		m1.color = "white";
		details(m1);

		m1.barnd = "samsung";
		m1.price = 36737.4;
		m1.color = "gray";
		details(m1);

	}

}
