package com.toasternetwork.example3;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Adonis", "Deliannis");
		Person p2 = new Person("John", "Stamos");
		Person p3 = new Person(p1);

		if(p1 == p2)
			System.out.println("p1 and p2 are identical using ==");
		else
			System.out.println("p1 and p2 are not identical using ==");

		if(p1.equals(p2))
			System.out.println("p1 and p2 are identical using equals()");
		else
			System.out.println("p1 and p2 are not identical using equals()");

		if(p1.equals(p3))
			System.out.println("p1 and p3, which is p1; are identical using equals()");
		else
			System.out.println("p1 and p3, which is p1; are not identical using equals()");

		System.out.println(p1);
		System.out.println(p2.toString());
		System.out.println(p3);
	}
}
