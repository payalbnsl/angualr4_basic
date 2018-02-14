package com.java;

import java.time.LocalDate;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public void printPerson() {
		System.out.println("name: " + name + ", birth date: " + birthday
				+ ", gender: " + gender + " , email id: " + emailAddress);
	}
@Override
	public String toString() {
		return "name: " + name + ", birth date: " + birthday
				+ ", gender: " + gender + " , email id: " + emailAddress;
	}
	@Override
	public boolean equals(Object person) {
		if (person instanceof Person) {
			Person p = (Person) person;

			if (this.getName().equals(p.getName())
					&& this.getBirthday() == p.getBirthday()
					&& this.getGender() == p.getGender()) {
				return true;
			}

		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}


	public Person(String name, LocalDate birthday, Sex gender,
			String emailAddress) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public Sex getGender() {
		return gender;
	}

}
