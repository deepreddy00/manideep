package condrapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import condra.condotestbaseclass;

public class conpages3 extends condotestbaseclass
{

	
	
public conpages3()
{
	super();
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[contains(@id,'q3')]")
WebElement cat;


@FindBy(xpath="//input[contains(@id,'e6')]")
WebElement ct;

@FindBy(xpath="//input[contains(@id,'t3')]")
WebElement time;
@FindBy(xpath="//button[contains(@id,'e3')]")
WebElement ee;

public void gt(String num1,String num2,String num3) throws Exception
{
	Thread.sleep(2000);
	if(cat.isDisplayed())
	{
		cat.sendKeys(num1);
		System.out.println("displayed");
	}
	else
	{
		System.out.println("not displayed");
	}
	ct.sendKeys(num2);
	time.sendKeys(num3);
ee.click();
}
}


