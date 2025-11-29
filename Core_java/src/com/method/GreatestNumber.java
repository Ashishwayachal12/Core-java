package com.method;

import java.util.Scanner;

public class GreatestNumber {

	public static void greatest(Scanner sc) {
		System.out.println("Enter 3 numbers(greatest):");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int res = (a > b && a > c) ? a : (b > c ? b : c);
		System.out.println(res);
	}

	public static void smallest(Scanner sc) {
		System.out.println("Enter 3 numbers(smallest):");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int res = (a < b && a < c) ? a : (b < c ? b : c);
		System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		greatest(sc);
		smallest(sc);
		sc.close();

	}

}
