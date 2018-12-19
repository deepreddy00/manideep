package com.customercarewebpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class custemerpages3 extends custercarepages
{
public custemerpages3()
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

public void goat() throws Exception
{
	Thread.sleep(2000);
	if(cat.isDisplayed())
	{
		cat.sendKeys("08040547080");
		System.out.println("displayed");
	}
	else
	{
		System.out.println("not displayed");
	}
	ct.sendKeys("098039404930");
	time.sendKeys("9849267299");
ee.click();
}
}






	

