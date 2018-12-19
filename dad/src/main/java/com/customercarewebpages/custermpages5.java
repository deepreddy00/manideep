
package com.customercarewebpages;

import java.util.Calendar;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javaapachce.Xls_Reader;

public class custermpages5 extends custercarepages
{
	
	public static Xls_Reader ex;
public  custermpages5()
{
	super();
}


@FindBy(xpath="//input[contains(@id,'z4-real')]")
WebElement pater;
@FindBy(xpath="//button[contains(@id,'e3')]")
WebElement eee;

@FindBy(xpath="//input[contains(@id,'pa-real')]")
WebElement ater;


@FindBy(xpath="//div[contains(@class,'z-listcell-content')]")
WebElement ponty;
@FindBy(xpath="//input[contains(@id,'qa')]")
WebElement aer;
@FindBy(xpath="//button[@type='button']")
WebElement iok;

@FindBy(xpath="//input[contains(@id,'8j')]")
WebElement pter;

@FindBy(xpath="//button[contains(@id,'ih')]")
WebElement r;

@FindBy(xpath="//button[contains(@class,'small z-button')]")
WebElement rat;

@FindBy(xpath="//button[contains(@id,'e3')]")
WebElement foth;
@FindBy(xpath="//button[contains(@id,'g3')]")
WebElement fhk;


@FindBy(xpath="//span[contains(@id,'-cm')]")
WebElement th;

@FindBy(xpath="//span[contains(@id,'ce-cnt')]")
WebElement fth;

@FindBy(xpath="//input[contains(@id,'74-real')]")
WebElement cal;



public void montey() throws Exception
{
	Thread.sleep(2000);
pater.sendKeys("billing group alert");
eee.click();
	}
public void ot() throws Exception
{
	Thread.sleep(2000);
	ponty.click();
	Thread.sleep(4000);
	ater.click();
	Thread.sleep(2000);
	aer.sendKeys("4");
	eee.click();
	
}
public void loop()
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	iok.click();

}


public void uie(String port,String port1,String port2)
{
	ex=new Xls_Reader("C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\condra\\sim.xlsx");
	String jk=ex.getCellData("sim", "testdata", 2);
	pter.sendKeys(jk);
	
	String h=ex.getCellData("sim", "testdate1", 2);
	pter.sendKeys(h);	
	
	String t= ex.getCellData("sim", "testdate2", 2);
	 pter.sendKeys(t);
		
	}
	
public void ne() throws Exception
{
	Thread.sleep(2000);
	rat.click();
	r.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	fth.click();
	Thread.sleep(2000);
	th.click();
	foth.click();
	Thread.sleep(3000);
	foth.click();
	Thread.sleep(2000);
	fhk.click();
	
	
	
	
	
	
}







}