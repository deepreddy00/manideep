package com.customercarewebpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class custermpagres4 extends custercarepages
{
	Select h;
	calender jm;
public custermpagres4()
{
	super();
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[contains(@id,'2f-real')]")
WebElement tmie;

@FindBy(xpath="//input[contains(@id,'5f')]")
WebElement te;


@FindBy(xpath="//a[contains(@id,'8f-btn')]")
WebElement tt;
@FindBy(xpath="//table[@class='z-calendar-body']/tbody/tr[1]/td[5]")
WebElement uft;
@FindBy(xpath="//button[contains(@id,'e3')]")
WebElement ae;




public void ert() throws Exception
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//h=new Select(tmie);
	//h.selectByIndex(0);
	tmie.sendKeys("passport id");
	te.sendKeys("r5295715");
	Thread.sleep(4000);
	//jm=new calender();
	tt.click();
	uft.click();
	ae.click();
}
public void eor() throws Exception
{
	Thread.sleep(2000);
	ae.click();
}





	
}
