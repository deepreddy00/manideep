package monesh.gmail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class potofentry 
{
public static WebDriver driver;
public static Properties pank;
public  potofentry() throws Exception, IOException
{
	pank=new Properties();
	pank.load(new FileInputStream("C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\ramkey.properties"));
	}
	
public void jki()
{
	String oi=pank.getProperty("browser");
	if(oi.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manideep\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(pank.getProperty("url"));
		}
	driver.manage().window().maximize();
}




	
	
	
	
	
	
	
	
	
	
	
	
	
}
