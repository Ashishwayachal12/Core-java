package com.hieraricalinheritance;

public class Bike extends Vehical {
	int cc;

	public Bike(String brand, int year, int cc) {
		super(brand, year);
		this.cc = cc;
	}

	public void bikeDetail() {
		vehicalDetails();
		System.out.println("Bike cc is:" + cc);
		System.out.println("----------------");
	}

}
