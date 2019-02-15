package com.cg.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkDemo {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();

		String baseURL = "file:///C:/D-Backup/SeleniumWebDriverClassDemos/Lesson05ClassDemos/src/HyperlinkDemo.html";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		//Using linkText locator
		driver.findElement(By.linkText("CLICK HERE!")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		//Using partialLinkText locator
		driver.findElement(By.partialLinkText("ME")).click();

		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

	}

}
