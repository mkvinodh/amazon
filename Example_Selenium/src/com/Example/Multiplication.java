package com.Example;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the table of Multiple");
		int a = s.nextInt();

		System.out.println("Till which number to multiple");
		int b = s.nextInt();
		
		int c;	

		for (int i = 1; i <= b; i++) {

			c = a +i;
		
		System.out.println(a + "+" + i + "=" + c);
		}

	}

}
