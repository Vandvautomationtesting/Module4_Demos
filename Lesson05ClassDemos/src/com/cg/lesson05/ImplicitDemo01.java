package com.cg.lesson05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitDemo01 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl;
		baseUrl = "http://www.wikipedia.org/";
        
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       driver.get(baseUrl + "/wiki/Main_Page");
       driver.findElement(By.id("searchInput")).clear();
       driver.findElement(By.id("searchInput")).sendKeys("India");
       driver.findElement(By.id("searchButton")).click();
       
       driver.quit(); 

	}

}
