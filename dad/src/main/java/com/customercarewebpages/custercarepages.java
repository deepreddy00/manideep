package com.customercarewebpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.customercarweb.custermcasepage;

public class custercarepages extends custermcasepage
{
	public custercarepages()
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
		wa();
		rat.sendKeys(prp.getProperty("user"));
		fgh.sendKeys(prp.getProperty("password"));
		Thread.sleep(4000);
		ty.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
