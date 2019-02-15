package com.cg.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithAlert {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/D-Backup/SeleniumWebDriverClassDemos/Lesson05ClassDemos/src/AlertExample.html");
		driver.findElement(By.name("btnAlert")).click();
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
			String alrt = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.print(alrt);
			driver.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);	
		}
	}
}