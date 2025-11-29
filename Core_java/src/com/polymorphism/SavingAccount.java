package com.polymorphism;

public class SavingAccount extends Account {

	public SavingAccount(double balance) {
		super(balance);
	}

	@Override
	public double calculateIntrest() {
		return balance * 0.07;
	}

}
