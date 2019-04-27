package goibibo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hamcrest.core.StringStartsWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import makemytrip.Baseclass;

public class homepage extends Baseclass
{

	public homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css=".ng-scope")
	WebElement roundtrip;
	
	
	
	@FindBy(xpath="//span[starts-with(@id, 'departure-link')]")
	WebElement from;
	
	@FindBy(xpath="//span[starts-with(@id, 'arrival-link')]")
	WebElement to;
	
	
	
	//*[@id="searchWidgetCommon"]/div[1]/div[1]/div[1]/div/div[6]/div/div/div[2]/div[3]
	
	@FindBy(css=".text-group__body")
	WebElement rett;
	
	@FindBy(css=".text-group ng-scope")
	WebElement dep;
	
	@FindBy(id="webklipper-publisher-widget-container-notification-close-div")
	WebElement phone;
	
	@FindBy(css=".btn1")
   WebElement submit;	
	
	@FindBy(css=".datepicker-table__col ng-scope")
	List<WebElement> date;
	
	@FindBy(id="search-for-flights-button")
	WebElement date1;
	
	public void rety() throws Throwable
	{
		Thread.sleep(4000);
		//haa(roundtrip);
		Thread.sleep(2000);
		from.sendKeys("Delhi(DEL)");
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//opneNewTabRobot();
		to.sendKeys("Bangalore (BLR)");
		to.sendKeys(Keys.ENTER);
		Thread.sleep(9000);
		//driver.switchTo().frame("welogin");
		//phone.click();
		//submit.click();
	     //opneNewTabRobot();
		javascripy(dep);
		Thread.sleep(3000);
		calndergo("29");
		haa(rett);
		Thread.sleep(3000);
		calndergo("13");
		haa(date1);
		
		
		
		
		
	}
	
	
	public void cj() throws Throwable
	{
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>hji=ids.iterator();
		String parent=hji.next();
		String child=hji.next();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		//driver.getTitle();
		System.out.println(driver.getTitle());
		haa(dep);
	
	
	}
	
	public void calndergo(String value)
	{
		System.out.println(date.size());
		
		for(int i=0;i<=date.size();i++)
		{
			String rat=date.get(i).getText();
			if(rat.equalsIgnoreCase(value))
			{
				date.get(i).click();
				
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
