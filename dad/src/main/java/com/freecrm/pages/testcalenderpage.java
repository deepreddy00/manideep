package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.freecrm.testbasefreecrm;

import javaapachce.Xls_Reader;

public class testcalenderpage extends testbasefreecrm
{
	public static Xls_Reader raw;
	Select df;
	
     Actions act;
	public testcalenderpage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li/a[contains(text(),'Calendar')]")
	WebElement ino;
	@FindBy(xpath="//li/a[contains(text(),'New Event')]")
	WebElement ii;
	@FindBy(id="title")
	WebElement ol;
	
	@FindBy(id="fieldId_start")
	WebElement ani;
	@FindBy(id="btnClear")
	WebElement ai;
	
	@FindBy(id="f_trigger_c_start")
	WebElement ioo;
	
	@FindBy(xpath="//div[@class='calendar']/table/thead/tr[@class='headrow']/td[4]")
	WebElement ikea;
	
	@FindBy(xpath="//div[@class='calendar']/table/tbody/tr[1][@class='daysrow']/td[7]")
	WebElement ia;
	
	
	@FindBy(name="category")
	WebElement koin;
	@FindBy(xpath="//input[@type='button']")
	WebElement onn;
	
	@FindBy(xpath="//input[@type='radio][1]")
	WebElement pus;
	
	@FindBy(name="contact_lookup")
	WebElement ex;
	@FindBy(name="client_lookup")
	WebElement ex1;
	@FindBy(name="prospect_lookup")
	WebElement ex2;
	@FindBy(name="task_lookup")
	WebElement ex3;
	@FindBy(name="case_lookup")
	WebElement ex4;
	@FindBy(name="tags")
	WebElement ex5;
	@FindBy(name="location")
	WebElement ex6;
	@FindBy(name="notes")
	WebElement ex7;
	@FindBy(name="meeting_notes")
	WebElement ex8;
	@FindBy(xpath="//input[@type='submit']")
    WebElement ent;	
	
	
	
	
	
	
	
	
	
	
	
	
	public void mars()
	{
	      
		act=new Actions(driver);
		aws();
		act.moveToElement(ino).perform();
		act.click(ii).perform();
		raw=new Xls_Reader("C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\javaapachce\\freecrm.xlsx");
		String er=raw.getCellData("Sheet1", "Title", 2);
		ol.sendKeys(er);
		}
	public void mottu() throws Exception
	{
	ani.click();
	ai.click();
	Thread.sleep(2000);
	ioo.click();
		ikea.click();
		ia.click();
		
		
	}
	
	public void sec()
	{
		df=new Select(koin);
		df.selectByIndex(3);
		}
	
	public void manit()
	{
		onn.click();
		pus.click();
	}
	
	public void exce()
	{
		
		raw=new Xls_Reader("C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\javaapachce\\freecrm.xlsx");
		
		String t1=raw.getCellData("Sheet1", "Note", 2);
		ex.sendKeys(t1);
		
		String t2=raw.getCellData("Sheet1", "Contact", 2);
		ex1.sendKeys(t2);
		String t3=raw.getCellData("Sheet1", "Company", 2);
		ex2.sendKeys(t3);
		String t4=raw.getCellData("Sheet1", "Task", 2);
		ex3.sendKeys(t4);
		String t5=raw.getCellData("Sheet1", "Case", 2);
		ex4.sendKeys(t5);
		String t6=raw.getCellData("Sheet1", "Tags", 2);
		ex5.sendKeys(t6);
		String t7=raw.getCellData("Sheet1", "Location", 2);
		ex6.sendKeys(t7);
		String t8=raw.getCellData("Sheet1", "Notes", 2);
		ex7.sendKeys(t8);
		
		String t9=raw.getCellData("Sheet1", "Minutes", 2);
		ex8.sendKeys(t9);
		ent.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
