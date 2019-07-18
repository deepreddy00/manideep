package snappicpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import snappicpages.CommonLib;
import snappicpages.bank;

public class verifymyprofile extends bank

{

	public verifymyprofile()
	{
		PageFactory.initElements(driver, this);
		}
  
	// /html/body/div[1]/div/ul[1]/div[2]/a/span
	
	@FindBy(xpath="/html/body/div[1]/div/ul[1]/div[2]/a/span")
	WebElement ert;
	
	@FindBy(xpath="/html/body/div[1]/div/ul[1]/div[2]/ul/li[1]/a")
	WebElement pro;

	@FindBy(id="app_user_profile_full_name")
	WebElement appfullname;
	
	@FindBy(id="app_user_profile_email")
	WebElement appemail;
	
	@FindBy(id="app_user_profile_city")
	WebElement profile;
	
	@FindBy(id="app_user_profile_country")
	WebElement country;
	
	@FindBy(id="app_user_profile_timezone")
	WebElement timezone;
	
	//*[@id="tab_1_1"]/form/div/div[7]/input
	
	@FindBy(xpath="//*[@id='tab_1_1']/form/div/div[7]/input")
	WebElement saveprofile;
	
	
	@FindBy(xpath="//*[@id='profile_updated']/div/div/div[4]/button")
	WebElement fg;
	
	public void profile() throws Exception
	{
		//Thread.sleep(3000);
		//ert.click();
		//bank df=new bank();
		
		
		CommonLib ER=new CommonLib(driver);
		//ER.waitForElementToPresent(ert,60);
		Actions hss=new Actions(driver);
		ER.waitForElementToPresent(ert,60);
		//hss.click(ert).build().perform();
		hss.click(ert).build().perform();
		ER.waitForElementToPresent(pro,60);
		hss.moveToElement(pro).build().perform();
		ER.waitForElementToPresent(appfullname, 100);
		appfullname.clear();
		appfullname.sendKeys("manideep");
		appemail.clear();
		appemail.sendKeys("manideepqa93@gmail.com");
		//appemail.click();
		profile.clear();
		profile.sendKeys("johannesburg");;
		CommonLib we=new CommonLib(driver);
		we.getDropdownValue(country,5);
		we.getDropdownValue(timezone, 3);
		saveprofile.click();
		Thread.sleep(3000);
		fg.click();
		
		
		
		
				
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
