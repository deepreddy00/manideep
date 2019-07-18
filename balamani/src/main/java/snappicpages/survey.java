package snappicpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class survey extends bank

{
	
	
	public survey()
	{
		
	}
	
	
	@FindBy(id="photobooth_data_capture_title")
	WebElement title;
	
	
	
	@FindBy(id="photobooth_data_capture_description")
	WebElement descr;
	
	
	
	
	
	

}
