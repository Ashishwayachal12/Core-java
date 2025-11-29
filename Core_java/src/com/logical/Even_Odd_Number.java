package com.logical;

import java.util.Scanner;

public class Even_Odd_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		String res = (n & 1) == 0 ? n + " is Even number." : n + " is odd number.";
		System.out.println(res);
		sc.close(); 

	}

}
