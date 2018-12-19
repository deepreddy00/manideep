package orangehrmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrmbase.testbaseorange;

public class orangehrmpage extends testbaseorange

{
	testbaseorange ji;

	
public orangehrmpage()
{
	
	super();
	PageFactory.initElements(driver, this);
	}
	

@FindBy(name="txtUserName")
WebElement fg;

@FindBy(name="txtPassword")
WebElement pert;

@FindBy(name="Submit")
WebElement ois;


public void bshks()
{
	ji=new testbaseorange();
fg.sendKeys(go.getProperty("username"));
pert.sendKeys(go.getProperty("password"));
ois.click();
	
	
	
	
}





}