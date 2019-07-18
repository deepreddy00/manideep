package snappicpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import snappicpages.CommonLib;
import snappicpages.bank;

public class verifychangepassword extends bank

{

	public verifychangepassword()
	{
		PageFactory.initElements(driver, this);
	}
	
	
		
	@FindBy(xpath="/html/body/div[3]/div[2]/div[3]/div[1]/div/div/div/div[2]/div/div/div/div[1]/ul/li[3]/a")
	WebElement rtt;
	
	@FindBy(id="app_user_profile_current_password")
	WebElement app;
	
	
	@FindBy(id="app_user_profile_plainPassword_first")
	WebElement first;
	
	@FindBy(id="app_user_profile_plainPassword_second")
	WebElement second;
	
	
	@FindBy(xpath="//div[@class='margin-top-10']/input[@type='submit']")
	WebElement save;
	
	
	
	
	public void chagepassword()
	{
		CommonLib wer=new CommonLib(driver);
	    wer.waitForElementToPresent(rtt, 60);
	    javaclick(rtt);
	    app.sendKeys("Mani@123");
	    first.sendKeys("111");
	    second.sendKeys("111");
	    save.click();
	    
		
		
	}
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
}
