package com.cg.lesson05;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPositionDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
        Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.get("file:///C:/D-Backup/SeleniumWebDriverClassDemos/Lesson05ClassDemos/src/PopUpWinDemo.html");
		
		Thread.sleep(5000);
		
		driver.manage().window().setPosition(new Point(50, 50));
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
