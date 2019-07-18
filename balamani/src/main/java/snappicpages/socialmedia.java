package snappicpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import snappicpages.CommonLib;
import snappicpages.bank;

public class socialmedia extends bank

{

	public socialmedia()
	{
		PageFactory.initElements(driver,this);
		}
	
		
	@FindBy(xpath="//*[@id='facebook_label']")
	WebElement disable;
	
	@FindBy(id="photobooth_social_save")
	WebElement socialsave;
	
	
	
	
	public void socialsave()
	{
		CommonLib yoyo=new CommonLib(driver);
		yoyo.WaitTillClikable(disable, 30);
		javaclick(disable);
		yoyo.WaitTillClikable(socialsave, 30);
		javaclick(socialsave);
		
		
		
	}
	
	
	
	
	
	
}
