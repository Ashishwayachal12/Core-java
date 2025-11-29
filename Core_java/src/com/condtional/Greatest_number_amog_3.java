package com.condtional;

import java.util.Scanner;

public class Greatest_number_amog_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int n = sc.nextInt(), m = sc.nextInt(), v = sc.nextInt();
		int res1 = n > m ? n : m;
		int res2 = res1 > v ? res1 : v;
		System.out.println("Greatest number among 3 number is:" + res2);
		sc.close();
	}

}
