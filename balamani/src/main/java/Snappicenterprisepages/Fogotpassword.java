
package Snappicenterprisepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Fogotpassword extends bank
{
	public Fogotpassword()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="forget-password")
	WebElement fpassword;
	
	@FindBy(id="username")
	WebElement user;
	
	@FindBy(xpath="/html/body/div[2]/form/div[3]/button[2]")
	WebElement right;
	
	@FindBy(id="back-btn")
	WebElement back;
	
	// /html/body/div[2]/form/div[3]/button[2]
	
	
	public void forgot()
	{
		fpassword.click();
		user.sendKeys("manideepqa93@gmail.com");
		right.click();
		driver.close();
		
		
		
	}
	
	
	
	

}
