package condra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class condotestbaseclass 
{
	
		public static WebDriver driver;
		public static Properties prp;
		public static Actions act;
	public 	condotestbaseclass()
	{
		prp=new Properties();
		try {
			prp.load(new FileInputStream("C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\condra\\mn.properties"));
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
    











}



