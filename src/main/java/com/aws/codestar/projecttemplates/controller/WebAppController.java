package com.aws.codestar.projecttemplates.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Basic Spring MVC controller that handles all GET requests.
 */
@Controller
@RequestMapping("/")
public class WebAppController {
	
	// Autowired annotation causing issues when running the project locally.
//	@Autowired
//	UserDao userDao;
	
    private final String siteName;

    public WebAppController(final String siteName) {
        this.siteName = siteName;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView webAppLaunch() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("siteName", this.siteName);
        return mav;
    }

	// Added - Kevin Lai
	@RequestMapping("signin")
	public ModelAndView signIn() {

		ModelAndView mav = new ModelAndView("signin");
		return mav;
	}

	// Added - Kevin Lai
	@RequestMapping("submitSignIn")
	public ModelAndView submitSignIn(@RequestParam("username") String uname, @RequestParam("password") String pass) {

		LoginService login = new LoginService();

		ModelAndView mav = new ModelAndView();
		// addObject(<label_name>, <item-to-return>)

		/*
		 * To show the login message, use ${<label_name>} in the .jsp webpage Make sure
		 * to include isELIgnored="false" inside the <%@ %> at the top of the .jsp file
		 */

		if ((login.verify(uname, pass)).equals("admin")) {
			mav.setViewName("userpage");
			mav.addObject("result", "Welcome Administrator!");
		}
		else if((login.verify(uname, pass)).equals("user")) {
			mav.setViewName("userpage");
			mav.addObject("result", "Welcome User!");
		}
		else {
			mav.setViewName("signin");
			mav.addObject("result", "Login Failed. Please try again.");
		}

		return mav;
	}
      
    
    // Added - Kevin Lai
    @RequestMapping("signup")
    public ModelAndView signUp() {
    	ModelAndView mav = new ModelAndView("signup");
    	return mav;
    }
    
    // Added - Kevin Lai
    @RequestMapping("createAccount")
    public ModelAndView createAccount(@RequestParam String firstName, String lastName, String username, String password, String confirmPassword) {
    	ModelAndView mav = new ModelAndView("signup");
    	String errorMessage = "";
    	boolean formError = false;
    	
    	if(!username.contains("@")) {
    		formError = true;
    		errorMessage += "The username must be an email address.\n";
    	}
    	
    	if(!confirmPassword.equals(password)) {
    		formError = true;
    		errorMessage += "The password does not match!";    		
    	}
    	
    	if(!formError) {
        	User newUser = new User();
        	newUser.setFirstName(firstName);
        	newUser.setLastName(lastName);
        	newUser.setUsername(username);
        	newUser.setPassword(password);
    		mav.addObject("result", "User Created. Please sign in from the homepage.");
    	}
    	else {
    		errorMessage += "Either the Username or Password was invalid. Please try again.";
    		mav.addObject("result", errorMessage);    		
    	}
    	
//    	userDao.save(newUser);
    	return mav;
    }
    
    // Added - Kevin Lai
    @RequestMapping("index")
    public ModelAndView showHome() {
    	ModelAndView mav = new ModelAndView("index");
    	return mav;
    }

    // Added - Kevin Lai
    @RequestMapping("returnHome")
    public ModelAndView returnHome() {
    	ModelAndView mav = new ModelAndView("index");
    	return mav;
    }    
   
    // Added - Kevin Lai
    @RequestMapping("uploadFile")
    public ModelAndView uploadFile(@RequestParam File dataFile) {
    	ModelAndView mav = new ModelAndView("userpage");
    	
    	/*
    	 * 1 MB = 1024 x 1024 = 1048576 bytes
    	 * 10 MB = 10 * 1048576 = 10485760
    	 */
    	long maxFileSize = 10485760;
    	
    	// File.length() returns the file's size in bytes
    	if(dataFile.length()>maxFileSize) {
    		// Prevent file uploads with file size greater than 10 MB
    		mav.addObject("uploadResult", "File is too Large. MAX File Size is 10 MB.");
    	}
    	else {
    		mav.addObject("uploadResult", "Upload Successful!");
    	}
    	
    	return mav;
    }  
    
    // Added - Kevin Lai
    @RequestMapping("downloadFile")
    public ModelAndView downloadFile(@RequestParam File dataFile) {
    	ModelAndView mav = new ModelAndView("userpage");
		mav.addObject("downloadResult", "Download");
    	return mav;
    }
    
    // Added - Kevin Lai
    @RequestMapping("updateFile")
    public ModelAndView updateFile(@RequestParam File dataFile) {
    	ModelAndView mav = new ModelAndView("userpage");
		mav.addObject("updateResult", "Update");
    	return mav;
    }
    
    // Added - Kevin Lai
    @RequestMapping("deleteFile")
    public ModelAndView deleteFile(@RequestParam File dataFile) {
    	ModelAndView mav = new ModelAndView("userpage");
		mav.addObject("deleteResult", "Delete");
    	return mav;
    }
    
}
