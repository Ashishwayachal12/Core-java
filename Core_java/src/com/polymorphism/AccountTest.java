package com.polymorphism;

public class AccountTest {
	public static void main(String[] args) {
		Account a = new SavingAccount(1000);
		double interst = a.calculateIntrest();
		System.out.println(interst);

		Account ac = new CurrentAccount(100);
		System.out.println(ac.calculateIntrest());

	}

}
