package com.Scanner;

import java.util.Scanner;

public class If_ex1 {

public static void main (String[] args)
{

Scanner s = new Scanner(System.in);
System.out.println("Enter your age:");
int age=s.nextInt();

if(age>=18){
System.out.println("Your age is eligible");
System.out.println("Enter your weight:");
int weight=s.nextInt();
if(weight>=50){
System.out.println("Eligible");
			 }
else{
System.out.println("Not Eligible");
}
		   }
else{
System.out.println("age is not elgible");
	}
}
				   }