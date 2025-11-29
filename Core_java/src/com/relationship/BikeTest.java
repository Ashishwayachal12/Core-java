package com.relationship;

public class BikeTest {
	public static void main(String[] args) {
		Bike b = new Bike("yamaha", 100);
		System.out.println(b.brand);
		System.out.println(b.price);
		System.out.println(b.e.cc);
		System.out.println(b.e.stocktype);
	}

}
