package com.Scanner;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Treee_Set {

	public static void main(String[] args) {
		Set<Object> t = new TreeSet<Object>();
		
		t.add("Aditya");
		t.add("Sugi");
		t.add("Vinod");
		t.add("Vinod");
		t.add("10");
		t.add("Kans");
		System.out.println(t);
		
		List<Object> t1 = new LinkedList<Object>();
		t1.add(100);
		t1.add("Family");
		t1.addAll(t1);
		System.out.println(t1);
		t1.retainAll(t1);
		System.out.println(t1);
		t1.removeAll(t1);
		System.out.println(t1);
		
	}
	
}
