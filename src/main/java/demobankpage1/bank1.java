package demobankpage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demobankpagetest.bank;

public class bank1 extends bank
{
	
	public bank1()
	{
		super();
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(name="uid")
	WebElement ji;
	@FindBy(name="password")
	WebElement ko;
	@FindBy(name="btnLogin")
	WebElement king;
	
	
	
	
	public void poste()
	{
		ji.sendKeys(pro.getProperty("user"));
		ko.sendKeys(pro.getProperty("pass"));
		king.click();
		
				
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
