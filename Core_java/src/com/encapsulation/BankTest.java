package com.encapsulation;

public class BankTest {

	public static void main(String[] args) {
		Bank b = new Bank("Nagavara", "smith", 387348734, 100);
		getterAndSetter(b);

		b.setBankAccountNo(2673278732l);
		b.setBankBalance(200);
		b.setBranchName("raibag");
		b.setManagerName("allen");
		getterAndSetter(b);
	}

	static void getterAndSetter(Bank b) {
		System.out.println(b.getBranchName());
		System.out.println(b.getManagerName());
		System.out.println(b.getBankAccountNo());
		System.out.println(b.getBankBalance());
		System.out.println("------------------");

	}

}
