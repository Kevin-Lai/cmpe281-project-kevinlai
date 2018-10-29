package com.aws.codestar.projecttemplates.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Kevin Lai, 008498282
 *
 */

@Entity
public class User {
	
	@Id
	private String username;	// Username is the user's unique email address
	private String password;
	private String firstName;
	private String lastName;
	
	public User() {
		// Default Constructor
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
}
