package snappicpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import snappicpages.bank;

//import makemytrip.Baseclass;

public class printing extends bank
{

	public printing()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="limit_num_prints")
	WebElement num;
	
	@FindBy(id="enable_auto_prints")
	WebElement num2;
	
    @FindBy(id="photobooth_printing_save")
     WebElement submit;
    
    
    public  void print()
    {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	num.click();
    	num2.click();
    	submit.click();
    	
    	
    	
    	
    	
    	
    }
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
