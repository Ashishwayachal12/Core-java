package com.method;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();		
		System.out.println(primeNumber(n) ? n + " is prime number." : n + " is not a prime number.");
		sc.close();
	}
	private static boolean primeNumber(int n) {
		for (int a = 2; a <= n / 2; a++) {
			if (n % a == 0) {
				return false;
			}
		}
		return true;
	}

}
