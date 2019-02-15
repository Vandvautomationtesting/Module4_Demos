package com.cg.lesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

public class ExplicitDemo03 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jsfiddle.net/tKQFN/");
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();

		try{
			WebElement myDynamicElement = (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='register']")));
			}
		catch (TimeoutException e) 
		{
			System.out.println(e);
		}

	}

}
