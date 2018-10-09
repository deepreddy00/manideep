package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.testbasefreecrm;

import javaapachce.Xls_Reader;
import testutil.anttestdata;

public class testcontactpage  extends testbasefreecrm
{

	public static Xls_Reader rsm;
	
	public testcontactpage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//li/a[contains(text(),'Companies')]")
	WebElement ant;
	@FindBy(xpath="//li/a[contains(text(),'New Company')]")
	WebElement oii;
	
	@FindBy(name="company_name")
	WebElement fog;
	@FindBy(name="industry")
	WebElement fog1;
	@FindBy(name="annual_revenue")
	WebElement fog2;
	@FindBy(name="num_of_employees")
	WebElement fog3;
	
	@FindBy(name="status")
	WebElement fog4;
	
	@FindBy(name="category")
	WebElement fog5;
	@FindBy(name="priority")
	WebElement fog6;
	@FindBy(name="source")
	WebElement fog7;
	@FindBy(name="identifier")
	WebElement fog8;
	@FindBy(name="vat_number")
	WebElement fog9;
	@FindBy(xpath="//input[@type='submit']")
WebElement kk;


public void motion(String Title,String Note,String Contact,String Company)
{
    //rsm=new Xls_Reader("C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\javaapachce\\freecrm.xlsx");
	  fog.clear();
	  fog.sendKeys(Title);
	  fog1.clear();
	  fog1.sendKeys(Note);
	  fog2.clear();
	  fog2.sendKeys(Contact);
	  fog3.clear();
	  fog3.sendKeys(Company);
	  
	
	
}
public void point()
{
	acti();
	act.moveToElement(ant).perform();
	act.click(oii).perform();
	
	
	
	
}






}











