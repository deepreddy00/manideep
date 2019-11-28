package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;
import base.CommonLib;

/**
 * Hello world!
 *
 */
public class App  extends Baseclass
{
   
	public App()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='ShopifyMainNav']/ul[3]/li[3]/form/input")
	WebElement clciklogin;
	
	
	
	@FindBy(xpath="//*[@id='inputEmail']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='inputPassword']")
	WebElement password;
	
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")
	WebElement click;
	
	@FindBy(id="login")
	WebElement login;
	
	
	public void goodUSPW(String user,String pass) throws InterruptedException
	{
		CommonLib err=new CommonLib(driver);
		err.waitForElementToPresent(clciklogin, 30);
		clciklogin.click();
		err.waitforpagetoload();
		err.switchToTab(1);
		username.sendKeys(user);
		err.waitforpagetoload();
		password.sendKeys(pass);
		err.waitforpagetoload();
		//Thread.sleep(3000);
		//javascripy(click);
		err.waitforpagetoload();
		login.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
