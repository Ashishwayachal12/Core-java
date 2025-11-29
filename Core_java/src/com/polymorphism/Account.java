package com.polymorphism;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	double calculateIntrest() {
		return balance * 0.03;
	}

}
