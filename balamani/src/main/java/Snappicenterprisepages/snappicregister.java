package Snappicenterprisepages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;



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
	
	
	@FindBy(xpath="//*[@id='fos_user_registration_form_city']")
	WebElement ci;
	
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
	
	@FindBy(xpath="//*[@id='select2-results-3']/li")
	List<WebElement> sel;
	
	//*[@id="select2-results-2"]/li[1]
	
	@FindBy(xpath="//*[@id='select2-results-2']/li")
	List<WebElement> ik;
	
	
	
	
	//*[@id="s2id_fos_user_registration_form_country"]
	
	@FindBy(xpath="//*[@id='s2id_fos_user_registration_form_country']")
	WebElement ds;
	
	@FindBy(xpath="fos_user_registration_form[referral_code]")
	WebElement referal;
	

	
	@FindBy(xpath="//*[@id='select2-chosen-2']")
	WebElement chosen;
	
	@FindBy(id="s2id_fos_user_registration_form_referral_source")
	WebElement selec;
	
	
	
	
	
		
	
	public void hdjd()
	{
		
		for(int i=0; i<sel.size(); i++)
		{
			
			System.out.println(sel.size());
			// Printing All the options from the dropdown
			System.out.println(sel.get(i).getText());
			
			// Checking the condition whether option in text "Angular" is comming
			//if(sel.get(i).getText().contains(" Argentina ")) 
			//{
				
				sel.get(5).click();
				
				// Breaking the condition if the condition get satisfied
				break;
			}
		}
		
	public void jd()
	{
		
		for(int i=0; i<ik.size(); i++)
		{
			
			System.out.println(ik.size());
			// Printing All the options from the dropdown
			System.out.println(ik.get(i).getText());
			
			// Checking the condition whether option in text "Angular" is comming
			//if(sel.get(i).getText().contains(" Argentina ")) 
			//{
				
				ik.get(2).click();
				
				// Breaking the condition if the condition get satisfied
				break;
			}
		}
		
		
		
		
	
	
	
	@Step("register page ")
	public void reg() throws Throwable
	{
		bank u;
		CommonLib base=new CommonLib(driver);
		base.waitForElementToPresent(register,30);
		javaclick(register);
		base.waitForElementToPresent(fullname, 30);
		fullname.sendKeys("man");
		email.sendKeys("mana@gmail.com");
		u=new bank();
		ci.click();
		ci.sendKeys("johhanesburg");
		
		Thread.sleep(2000);
		ds.click();
		Thread.sleep(2000);
		hdjd();
		selec.click();
	Thread.sleep(3000);
		jd();
		Thread.sleep(3000);
		pasword.sendKeys("Mani@123");
		paswword2.sendKeys("Mani@123");
		clcik.click();
		egister.click();
		driver.close();
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
