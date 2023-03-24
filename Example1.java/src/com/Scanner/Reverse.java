package com.Scanner;

public class Reverse {

	public static void main(String[] args) {

		String str = "Welcome to Greens";
		String r = " ";

		String[] s1 = str.split(" ");

		for (String sp : s1) {
			for (int i = sp.length() - 1; i >= 0; i--) {
				r = r + sp.charAt(i);
			}
			r = r + " ";

		}
		System.out.println(r);
	}
}
