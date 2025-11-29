package com.test;

import java.util.Scanner;

public class SecondLastDigit {
	public static void main(String[] args) {
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num /= 10;
		num %= 10;
		System.out.println(num);
		sc.close();
	}

}
