package com.hieraricalinheritance;

public class Vehical {
	String brand;
	int year;

	public Vehical(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}

	public void vehicalDetails() {
		System.out.println("Vehical brand is:" + brand);
		System.out.println("Vehical year is:" + year);

	}

}
