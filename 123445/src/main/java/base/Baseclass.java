package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass 
{

		public static WebDriver driver;
		 public static Properties patry;
		 public static Select see;
		 
		 public  Baseclass()
		 {
			 patry=new Properties();
			 try {
				patry.load(new FileInputStream("//Users//manideepreddyvallapu//Documents//workspace//123445//src//main//java//demo.properties"));
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
					System.setProperty("webdriver.chrome.driver", "/Users/manideepreddyvallapu/Documents/workspace/123445/driver/chromedriver");
					  driver=new ChromeDriver();
					
				}
				else if(browser.equals("firefox"))
				{
					driver=initFirefoxDriver("driver//geckodriver.exe");
					}
				
				
				driver.get(patry.getProperty("url"));
				//driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
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
		options.addArguments("--incognito");
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


	
	
	public void opneNewTabRobot() throws Throwable {

		Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
        
        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	
	
	public void acceptAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			alert.dismiss();
		} catch (Exception e) {
		}
	}


	
	
	
	public void haa(WebElement el)
	{
		Boolean sd=el.isDisplayed();
		if(sd.equals(true))
		{
			el.click();
		}
		else
		{
			System.out.println("element not visiable");
			
		}
		
		
	}






public void clender(WebDriver driver,WebElement element,String dta)
{
	
	JavascriptExecutor js=((JavascriptExecutor) driver);
	js.executeScript("arguments[0].setAttribute('value','"+dta+"');",element);
}
}

