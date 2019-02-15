package com.cg.lesson05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemos
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/D-Backup/SeleniumWebDriverClassDemos/Lesson05ClassDemos/src/AlertBoxDemos.html");
		
		Thread.sleep(10000);

		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println("The alert message is : " + alert.getText());
		alert.accept();
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(5000);
		
		Alert confirm=driver.switchTo().alert();
		
		confirm.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(5000);
		
		confirm=driver.switchTo().alert();
		
		confirm.dismiss();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(5000);
		
		Alert prompt=driver.switchTo().alert();
		
		String text=prompt.getText();
		System.out.println(text);
		
		prompt.sendKeys("Smith");
		
		Thread.sleep(5000);
		
		prompt.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(5000);
		
		prompt=driver.switchTo().alert();
		
		prompt.dismiss();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
