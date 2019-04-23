package makemytrippages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import makemytrip.Baseclass;

public class Makemytriphomepage extends Baseclass

{
	
	//String dta="23 Apr 2019";
	//String fta="30 Apr 2019";
	public Makemytriphomepage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a/span[@class='chNavText darkGreyText']")
	WebElement flights;
	
	@FindBy(xpath="//li[contains(text(),'Round Trip')]")
	WebElement trip;
	
	@FindBy(id="fromCity")
	WebElement dropdown1;
	
	@FindBy(id="toCity")
	WebElement dropdown2;
	
	@FindBy(xpath="//span[contains(text(),'DEPARTURE')]")
	WebElement departure;
	
    	
	@FindBy(xpath="//span[contains(text(),'RETURN')]")
	WebElement ret;
	
	@FindBy(xpath="//a[contains(text(),'Search')]")
	WebElement search;
	
	@FindBy(xpath="//div[@class='DayPicker-Body']/div[@class='DayPicker-Week']")
	List<WebElement> cal;
	
	
	
	public void home() throws Throwable
	{
		flights.click();
		trip.click();
		dropdown1.sendKeys("Delhi");
		dropdown2.sendKeys("Banglore");
		//dropdown2.sendKeys(Keys.ARROW_DOWN.ENTER);
		Baseclass jk=new Baseclass();
		Thread.sleep(5000);
		//String tommorowsDate ="10-OCTOBER-2019";
		departure.click();
		//clander();
		cal();
		//departure.clear();
		jk.clender(driver, departure,"25 Apr 19");
		//ret.click();
		jk.clender(driver, ret,"25 Apr 19" );
		
		jk.javascripy(search);
		
		
		
	}
	
	public void clander()
	{
		//SimpleDateFormat df = new SimpleDateFormat(“23/04/2019”);
		
		SimpleDateFormat df=new SimpleDateFormat("25-04-19");
		Date dt = new Date();

		Calendar cl = Calendar.getInstance();
		cl.setTime(dt);;
		cl.add(Calendar.DAY_OF_YEAR, 1);
		dt=cl.getTime();

		String str = df.format(dt);
		departure.sendKeys(str);
	}
	
	
	
	
	
	public void cal()
	{
	cal.size();
	
	
	
	for(WebElement se:cal)
	{
		
		System.out.println(se.getText());
		String data=se.getText();
		//int dateInt = Integer.parseInt(data);
		
			if(data==("13"))
			{
				
				se.click();
			}
			else
			{
				System.out.println("poyot");
				//se.click();
			}
			
		
		
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
