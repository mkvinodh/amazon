package com.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Iterator_Ex1 {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(15);
		a.add(50);
		a.add(80);
		a.add(100);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("=================================");
		
		for (Integer j : a) {
			System.out.println(j);
		}
		System.out.println("=================================");
		
		
		
	}
	
	
}
