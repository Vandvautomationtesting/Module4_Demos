package com.cg.lesson05;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.*;

public class TestWebDriverTSIE 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello in IE");
		
		System.setProperty("webdriver.ie.driver", "C:\\D-Backup\\Advanced Selenium Libs\\IEDriverServer_x64_3.5.0\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.co.in");

		Thread.sleep(5000);
		
		driver.quit();
	}
}