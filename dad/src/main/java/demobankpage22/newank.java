package demobankpage22;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import demo.bank;

public class newank extends bank
{
	public static Select see;
		
	public newank()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='menusubnav']/li/a[contains(text(),'New Account')]")
	WebElement yoo;
	@FindBy(name="cusid")
	WebElement joo;
	@FindBy(name="selaccount")
	WebElement johy;
	
	@FindBy(name="inideposit")
	WebElement jo;
	@FindBy(name="button2")
	WebElement j;
	
	
	
	public void sel()
	{
		see=new Select(johy);
		see.selectByIndex(1);
		
	}
	
	public void party()
	{
	
		yoo.click();
		joo.sendKeys(pro.getProperty("name"));
		sel();
		jo.sendKeys(pro.getProperty("dep"));
		j.click();
}

}