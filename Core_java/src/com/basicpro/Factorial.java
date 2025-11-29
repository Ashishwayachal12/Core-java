package com.basicpro;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt(), fact = 1;
		for (; n > 1; n--) {
			fact *= n;
			sc.close();
		}
		System.out.println(fact);
	}

}
