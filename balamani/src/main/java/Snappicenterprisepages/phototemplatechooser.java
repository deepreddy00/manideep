package Snappicenterprisepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import makemytrip.Baseclass;

public class phototemplatechooser extends bank
{
	
	CommonLib jh;
 
	public phototemplatechooser()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='template_library_button']")
	WebElement ert;
	
	
	//*[@id="template_library_button"]
	
	@FindBy(xpath="//*[@id='tab_1']/div/div[4]/label/img")
	WebElement image;
	
	
	
	@FindBy(id="still-template")
	WebElement template;
	
	@FindBy(id="save-animated-overlay")
	WebElement anisave;
	
	//*[@id="animated-template"]
	
	@FindBy(xpath="//*[@id='animated-template']")
	WebElement animated;
	
	
	
	
	@FindBy(id="photobooth_template_design_save")
	WebElement photo;
	
	@FindBy(id="photobooth_branding_save")
	WebElement app;
	
	public void ho() throws Throwable
	{
		jh=new CommonLib(driver);
		jh.pause();
		//Thread.sleep(6000);
		javaclick(ert);
		Thread.sleep(4000);
		javaclick(image);
		Thread.sleep(2000);
		javaclick(animated);
		Thread.sleep(2000);
		javaclick(anisave);
		Thread.sleep(2000);
		photo.click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
