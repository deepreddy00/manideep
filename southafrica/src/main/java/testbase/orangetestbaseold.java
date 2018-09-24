package testbase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangetestbaseold 
{
public 	static WebDriver driver;
	public static Properties po;
	public static WebDriverWait wait;
	public static Actions action;
public orangetestbaseold() throws Exception, Exception
{
   po=new Properties();
   po.load(new FileInputStream("C:\\Users\\manideep\\Downloads\\eclipse-java-neon-3-win32-x86_64\\eclipse\\ramkey\\southafrica\\src\\main\\java\\oldhrm\\old.properties"));
}

public void login()
{
	String ada=po.getProperty("browser");
	if(ada.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manideep\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(ada.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\manideep\\Downloads\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
       driver.manage().window().maximize();
       driver.get(po.getProperty("url"));
       
	
	}
   public void verify(String title)
   {
	 
	   if(driver.getTitle().equals(title))
	   {
		   System.out.println("titel is verified");
		   }
	   else
	   {
		   System.out.println("title is not verified");
		   }
   }
   public void actionw()
   {
	   action=new Actions(driver);
	   }
   
   public void aler()
   {
	   
	  driver.switchTo().alert();
	  driver.switchTo().alert().accept();
   }

   public void switc(String jk)
   {
     driver.switchTo().frame(jk);   
   }
   
   
public void edit()
{
	driver.switchTo().defaultContent();
}
   
   
   }






















