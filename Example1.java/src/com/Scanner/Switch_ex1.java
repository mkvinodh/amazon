package com.Scanner;

import java.util.Scanner;

public class Switch_ex1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice number:");
		int a = s.nextInt();
		switch (a) {

		case 1: {
			System.out.println("Cycle");
			break;
		}

		case 2: {
			System.out.println("Bike");
			break;
		}

		case 3: {
			System.out.println("Car");
			break;
		}

		default: {
			System.out.println("Sorry go by Walk");
		}
		}
	}

}
