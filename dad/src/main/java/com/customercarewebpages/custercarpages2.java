package com.customercarewebpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class custercarpages2  extends custercarepages
{
public custercarpages2()
{
	super();
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[contains(@class,'z-textbox')]")
	WebElement address;
	@FindBy(xpath="//input[contains(@id,'i5')]")
	WebElement add;
	@FindBy(xpath="//input[contains(@id,'v5')]")
	WebElement ad;
	@FindBy(xpath="//input[contains(@id,'86')]")
	WebElement a;
	@FindBy(xpath="//input[contains(@id,'k6')]")
	WebElement b;
	@FindBy(xpath="//input[contains(@id,'h6')]")
	WebElement e;
	@FindBy(xpath="//input[contains(@id,'n6')]")
	WebElement c;
	@FindBy(xpath="//input[contains(@id,'q6-real')]")
	WebElement d;
	@FindBy(xpath="//button[contains(@id,'e3')]")
	WebElement te;
	
	
	public void jai() throws Exception
	{
		
		address.sendKeys("sr-120");
		Thread.sleep(2000);
		
		if(add.isDisplayed())
		{
			add.sendKeys("secbad");
		}
		else
		{
			System.out.println("not displayed");
		}
		Thread.sleep(2000);
		ad.sendKeys("safilguda");
		a.sendKeys("hyd");
		e.sendKeys("telangana");
		b.sendKeys("saf");
		c.sendKeys("500056");
		d.sendKeys("india");
		te.click();
		
		
		
		
	}
	
}
