package com.customercarewebpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender 
{
	
	public void att()
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manideep\\Desktop\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
      WebElement cal=driver.findElement(By.xpath("//input[contains(@id,'74-real')]"));
	String dta="16-02-1993";
	
	
	
	}
	public void clender(WebDriver driver,WebElement element,String dta)
	{
		
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dta+"');",element);
	}
}
