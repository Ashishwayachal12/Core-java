package com.hieraricalinheritance;

public class Car extends Vehical {
	int no_Of_Seat;

	public Car(String brand, int year, int no_Of_Seat) {
		super(brand, year);
		this.no_Of_Seat = no_Of_Seat;
	}

	public void carDetails() {
		vehicalDetails();
		System.out.println("Number of seat in car is:");
		System.out.println("----------------------");
	}

}
