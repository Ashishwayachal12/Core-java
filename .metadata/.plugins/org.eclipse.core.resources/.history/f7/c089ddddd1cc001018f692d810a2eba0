package com.phonepy;

public class Phonepy {
	private String username, password;

	public Phonepy(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public void setUsername(String username, String password) {
		if (password.equals(this.password)) {
			this.username = username;
		} else {
			System.out.println("Invalid input");
		}

	}

	public void setPassword(String oldPassword, String newPassword) {
		if (oldPassword.equals(newPassword)) {
			password = newPassword;
		}
	}

	Account account;

	public void addAccount(long accountNo, String accountHolderName, double balance, long mobNo, String BankName) {

		if (account == null) {
			account = new Account(accountNo, accountHolderName, balance, mobNo, BankName);
		} else {
			System.out.println("account already exits...");
		}
	}

	public void checkBalance() {
		if (account != null) {
			System.out.println(account.getBalance());
		} else {
			System.out.println("plz add account..");
		}
	}
}
