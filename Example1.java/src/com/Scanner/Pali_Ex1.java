package com.Scanner;

import java.util.Scanner;

public class Pali_Ex1 {
	static int t, a, ans;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");

		int n = s.nextInt();
		t = n;

		while (n > 0) {
			a = n % 10;
			ans = (ans * 10) + a;
			n = n / 10;
		}

		if (t == ans) {

			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
