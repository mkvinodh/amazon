package com.Scanner;

public class Example1 {

	public void sample() {

		System.out.println("Hi");

		int xyz = 12345;
		int a[]= {1,2,3,4};
		System.out.println(xyz);
		System.out.println(a[0]);

	}

	public void sample(String name) {
		
		System.out.println("surya");
	}
	
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		char c = ('c');
		int x = a + b;

		Example1 p1 = new Example1();
		p1.sample();
		p1.sample("surya");

		/*System.out.println("Hello");
		System.out.println(a);
		System.out.println(c);
		System.out.println(a - b);
		System.out.println(x);*/
	}
}
