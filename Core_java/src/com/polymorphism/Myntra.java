package com.polymorphism;

public class Myntra {

	public void makePayment(long cardNo, String expreDate, int cc) {
		System.out.println("payment done through card.");
	}

	public void makePayment(String upiID) {
		System.out.println("payment done through upi.");
	}

	public void makePayment() {
		System.out.println("payment done through cash.");
	}

	public static void main(String[] args) {
		Myntra m = new Myntra();
		m.makePayment();
		m.makePayment("123456789sbi");
		m.makePayment(123456543, "12-dec-2025", 224);
	}
}
