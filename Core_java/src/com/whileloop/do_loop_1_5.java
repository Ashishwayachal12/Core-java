package com.whileloop;

import java.util.Scanner;

public class do_loop_1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 1, end = 5;
		do {
			System.out.print(start++ + " ");
		} while (start <= end);

	}

}
