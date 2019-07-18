package snappicpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import snappicpages.CommonLib;
import snappicpages.bank;

public class proeventEmail extends bank

{

	public proeventEmail()
	{
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="photobooth_email_replyTo")
	WebElement emailreply;
	
	@FindBy(id="photobooth_email_body")
	WebElement emailbody;
	
	@FindBy(xpath="//*[@id='email']/div[2]/div/div/div[1]/div[6]/div/div[2]/div/label/span[6]")
	WebElement tick;
	
	@FindBy(id="photobooth_email_save")
	WebElement emailsave;
	
	
	
	public void proemail()
	{
		CommonLib uo=new CommonLib(driver);
		uo.waitForElementToPresent(emailreply, 30);
		emailreply.sendKeys("manideepqa93@gmail.com");
		emailbody.sendKeys("no body");
		uo.WaitTillClikable(tick, 30);
		javaclick(tick);
		uo.WaitTillClikable(emailsave, 30);
		javaclick(emailsave);
		}
	
	
	
	
	
}
