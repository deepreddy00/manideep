package condrapages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.customercarewebpages.calender;

import condra.condotestbaseclass;

public class conpages extends condotestbaseclass
{
	
	WebDriverWait wait=new WebDriverWait(driver, 30);
     calender l;
     
	Actions act;
	public conpages()
	{
		super();
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//span[@class='z-combobutton-button']")
	WebElement mann;
	@FindBy(xpath="//span[contains(text(),'Create Private Account')]")
	WebElement ja;
	
	@FindBy(xpath="//input[@class='z-combobox-input']")
	WebElement fh;
	@FindBy(xpath="//input[contains(@id,'t3')]")
	WebElement yu;
	@FindBy(xpath="//input[contains(@id,'w3')]")
	WebElement jkl;

	@FindBy(xpath="//input[contains(@id,'z3')]")
	WebElement jl;

	@FindBy(xpath="//input[contains(@id,'14-real')]")
	WebElement y;


	@FindBy(xpath="//input[contains(@id,'74-real')]")
	WebElement trg;

	@FindBy(xpath="//input[contains(@id,'a4-real')]")
	WebElement rft;

	@FindBy(xpath="//table[@class='z-calendar-body']/tbody/tr[1]/td[5]")
	WebElement ui;

	@FindBy(xpath="//a[contains(@id,'74-btn')]")
	WebElement r;



	@FindBy(xpath="//button[contains(@id,'e3')]")
	WebElement qe;
	
	
	public void ol() throws Exception
	{
		act=new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(mann));
		mann.click();
		act.moveToElement(ja).build().perform();
		act.click(ja).perform();
	}
	public void anj(String name,String sur,String id,String gender) throws Exception 
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(fh));
		fh.sendKeys("mr.");
		
		wait.until(ExpectedConditions.elementToBeClickable(yu));
	    yu.sendKeys(name);
	    jkl.sendKeys(sur);
	    jl.sendKeys(id);
	    y.sendKeys(gender);
	    Thread.sleep(2000);
	    l=new calender();
	    WebElement cal=driver.findElement(By.xpath("//input[contains(@id,'74-real')]"));
		String dta="16-02-1993";
	    l.clender(driver,cal, dta);
	    rft.sendKeys("india");
	    wait.until(ExpectedConditions.elementToBeClickable(qe));
	    qe.click();
	    
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
