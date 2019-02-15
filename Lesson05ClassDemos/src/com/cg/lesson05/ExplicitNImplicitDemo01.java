package com.cg.lesson05;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

public class ExplicitNImplicitDemo01 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.opencart.com/");
		
		//WebElement searchBox=driver.findElement(By.name("search2"));
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		Date strtdate=new Date();
		System.out.println(strtdate);
		
		WebElement searchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search2")));		
		
		Date endDate=new Date();
		System.out.println(endDate);
		searchBox.sendKeys("Phone");
		
		driver.findElement(By.className("input-group-btn")).click();
		
		//Thread.sleep(5000);
		
		driver.quit();

	}

}
