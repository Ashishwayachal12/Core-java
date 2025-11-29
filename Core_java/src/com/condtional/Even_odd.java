package com.condtional;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		String res = n % 2 == 0 ? n + " Even Number." : n + " odd Number.";
		System.out.println(res);
		sc.close();
	}
}
