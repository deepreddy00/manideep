package com.customercarewebpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.customercarweb.custermcasepage;

public class custercarepages1 extends custermcasepage
{
 static Select x;
calender l;
 
 
public custercarepages1()
{
	
	super();
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='z-combobutton-button']")
WebElement root;
@FindBy(xpath="//span[contains(text(),'Create Private Account')]")
WebElement rar;
@FindBy(xpath="//input[@class='z-combobox-input']")
WebElement fh;
@FindBy(xpath="//input[contains(@id,'t3')]")
WebElement yu;
@FindBy(xpath="//input[contains(@id,'w3')]")
WebElement jkl;

@FindBy(xpath="//input[contains(@id,'z3')]")
WebElement jl;

@FindBy(xpath="//input[contains(@id,'14-real')]")
WebElement y;


@FindBy(xpath="//input[contains(@id,'74-real')]")
WebElement trg;

@FindBy(xpath="//input[contains(@id,'a4-real')]")
WebElement rft;

@FindBy(xpath="//table[@class='z-calendar-body']/tbody/tr[1]/td[5]")
WebElement ui;

@FindBy(xpath="//a[contains(@id,'74-btn')]")
WebElement r;



@FindBy(xpath="//button[contains(@id,'e3')]")
WebElement qe;

public void matt() throws Exception
{
	ac();
	Thread.sleep(4000);
	root.click();
	act.moveToElement(rar).build().perform();
	act.click(rar).perform();
}
public void anuhj() throws Exception 
{
	Thread.sleep(4000);
	fh.sendKeys("mr.");
	Thread.sleep(4000);
	
    yu.sendKeys("mani");
    jkl.sendKeys("vallapu");
    jl.sendKeys("slingala");
    y.sendKeys("male");
    Thread.sleep(2000);
    l=new calender();
    WebElement cal=driver.findElement(By.xpath("//input[contains(@id,'74-real')]"));
	String dta="16-02-1993";
    l.clender(driver,cal, dta);
    rft.sendKeys("india");
    Thread.sleep(2000);
    qe.click();
    
    
    
    
	
	
}


	







}
