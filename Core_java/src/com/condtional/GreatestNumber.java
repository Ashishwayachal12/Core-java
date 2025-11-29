package com.condtional;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number:");
		int n = sc.nextInt(), m = sc.nextInt();
		String res = n > m ? n + " is greatest number." : m + " is greatest number.";
		System.out.println(res);
		sc.close();

	}

}
