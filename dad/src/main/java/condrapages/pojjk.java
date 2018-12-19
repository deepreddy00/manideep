package condrapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import condra.condotestbaseclass;

public class pojjk  extends condotestbaseclass
{
	WebDriverWait wait;
	public pojjk()
	
	{
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@class='dlg-auth-text-user z-textbox']")
	WebElement rat;
	@FindBy(xpath="//input[@class='dlg-auth-text-pass z-textbox']")
	WebElement fgh;
	@FindBy(xpath="//button[@type='button']")
	WebElement ty;
	 
	public void custeomer() throws Exception
	{
		wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleIs("CustomerCare Web"));
		rat.sendKeys(prp.getProperty("user"));
		fgh.sendKeys(prp.getProperty("password"));
		Thread.sleep(4000);
		ty.click();
		
		
		
	}
}
