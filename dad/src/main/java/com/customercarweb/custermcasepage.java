package com.customercarweb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class custermcasepage
{
	public static WebDriver driver;
	public static Properties prp;
	public static Actions act;
public 	custermcasepage()
{
	prp=new Properties();
	try {
		prp.load(new FileInputStream("C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\customercarweb.properties"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void url()
	{
		String ojk=prp.getProperty("browser");
		if(ojk.equals("inter"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\manideep\\Downloads\\IEDriverServer_Win32_3.11.1\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			}
		else if(ojk.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manideep\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	
	driver.get(prp.getProperty("url"));
	driver.manage().window().maximize();
	
}
	
	public void ac()
	{
		act=new Actions(driver);
	}
	
	
	
	

	
	
	public void wa()
	{
		//String ti=prp.getProperty("tile");
	 if(driver.equals("CustomerCare Web"))
	 {
		 System.out.println("tilte is displayed");
		 
	 }
	 else
	 {
		 System.out.println("tile is not displayed");
		 
	 }
		
		
		
	}

	
	
	
	
	
	
	
	
	}
