package com.for_loop;

import java.util.Scanner;

public class Number_M_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value(stating):");
		int start = sc.nextInt();
		System.out.println("Enter n value(ending):");
		int end = sc.nextInt();
		for (; start <= end; start++) {
			System.out.print(start + " ");
			sc.close();
		}
	}

}
