package com.Scanner;

public class String_Ex1 {

	public static void main(String[] args) {
		String s = "kalaiselvi";
		String s1 = "KALAISELVI";
		
		int a = s.length();
		System.out.println(a);
		
		boolean b = s.equals(s1);
		System.out.println(b);
		
		boolean b1 = s.equalsIgnoreCase(s1);
		System.out.println(b1);
		
		boolean c = s.startsWith("k");
		System.out.println(c);
		
		boolean d = s.endsWith("v");
		System.out.println(d);
		
		
		
	}

}
