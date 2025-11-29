package com.for_loop;

import java.util.Scanner;

public class Number_1_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("starting point is 1.");
		System.out.println("Enter a ending point:");
		int end = sc.nextInt(), start = 1;
		for (; start <= end; start++) {
			System.out.println(start + " ");
			sc.close();
		}

	}

}
