package demobankpagetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class bank 
{
 public static WebDriver driver;
 public static Properties pro;
 public static Select see;
 
 public bank()
 {
	 pro=new Properties();
	 try {
		pro.load(new FileInputStream("//Users//manideepreddyvallapu//git//manideep//balamani//src//main//java//demobankpage1//tor.properties"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 }
 public void bro()
	{
	 String ho=pro.getProperty("browser");
		if(ho.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/MushroomCloud/git/manideep/balamani/gecodriver/chromedriver 3");
			 driver=new ChromeDriver();
		}
		else if(ho.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "//Users/MushroomCloud//git//manideep//balamani//gecodriver//geckodriver");
			 driver=new FirefoxDriver();
			}
		
		
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		}
		

 

	public static void javaclick(WebElement wer)
	{
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();", wer);
	} 
    		
}

		
		
		
		
		
	
	
	
	
	
	

	
	
	
	
	
	
	
	

