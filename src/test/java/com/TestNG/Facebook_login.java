package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_login {
WebDriver driver;
	@BeforeMethod
	public void launchapp() {
	
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
	}
	
	@Test 
	public void login() {
		driver.findElement(By.id("email")).sendKeys("adc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("adc");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
	}
	
	@AfterMethod 
	public void teardown() {
		
		driver.close();
	}
	
	
}
