package com.Scanner;

import java.util.Scanner;

public class A {
	static int t, a, ans;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number 100 to 999");
		int n = s.nextInt();//153
		t=n;
		while(n>0) {//1
			a=n%10;
			ans=ans+(a*a*a);//
			n=n/10;
			
		}
		if(t==ans) {
			
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not amstrong number");
		}
	}

}
