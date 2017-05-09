package com.framework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E://seleniumgeeko//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.id("link-signup")).click();
		//driver.findElement(By.xpath("//div[@class='goog-inline-block goog-flat-menu-button-caption']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("lakshya");
		driver.findElement(By.id("LastName")).sendKeys("bansal");
		driver.findElement(By.id("GmailAddress")).sendKeys("lak3108");
		driver.findElement(By.id("Passwd")).sendKeys("lakbansal");
        driver.findElement(By.id("PasswdAgain")).sendKeys("lakbansal");
       // Select x=new Select(driver.findElement(By.xpath("//div[@class='goog-inline-block goog-flat-menu-button jfk-select']")));
        //selectByValue("April");
		driver.findElement(By.id("BirthDay")).sendKeys("31");
		driver.findElement(By.id("BirthYear")).sendKeys("1993");
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9999999999");
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("lakbansal@gmail.com");
        driver.findElement(By.xpath("//div[@class='goog-inline-block goog-flat-menu-button jfk-select']")).click();
		List<WebElement> x=driver.findElements(By.xpath("//div[@class='goog-menuitem']"));	
		for (int i=0;i<x.size();i++)
		{
			System.out.println(x.get(i).getText());
		}
		x.get(7).click();
	    driver.close();
		
	}

}
