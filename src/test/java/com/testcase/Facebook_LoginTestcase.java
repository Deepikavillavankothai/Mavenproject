package com.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Library;
import com.Pages.Facebook_Login;

public class Facebook_LoginTestcase extends Library {
	
// Facebook_Login login; 
	
	@BeforeClass
	public void startapp() {
		
		launchApplication("chrome","https://www.facebook.com/");
		
	}
	
	
	@Test
	
	public void login() {
		
	Facebook_Login 	login = new Facebook_Login(driver);
		
		login.enterusername("adc@gmail.com");
		
		login.enterpassword("adc");
		
		login.submitbutton();
		
		
		
		
	}

	
	@AfterClass
	
	public void teardown() {
		
		quit();
	
		
	}
}
