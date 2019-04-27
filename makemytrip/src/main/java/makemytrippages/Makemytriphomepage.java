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
	
	
	@FindBy(xpath="//div[@class='dateInnerCell']")
	List<WebElement> depo;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]")
		List<WebElement> rett;
	
	
	//*[@id="ow_domrt-jrny"]/div[2]/div[1]
	//*[@id="ow_domrt-jrny"]/div[2]/div[2]
	
	
	
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
		//departure.clear();
		Thread.sleep(7000);
		//jk.clender(driver, departure,"27-04-19");
		//ret.click();
		//jk.clender(driver, ret,"30-04-19" );
	     cal("30");
	     Thread.sleep(4000);
	     cal("5");
	     Thread.sleep(7000);
		jk.javascripy(search);
		
		
		
	}
	
	
	
	

	public void retu()
	{
	rett.size();
	
	
	for(int i=0;i<=rett.size();i++)
	{
	String text=rett.get(i).getText();	
	System.out.println(text);
	if(text.equalsIgnoreCase("14"))
	{
	   rett.get(i).click();
	   break;
		
	}
	}
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
	
	
	
	
	
	public void cal(String value)
	{
	depo.size();
	
	
	for(int i=0;i<=depo.size();i++)
	{
	String text=depo.get(i).getText();	
	System.out.println(text);
	if(text.equalsIgnoreCase(value))
	{
	   depo.get(i).click();
	   break;
		
	}
		
		
		
	
	
		
		
	}
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
