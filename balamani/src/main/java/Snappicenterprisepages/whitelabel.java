package Snappicenterprisepages;

import java.security.DomainCombiner;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class whitelabel extends bank

{
 
	bank d;
	
	public whitelabel()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='show_whitelabel_settings']")
	WebElement adddwhitelabel;
	
	@FindBy(id="new_domain_url")
	WebElement addurl;
	
	@FindBy(id="new_email")
	WebElement email;
	
	@FindBy(id="new_domain")
	WebElement newdomain;
	
	@FindBy(id="new_link_domain")
	WebElement linkdomain;
	
	@FindBy(xpath="//*[@id='settings']/div/div/div/div[1]/a")
	WebElement close;
	
	@FindBy(id="add_domain_url_button")
	WebElement adddomain;
	
	@FindBy(id="add_email_button")
	WebElement addemail;
	
	@FindBy(id="add_domain_button")
	WebElement domainbutton;
	
	@FindBy(id="add_link_domain_button")
	WebElement addlink;
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(id="photobooth_whitelabel_settings_save")
	WebElement whitelabel;
	
	
	
	
	
	public void childwindow() throws Throwable
	{
		
		
		
		 String MainWindow=driver.getWindowHandle();		
 		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	 
	                    //addurl.sendKeys("ga.yh.com");
	                    
	                    
	                    
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);				
	    }
	
	
	
	public void whitelabelsettings() throws Throwable
	{
		CommonLib rtt=new CommonLib(driver);
		rtt.pause();
		adddwhitelabel.click();
	    rtt.pause();
	    childwindow();
	    rtt.pause();
	    whitelabel.click();
	    
		
		
		
		
		
		
		
		
	}
	
	
}
