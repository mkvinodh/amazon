package com.Scanner;

public class Reuturn_ex1 {

	private int white() {
		int x=501;
		int y=500;
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	
	public static void main(String[] args) {
		
		Reuturn_ex1 r = new Reuturn_ex1();
		int a=r.white();
		System.out.println(a);
				
	}
}
