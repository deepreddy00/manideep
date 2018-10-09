package demobankpage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.bank;

public class bank1 extends bank
	{
	      
	
		
		public bank1()
		{
			super();
			PageFactory.initElements(driver, this);
		}
	 
		@FindBy(name="uid")
		WebElement ji;
		@FindBy(name="password")
		WebElement ko;
		@FindBy(name="btnLogin")
		WebElement king;
		
		
		
		
		public void poste()
		{
			//js.executeScript("documents.getelementByName('uid').value='mngr154507'");
			
			//JavascriptExecutor	js=(JavascriptExecutor) driver;
			//js.executeScript("documents.getelementByName('uid').value='mngr154507'");
			ji.sendKeys(pro.getProperty("user"));
		ko.sendKeys(pro.getProperty("pass"));
			king.click();
		
					
		
			
			
			
			
			
			
		}
	
	
}
