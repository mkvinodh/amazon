package com.Scanner;

import java.util.Scanner;

public class Switch_ex2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice number:");
		int a = s.nextInt();
		switch (a) {

		case 1: {
			for (int x = 1; x <= 5; x++) {
				for (int y = 1; y <= 3; y++) {
					System.out.println(x + "  " + y);

				}
			}
			System.out.println("Choice of 1");
			break;
		}

		case 2: {
			System.out.println("enter your salary:");
			int z = s.nextInt();
			if (z>100 && z<10000) {
				System.out.println("Your eligible loan amount is Rs.2,00,000" );
			}
			else if(z>10000 && z<20000) {
				System.out.println("Your eligible loan amount is Rs.4,00,000" );	
				}
			else if(z>20000)
			{
				System.out.println("eligible loan 10lakhs");
			}
			//break;
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
