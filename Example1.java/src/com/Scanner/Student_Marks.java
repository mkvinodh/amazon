package com.Scanner;

import java.util.Scanner;

public class Student_Marks {

	public static void main(String[] args) {

		System.out.println("Student Name");
		Scanner mark = new Scanner(System.in);
		String a = mark.nextLine();

		System.out.println("Student Register No");
		int b = mark.nextInt();

		System.out.println("Enter your Tamil mark");
		int c = mark.nextInt();

		System.out.println("Enter your English mark");
		int d = mark.nextInt();

		System.out.println("Enter your Maths mark");
		int e = mark.nextInt();

		System.out.println("Enter your Science mark");
		int f = mark.nextInt();

		System.out.println("Enter your Social mark");
		int g = mark.nextInt();

		System.out.println("Marks Satement of" + "  " + a);
		System.out.println("Tamil" + "    " + c);
		System.out.println("English" + "  " + d);
		System.out.println("Maths" + "    " + e);
		System.out.println("Science" + "  " + f);
		System.out.println("Social" + "   " + g);

		int total = (c + d + e + f + g);
		System.out.println("Total Marks are" + "   " + total);
		float avg = (total) / 5;
		System.out.println("Average is" + "  " + avg);
	}
}
