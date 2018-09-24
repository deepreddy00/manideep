package oldhrm;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testbase.orangetestbaseold;

public class orangehrmloginpage extends orangetestbaseold
{
	
public orangehrmloginpage() throws Exception

{
	super();
	PageFactory.initElements(driver, this);
}
	
@FindBy(name="txtUserName")
WebElement no;
@FindBy(name="txtPassword")
WebElement pas;
@FindBy(name="Submit")
WebElement log;

public boolean mani(String oo,String kk)
{
	Assert.assertTrue(no.isDisplayed(), "titleis displayed");
	no.sendKeys(oo);
	pas.sendKeys(kk);
	log.click();
	return true;
	
	
}















	
	
	
	
}	

