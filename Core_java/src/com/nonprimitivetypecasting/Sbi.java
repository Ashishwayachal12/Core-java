package com.nonprimitivetypecasting;

public class Sbi extends Bank {
	String branch;

	public Sbi(String bName, String ifsc, String branch) {
		super(bName, ifsc);
		this.branch = branch;
	}

}
