package com.Example;

import java.util.Scanner;

public class Sum_Count {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number");
		long a = s.nextLong();

		System.out.println("Second number");
		long b = s.nextLong();
		
		long c = a + b;
		System.out.println("Ans is " + c);

	}

}
