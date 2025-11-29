package com.hieraricalinheritance;

public class VehicalTest {
	public static void main(String[] args) {
		Bike bike = new Bike("xl", 2021, 120);
		bike.bikeDetail();

		Car c = new Car("maruti", 2023, 4);
		c.carDetails();
	}

}
