package com.cg.lesson05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllHyperlinkDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\D-Backup\\Advanced Selenium Libs\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;
 
        //extract the link texts of each link element
        for (WebElement e : linkElements)
        {
            linkTexts[i] = e.getText();
            System.out.println("The hyperlink-text is " + e.getText());
            i++;
        }
        
        for (String t : linkTexts)
        {
        	Thread.sleep(5000);
            driver.findElement(By.linkText(t)).click();
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(10000);
        }
        driver.quit();
	
	}
}