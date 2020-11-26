package com.springapp.model;

public class User {
	private String firstName;
	private String lastName;

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
	public String toString() {
		String user = (firstName != null) ? firstName + " " : "";
		user += (lastName != null) ? lastName : "";
		return user.trim();
	}

}
