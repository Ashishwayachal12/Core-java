package com.basicpro;

import java.util.Scanner;

public class CountEvenNumberDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt(), count = 0;
		for (; n > 0; n /= 10) {
			if (n % 2 == 0 ) {
				count++;
			}
		}
		System.out.println(count);
	}

}
