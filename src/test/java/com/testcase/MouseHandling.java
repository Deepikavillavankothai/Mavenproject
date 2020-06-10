package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHandling {
	
	@Test
	
	public void demo() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	//login	
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
	
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		//handling mouse
		
		WebElement a = driver.findElement(By.id("menu_admin_Job"));
		
		WebElement b = driver.findElement(By.id("menu_admin_employmentStatus"));
		
		Actions action = new Actions (driver);
		
		action.moveToElement(a).perform();
		
		action.moveToElement(b).click().build().perform();
		
	}

}
