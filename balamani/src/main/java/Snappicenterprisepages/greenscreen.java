package Snappicenterprisepages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class greenscreen extends bank


{
	bank i;
	
	public greenscreen()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="snappic_green_screen_save")
	WebElement greenscreensave;
	
	
	
	@FindBy(id="snappic_green_screen_background_image_background")
	WebElement imagebackground;
	
	
	
	//*[@id="snappic_green_screen_background_image_background"]
	
	@FindBy(id="form_pay_later")
	WebElement paylater;
	
	
	public void greecreen() throws Throwable
	{
		Thread.sleep(4000);
		javaclick(imagebackground);
		CommonLib ui=new CommonLib(driver);
	    Thread.sleep(6000);
		ui.uploadFileWithRobot("//Users//MushroomCloud//Desktop//screenshots//Screen Shot 2019-05-20 at 14.34.26");
		Thread.sleep(2000);
		javaclick(greenscreensave);
		ui.WaitTillClikable(paylater, 30);
		javaclick(paylater);
		
		
	}

}
