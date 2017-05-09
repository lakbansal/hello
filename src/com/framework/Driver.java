package com.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E://seleniumgeeko//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.id("Email")).sendKeys("lakbansal@gmail.com");
		driver.findElement(By.id("Next")).click();
		driver.close();
		
	}

}
