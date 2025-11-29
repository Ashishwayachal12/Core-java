package com.Multilevelinheritance;

public class Puma extends Shoes {
	String color;

	public Puma(int pid, String brand, double price, String color) {
		super(pid, brand, price);
		this.color = color;
	}

	public void pumaDetail() {
		shoesDetails();
		System.out.println("shoes color is:" + color);
		System.out.println("-------------------");
	}

}
