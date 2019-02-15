package com.cg.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo02 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.opencart.com/");
		Thread.sleep(10000);
		
		//Wait for 10 seconds
		Thread.sleep(10000);
				
		//Find the search box using name
		WebElement searchBox=driver.findElement(By.name("search"));
				
		//Type data in the search box
		searchBox.sendKeys("Phone");
				
		//Wait for 5 seconds
		Thread.sleep(5000);
				
		//Find the search button and click on it
		driver.findElement(By.xpath("//*[@id='search']/span/button")).click();
				
		//Wait for 10 seconds
		Thread.sleep(10000);
						
		//Closing the browser
		driver.quit();
	}

}
