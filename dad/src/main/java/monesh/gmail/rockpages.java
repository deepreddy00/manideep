package monesh.gmail;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rockpages extends potofentry
{

	public rockpages() throws Exception, Exception
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="identifier")
	WebElement frr;
	@FindBy(xpath="//span[@class='RveJvd snByac']")
			WebElement  jk;
	@FindBy(name="password")
	WebElement yu;
	



public void gain()
{
  
	frr.sendKeys("rockdon390@gmail.com");
	jk.click();
	yu.sendKeys("9000@mani");
	jk.click();
	
	
	
	
	
	
	
	
	
}


}