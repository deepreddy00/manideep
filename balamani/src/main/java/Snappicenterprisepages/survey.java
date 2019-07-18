package Snappicenterprisepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class survey extends bank

{
	
	
	public survey()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="photobooth_data_capture_title")
	WebElement title;
	
	
	
	@FindBy(id="photobooth_data_capture_description")
	WebElement descr;
	
	@FindBy(id="show_builder")
	WebElement show;
	
	//*[@id="form-editor"]/div/div/div/div[1]/div/div[2]/div[1]/span[2]/span[1]
	
	
	
	@FindBy(xpath="//*[@id='form-editor']/div/div/div/div[1]/div/div[2]/div[1]/span[2]/span[1]")
	WebElement des;
	
	@FindBy(xpath="//*[@id='form-fields']/div/p")
	WebElement source;
	
	@FindBy(id="save-builder")
	WebElement bulider;
	
	@FindBy(id="photobooth_data_capture_save")
	WebElement photodata;
	
	public void drage()
	{
		
		Actions at=new Actions(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		des.click();
		at.dragAndDrop(des, source);
	}
	
	
	public void sury() throws Throwable
	{
		Thread.sleep(4000);
		title.sendKeys("mnai");
		Thread.sleep(3000);
		descr.sendKeys("redy");
	javaclick(show);
	Thread.sleep(3000);
		drage();
		bulider.click();
		Thread.sleep(3000);
		photodata.click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
