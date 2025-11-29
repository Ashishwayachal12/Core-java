package com.oops;

public class Constr {
	String brand, color;
	double price;

	public Constr(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public static void main(String[] args) {
		Constr c = new Constr("oppo", "red", 266732.3);
		Constr c1 = new Constr("redmi", "gray", 4367743.5);
		details(c1);
		details(c);
	}

	private static void details(Constr c) {
		System.out.println("brand is:" + c.brand);
		System.out.println("price is:" + c.price);
		System.out.println("color is:" + c.color);
		System.out.println("---------------------");

	}

}
