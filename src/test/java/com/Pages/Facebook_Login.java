package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;

public class Facebook_Login extends Library {
	
//	WebDriver driver;
	
	@FindBy(id="email")
	WebElement username;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(xpath="//*[@id='u_0_b']")
	WebElement login;
	
	public  Facebook_Login(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	 public void enterusername(String uname) {
		 username.sendKeys(uname);
		 
	 }
	 
	 public void enterpassword(String pass) {
		 
		 password.sendKeys(pass);
		 
	 }
	 
	 public void submitbutton() {
		 
		 login.click();
	 }
	 
	
	
	

	
	
}
