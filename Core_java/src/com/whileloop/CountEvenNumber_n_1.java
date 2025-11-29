package com.whileloop;

import java.util.Scanner;

public class CountEvenNumber_n_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ending point is 1:");
		System.out.println("Enter a stating point:");
		int start = sc.nextInt(), end = 1, count = 0;
		while (start >= end) {
			if (start % 2 == 0) {
				count++;
				System.out.print(start + " ");
			}
			start--;
		}
		System.out.println();
		System.out.println("count of even number is:" + count);
		sc.close();
	}

}
