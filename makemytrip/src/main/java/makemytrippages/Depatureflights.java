package makemytrippages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import makemytrip.Baseclass;

public class Depatureflights extends Baseclass
{
	
	public Depatureflights()
	{
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[1]/label/div[2]")
	List<WebElement> ad;
	
	@FindBy(id="rt-domrt-jrny")
	List<WebElement> rtr;
	
	
	
	public void depature()
	{
		ad.size();
		for(WebElement it:ad)
		{
			String dep=it.getText();
			System.out.println(it.getText());
		}
		
		
		
	}
	public void rturn()
			{
		rtr.size();
		for(WebElement yu:rtr)
		{
			String ret=yu.getText();
			System.out.println(yu.getText());
		}
		
		
		
		
		
	}
	
	
	
}
