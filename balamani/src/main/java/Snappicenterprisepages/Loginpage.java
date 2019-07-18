package Snappicenterprisepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginpage extends bank



{

	public Loginpage()
	{
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(id="username")
	WebElement name;
	
	@FindBy(id="password")
	WebElement paswword;
	
	@FindBy(id="_submit")
	WebElement submit;
	
	@FindBy(xpath="/html/body/div[1]/div/ul[1]/div[2]/a/span")
	WebElement ert;
	
	
	
	public void login() throws Throwable
	{
		name.sendKeys(pro.getProperty("email"));
		paswword.sendKeys(pro.getProperty("password"));
		submit.click();
		
		}
	
	
	
	
	public void login2()
	{
		name.sendKeys(pro.getProperty("email2"));
		paswword.sendKeys(pro.getProperty("password2"));
		submit.click();
		
	}
	
	
	
	
	
	public void loin3()
	{
		name.sendKeys(pro.getProperty("email3"));
		paswword.sendKeys(pro.getProperty("password3"));
		submit.click();
		
		}
	}
