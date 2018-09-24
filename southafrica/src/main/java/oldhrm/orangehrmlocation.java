package oldhrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import oldhrmtests.orangelocation;
import testbase.orangetestbaseold;
import uddf.Xls_Reader1;

public class orangehrmlocation extends orangetestbaseold
{
	 orangetestbaseold bat;
	public orangehrmlocation() throws Exception, Exception {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="admin")
	WebElement te;
	@FindBy(linkText="Company Info")
	WebElement rad;
	@FindBy(linkText="Locations")
	WebElement ra;
	@FindBy(xpath="//div[@class='actionbuttons']/input[1]")
	WebElement qe;
	@FindBy(name="txtLocDescription")
	WebElement raa;
	@FindBy(name="cmbCountry")
	WebElement root;
	@FindBy(name="txtAddress")
	WebElement tata;
	@FindBy(name="txtZIP")
	WebElement fo;
	@FindBy(className="savebutton")
	WebElement op;
	
	
	public void rt() throws Exception
	{
		bat=new  orangetestbaseold();
		bat.actionw();
		Thread.sleep(2000);
         action.moveToElement(te).perform();
		action.moveToElement(rad).perform();
		action.click(ra).perform();
		Thread.sleep(2000);
		bat.switc("rightMenu");
		Thread.sleep(2000);
		qe.click();
	    }
	
	public void xls(String Name,String country,String address,String zipcode)
	{
		raa.clear();
     raa.sendKeys(Name);
     root.sendKeys(country);
     tata.clear();
     tata.sendKeys(address);
     fo.clear();
     fo.sendKeys(zipcode);
		
		
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
}
