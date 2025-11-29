package com.phonepy;

public class Account {
	private long accountNo;
	String accountHolderName;
	private double balance;
	long mobNo;
	String BankName;

	public Account(long accountNo, String accountHolderName, double balance, long mobNo, String bankName) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.mobNo = mobNo;
		BankName = bankName;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

}
