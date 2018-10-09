package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.testbasefreecrm;

public class freecrmpages extends testbasefreecrm
{
	
	
	
 public freecrmpages() {
		// TODO Auto-generated constructor stub
		super();
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="username")
	WebElement foster;
	@FindBy(name="password")
	WebElement fosr;
	@FindBy(xpath="//div[@class='input-group-btn']/input")
	WebElement fo;
	
	
	
	public void jact()
	{
		Boolean j= foster.isDisplayed();
		foster.clear();
		System.out.println(j);
		foster.sendKeys(pan.getProperty("username"));
		Boolean io= fosr.isDisplayed();
		fosr.clear();
		System.out.println(io);
		fosr.sendKeys(pan.getProperty("password"));
         fo.click();
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	}
