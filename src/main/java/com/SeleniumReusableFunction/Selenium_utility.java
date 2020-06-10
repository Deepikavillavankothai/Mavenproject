package com.SeleniumReusableFunction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_utility {
	
WebDriver driver;
	
	public Selenium_utility (WebDriver driver) {
		this.driver=driver;
	}
	

	
	public void dropdown(String locator,String value) {
		  Select drop= new Select(driver.findElement(By.id(locator)));
		  drop.selectByVisibleText(value);
	}
	
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(path));
	}
			  
	public void getTitle() {
		System.out.println(driver.getTitle());
	}


}
