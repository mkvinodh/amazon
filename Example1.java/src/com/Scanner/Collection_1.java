package com.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection_1 {

	public static void main(String[] args) {
		
		List<Object> l = new ArrayList<Object>();
		l.add(1);
		l.add(5);
		l.add(10);
		l.add("java");
		l.add('q');
		l.add(99.99);
		System.out.println(l);
		
		int s=l.size();
		System.out.println(s);
		
		Object g = l.get(3);
		System.out.println(g);
		
		l.set(2, 5000);
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);
		
		l.clear();
		System.out.println(l);
		
		boolean b = l.contains(10);
		System.out.println(b);
		
	}
	
}
