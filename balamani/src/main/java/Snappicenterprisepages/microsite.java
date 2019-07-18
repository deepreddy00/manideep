package Snappicenterprisepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//import makemytrip.Baseclass;

public class microsite extends bank
{
	
	
	public microsite()
	{
		PageFactory.initElements(driver, this);
	}

	//*[@id="template_library_button"]/span
	
	//*[@id="mush_carousel_ul"]/li[3]/label
	
	@FindBy(xpath="//*[@id='template_library_button']/span")
	WebElement iron;
	
	
	@FindBy(xpath="//*[@id='mush_carousel_ul']/li[3]/label")
	WebElement site;
	
	
	//*[@id="templates_modal"]/div/div/div[2]/div[2]/button
	
	@FindBy(xpath="//*[@id='templates_modal']/div/div/div[2]/div[2]/button")
	WebElement wet;
	
	@FindBy(id="photobooth_mini_site_save")
	WebElement minisave;
	
	public void micr() throws Throwable
	{
		Thread.sleep(5000);
		javaclick(iron);
		Thread.sleep(5000);
		javaclick(site);
		Thread.sleep(5000);
		javaclick(wet);
		Thread.sleep(6000);
		javaclick(minisave);
	}
	
	
	
	
	
	
	
	
	
	
}
