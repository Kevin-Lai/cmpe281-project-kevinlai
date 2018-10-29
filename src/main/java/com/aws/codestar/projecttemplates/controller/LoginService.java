package com.aws.codestar.projecttemplates.controller;

/**
 * @author Kevin Lai, 008498282
 *
 */
public class LoginService {

	public LoginService() {
		// Default Constructor
	}
	
	public String verify(String username, String password) {
    	if(username.equals("kevinlai249@gmail.com") && password.equals("cmpe281admin")) {
        	return "admin";
    	}
    	else if(username.equals("test281@gmail.com") && password.equals("12345")) {
        	return "user";
    	}
		return "";
	}
}
