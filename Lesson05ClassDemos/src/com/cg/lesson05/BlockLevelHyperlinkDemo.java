package com.cg.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlockLevelHyperlinkDemo {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();

		String baseURL = "file:///C:/D-Backup/SeleniumWebDriverClassDemos/Lesson05ClassDemos/src/BlockLevelHyperlinkDemo.html";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.quit();

	}

}
