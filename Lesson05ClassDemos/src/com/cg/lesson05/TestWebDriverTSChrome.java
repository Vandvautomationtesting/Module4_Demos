package com.cg.lesson05;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestWebDriverTSChrome 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello Selenium!!");
		
		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		
		System.out.println("The page title is: " + driver.getTitle());
		System.out.println("The page URL is: " + driver.getCurrentUrl());
		
		WebElement element1 = driver.findElement(By.name("q"));
		element1.sendKeys("Selenium");
		
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		
		driver.findElement(By.name("btnK")).click();
				
		driver.close();
		
	}
}