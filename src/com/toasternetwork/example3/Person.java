package com.toasternetwork.example3;

import java.util.Objects;

public class Person {
	private String firstName = "David";
	private String lastName = "Couch";

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			System.out.println("I am here in this == o");
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			System.out.println("I am here in o == null and getClass() != o.getClass()");
			return false;
		}
		Person person = (Person) o;
		return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public String toString() {
		System.out.printf("My class is %s. %s %s\n", getClass(), firstName, lastName);
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				"}\n";
	}
}
