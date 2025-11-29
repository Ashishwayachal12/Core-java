package com.whileloop;

import java.util.Scanner;

public class Print_Even_number_1_to_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("starting point is 1");
		System.out.print("Enter a ending point:");
		int end = sc.nextInt(), start = 1;
		while (start <= end) {
			if (start % 2 == 0) {
				System.out.print(start + " ,");
			}
			start++;
		}
		sc.close();
	}

}
