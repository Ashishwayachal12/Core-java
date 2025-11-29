package com.Multilevelinheritance;

public class Shoes extends Product {
	String brand;
	double price;

	public Shoes(int pid, String brand, double price) {
		super(pid);
		this.brand = brand;
		this.price = price;
	}

	public void shoesDetails() {
		productDetail();
		System.out.println("shoe brand is:" + brand);
		System.out.println("shoe price is:" + price);
	}

}
