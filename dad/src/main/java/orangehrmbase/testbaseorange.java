package orangehrmbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testbaseorange
{
	public static WebDriver driver;
	public static Properties go;
	public static WebDriverWait wai;

	public testbaseorange()
	{
		go=new Properties();
		try {
			go.load(new FileInputStream("C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\orange.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void orange()
	{
		String ho=go.getProperty("browser");
		if(ho.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manideep\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();	
			
		}
		else if(ho.equals("firfox"))
		{
			System.setProperty("webdriver.driver.chrome", "C:\\Users\\manideep\\Desktop\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();
		}
		
		driver.get(go.getProperty("url"));
		driver.manage().window().maximize();
		}
	
	public void wqao(String ter)
	{
	wai=new WebDriverWait(driver, 60);
	Boolean hj=wai.until(ExpectedConditions.titleIs(ter));
	System.out.println(hj);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
