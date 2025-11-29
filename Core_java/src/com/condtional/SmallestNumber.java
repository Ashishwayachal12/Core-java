package com.condtional;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int n = sc.nextInt(), m = sc.nextInt();
		String res = n < m ? n + " is smallest number." : m + " is smallest number.";
		System.out.println(res);
		sc.close();
	}

}
