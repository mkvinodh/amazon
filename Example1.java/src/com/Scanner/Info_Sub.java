package com.Scanner;

import java.util.Scanner;

public class Info_Sub extends Info {

	@Override
	public void Emp_details() {

		Scanner ref = new Scanner(System.in);

		System.out.println("First Name");
		String firstname = ref.next();

		System.out.println("Last Name");
		String lastname = ref.next();

		System.out.println("Email address");
		String email = ref.next();

		System.out.println("Mobilen No");
		Long mobile = ref.nextLong();

		System.out.println("Address");
		String address = ref.next();

		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(address);
	}

	public static void main(String[] args) {
		Info_Sub ref = new Info_Sub();
		ref.Emp_details();
		ref.Student_details();
		
	}
}
