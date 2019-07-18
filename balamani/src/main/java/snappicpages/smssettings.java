package snappicpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import snappicpages.CommonLib;
import snappicpages.bank;

public class smssettings extends bank
{

	
	public smssettings()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="photobooth_sms_sms_message")
	WebElement smsmessage;
	
	@FindBy(id="photobooth_sms_save")
	WebElement smssave;
	
	
	public void sms()
	{
		CommonLib er=new CommonLib(driver);
		er.waitForElementToPresent(smsmessage, 20);
		smsmessage.sendKeys("manideep photos");
		javaclick(smssave);
		
		
		
		
		
	}


	
	
	
	
	
	
	
	
	
}
