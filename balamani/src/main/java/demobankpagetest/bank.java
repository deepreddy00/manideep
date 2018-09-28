package demobankpagetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
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
		pro.load(new FileInputStream("C:\\Users\\manideep\\Downloads\\eclipse-java-neon-3-win32-x86_64\\eclipse\\ramkey\\balamani\\src\\main\\java\\demobankpage1\\tor.properties"));
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
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manideep\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(ho.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\manideep\\Downloads\\geckodriver-v0.20.1-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
		
		
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		}
		

 
 
    		
}

		
		
		
		
		
	
	
	
	
	
	

	
	
	
	
	
	
	
	

