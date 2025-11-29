package com.Multilevelinheritance;

public class Product {
	int pid;

	public Product(int pid) {
		super();
		this.pid = pid;
	}

	public void productDetail() {
		System.out.println("shoes pid is:" + pid);
	}

}
