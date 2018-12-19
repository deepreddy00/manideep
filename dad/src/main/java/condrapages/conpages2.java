package condrapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import condra.condotestbaseclass;

public class conpages2 extends condotestbaseclass
{
    public conpages2()
	{
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[contains(@id,'Q55')]")
		WebElement address;
		@FindBy(xpath="//input[contains(@id,'i5')]")
		WebElement add;
		@FindBy(xpath="//input[contains(@id,'v5')]")
		WebElement ad;
		@FindBy(xpath="//input[contains(@id,'86')]")
		WebElement a;
		@FindBy(xpath="//input[contains(@id,'k6')]")
		WebElement b;
		@FindBy(xpath="//input[contains(@id,'h6')]")
		WebElement e;
		@FindBy(xpath="//input[contains(@id,'n6')]")
		WebElement c;
		@FindBy(xpath="//input[contains(@id,'q6-real')]")
		WebElement d;
		@FindBy(xpath="//button[contains(@id,'e3')]")
		WebElement te;
		
		
		public void i(String h,String area,String cites,String state,String country,String zip) throws Exception
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(add));
			//address.sendKeys(city);
			
			if(add.isDisplayed())
			{
				add.sendKeys(h);
			}
			else
			{
				System.out.println("not displayed");
			}
			Thread.sleep(4000);
			ad.sendKeys(area);
			a.sendKeys(cites);
			e.sendKeys(state);
			b.sendKeys(country);
			c.sendKeys(zip);
			d.sendKeys("india");
			te.click();
			
			
			
			
		}
		
	}

