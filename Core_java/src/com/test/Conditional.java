package com.test;

import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {
		System.out.println("Enter a number to check even or odd:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = num % 2 == 0 ? num + " is Even Number." : num + " is odd Number.";
		System.out.println(res);
		sc.close();
	}

}
