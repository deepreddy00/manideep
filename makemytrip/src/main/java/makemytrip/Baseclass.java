package makemytrip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass 
{

		public static WebDriver driver;
		 public static Properties patry;
		 public static Select see;
		 
		 public  Baseclass()
		 {
			 patry=new Properties();
			 try {
				patry.load(new FileInputStream("C:\\Users\\manideep\\Downloads\\eclipse-java-neon-3-win32-x86_64\\eclipse\\manideepj\\makemytrip\\makemytrip.properties"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
			 
		 }
		 public void bro(String browser)
			{
				if(browser.equals("chrome"))
				{
					driver=initChromeDriver("drivers//chromedriver.exe");
					
				}
				else if(browser.equals("firefox"))
				{
					driver=initFirefoxDriver("drivers//geckodriver.exe");
					}
				
				
				driver.get(patry.getProperty("url"));
				driver.manage().window().maximize();
				}
				

		 public void action(WebElement df)
		 {
			 Actions hh=new Actions(driver);
			 hh.click(df).perform();
			 hh.moveToElement(df).perform();
			 
		 }
		 
		
		

	public static void javascripy(WebElement wer)
	{
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();", wer);
	}

		
		
	public static WebDriver initChromeDriver(String driverPath) {
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-web-security");
		options.addArguments("--start-maximized");
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.navigate().to(url);
		return driver;
	}

	public static WebDriver initFirefoxDriver( String driverPath) {
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.navigate().to(appURL);
		return driver;
	}

	public static WebDriver initIEDriver(String url,String driverPath) {
		System.out.println("Launching ie browser..");
		System.setProperty("webdriver.ie.driver", driverPath);
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		return driver;
	}

	public static WebDriver initOpDriver(String appURL, String driverPath) {
		System.out.println("Launching opera browser..");
		System.setProperty("webdriver.opera.driver", driverPath);
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}


	









public void clender(WebDriver driver,WebElement element,String dta)
{
	
	JavascriptExecutor js=((JavascriptExecutor) driver);
	js.executeScript("arguments[0].setAttribute('value','"+dta+"');",element);
}
}

