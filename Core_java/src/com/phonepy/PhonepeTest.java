package com.phonepy;

import java.util.Scanner;

public class PhonepeTest {
	static {
		System.out.println("----------Welcome to phonepe-----------");
	}

	public static void main(String[] args) {

		Phonepy p1 = new Phonepy("smith", "smith12");

		boolean execution = true;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("press 1 for change username");
			System.out.println("press 2 for change password");
			System.out.println("press 3 for check balance");
			System.out.println("press 4 for add account");
			System.out.println("press 0 to exit");
			System.out.print("plz enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter new Username:");
				String username = sc.next();
				System.out.println("Enter password:");
				String password = sc.next();
				p1.setUsername(username, password);
				break;

			case 2:
				System.out.println("Enter old password:");
				String oldPassword = sc.next();
				System.out.println("Enter new password:");
				String newPassword = sc.next();
				p1.setPassword(oldPassword, newPassword);
				break;

			case 3:
				p1.checkBalance();
				break;

			case 4:
				System.out.println("Enter account number:");
				long accountNo = sc.nextLong();
				System.out.println("Enter account Holder name:");
				String accountHolderName = sc.next();
				System.out.println("Enter balance:");
				double balance = sc.nextDouble();
				System.out.println("Enter mobno:");
				long mobNo = sc.nextLong();
				System.out.println("Enter bank name:");
				String bankName = sc.next();

				p1.addAccount(accountNo, accountHolderName, balance, mobNo, bankName);
				break;

			case 0:
				execution = false;
				System.out.println("Thank you!!!");
				break;

			default:
				System.out.println("Invalid input...");
			}

		} while (execution);
		sc.close();

	}

}
