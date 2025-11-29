package com.polymorphism;

public class CurrentAccount extends Account {

	public CurrentAccount(double balance) {
		super(balance);
	}

	@Override
	public double calculateIntrest() {
		return balance * 0.10;
	}
}
