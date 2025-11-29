package com.basicpro;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt(), s = 1;
		for (; s <= n; s++) {
			if (n % s == 0) {
				System.out.println(s);
			}
		}
	}

}
