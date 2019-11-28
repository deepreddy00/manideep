package snappicpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import snappicpages.CommonLib;
import snappicpages.bank;

public class filters extends demobankpagetest.bank
{
	
	public filters()
	{
		PageFactory.initElements(driver, this);
	}

   @FindBy(xpath="//*[@id='printing']/div[2]/form/div[1]/div/div[1]/div[3]/a")
   WebElement fselect;
   
   @FindBy(xpath="//*[@id='confirm_modal_body']/div/div/div[2]/label/img")
   WebElement fclick;
   
   @FindBy(xpath="//*[@id='confirm_modal_body']/div/div/div[5]/label/img")
   WebElement fcl;
   
   @FindBy(id="modal_add_filters")
   WebElement addfilter;
   
   @FindBy(xpath="//*[@id='guest-filters']")
   WebElement guestfilters;
   
   @FindBy(xpath="//*[@id='confirm_modal_body']/div/div/div[2]/label/img")
   WebElement gclick;
   
   @FindBy(id="photobooth_filter_details_save")
   WebElement filtersave;
   
   
   public void filter() throws Throwable
   {
	   CommonLib loti=new CommonLib(driver);
	   Thread.sleep(2000);
	   javaclick(fselect);
	   loti.pause();
	    javaclick(fclick);
	   Thread.sleep(2000);
	   javaclick(fcl);
	   loti.pause();
	   Thread.sleep(2000);
	   javaclick(addfilter);
	   //loti.WaitTillClikable(guestfilters, 30);
	   Thread.sleep(2000);
	   javaclick(guestfilters);
	   //loti.WaitTillClikable(gclick, 30);
	   Thread.sleep(2000);
	   javaclick(gclick);
	   //loti.WaitTillClikable(addfilter, 30);
	   Thread.sleep(2000);
	   javaclick(addfilter);
	   loti.WaitTillClikable(filtersave, 30);
javaclick(filtersave);
	   
	   
	   
	   
	   
   }
   
   
   
   
   
   
   
	
	
	
	
	
	
	
	
}
