package com.freecrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class testbasefreecrm 
{
	public static WebDriver driver;
	public static Properties pan;
	public static Actions act;
     
	  public testbasefreecrm() {
		// TODO Auto-generated constructor stub
	{
	  pan=new Properties();
	  try {
		pan.load(new FileInputStream("C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\rode.properties"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
		
	}
	  }
	  
	  public void idly()
	  {
		  String ho=pan.getProperty("browser");
			if(ho.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\manideep\\Desktop\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(ho.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\manideep\\Downloads\\geckodriver-v0.20.1-win32\\geckodriver.exe");
				driver=new FirefoxDriver();
				}
			
			
			driver.get(pan.getProperty("url"));
			driver.manage().window().maximize();
			}
			public void acti()
			{
				act=new Actions(driver);
			}
			public void aws()
			{
				driver.switchTo().frame("mainpanel");
				
				
				
				
			}
		
}
	


		
		
		
	

