package com.cg.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/D-Backup/SeleniumWebDriverClassDemos/Lesson05ClassDemos/src/PopupWin.html");
		
		String parentWindow = driver.getWindowHandle().toString();
		Thread.sleep(5000);
		
		driver.findElement(By.name("Open")).click();
		Thread.sleep(5000);
		
		driver.switchTo().window("PopupWindow");
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
		driver.close();
	}

}
