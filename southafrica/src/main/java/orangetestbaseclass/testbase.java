package orangetestbaseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testbase 
{
  
	public static WebDriver driver;
	public static Properties pro;
	
	public testbase() throws Exception, Exception
	{
	pro=new Properties();
	pro.load(new FileInputStream("C:\\Users\\manideep\\Downloads\\eclipse-java-neon-3-win32-x86_64\\eclipse\\ramkey\\southafrica\\src\\main\\java\\orange.properties"));
		
		
	}
	
	public static void intir()
	{
		String ho=pro.getProperty("browser");
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
           driver.manage().window().maximize();
           driver.get(pro.getProperty("url"));
		
		
		
		
		
	}


		
	}
	
	

