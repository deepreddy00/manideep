package snappicpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class snappicregister extends bank

{
	
	
	public snappicregister()
	{
		  PageFactory.initElements(driver,this);
		}
	
	
	@FindBy(id="register-btn")
	WebElement register;
	
	@FindBy(id="fos_user_registration_form_full_name")
	WebElement fullname;
	
	@FindBy(id="fos_user_registration_form_city")
	WebElement city;
	
	@FindBy(id="fos_user_registration_form_email")
	WebElement email;
	
	//*[@id="select2-chosen-3"]
	
	@FindBy(xpath="//*[@id='select2-chosen-3']")
	WebElement select;
	
	@FindBy(id="select2-chosen-2")
	WebElement selct2;
	
	@FindBy(id="fos_user_registration_form_plainPassword_first")
	WebElement pasword;
	
	@FindBy(id="fos_user_registration_form_plainPassword_second")
	WebElement paswword2;
	
	@FindBy(xpath="/html/body/div[2]/form/div[9]/div[1]/label/span[3]")
	WebElement clcik;
	
	@FindBy(id="register-submit-btn")
	WebElement egister;
	
	
	
	public void reg()
	{
		CommonLib base=new CommonLib(driver);
		base.waitForElementToPresent(register,30);
		register.click();
		base.waitForElementToPresent(fullname, 30);
		fullname.sendKeys("manideep");
		email.sendKeys("mani@gmail.com");
		base.pauseFor(2000);
		city.sendKeys("Johannesburg");
		base.waitForElementToPresent(select, 40);
		base.getDropdownValue(select, 6);
		base.pauseFor(3000);
		base.getDropdownValue(selct2, 2);
		pasword.sendKeys("Mani@123");
		paswword2.sendKeys("Mani@123");
		clcik.click();
		egister.click();
		driver.close();
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
