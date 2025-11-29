package com.whileloop;

import java.util.Scanner;

public class Number_1_to_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("starting value is 1");
		System.out.println("Enter a ending value:");
		int end = sc.nextInt(), start = 1;
		while (start <= end) {
			System.out.println(start++);
		}
		sc.close();
	}

}
