package com.encapsulation;

public class Bank {
	private String branchName;
	private String managerName;
	private long bankAccountNo;
	private double bankBalance;

	public Bank(String branchName, String managerName, long bankAccountNo, double bankBalance) {
		super();
		this.branchName = branchName;
		this.managerName = managerName;
		this.bankAccountNo = bankAccountNo;
		this.bankBalance = bankBalance;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public long getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(long bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}

}
