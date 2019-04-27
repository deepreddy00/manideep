package windowhanles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import makemytrip.Baseclass;

public class google extends Baseclass
{

	
	public google()
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[contains(text(),'terms of service')]")
WebElement se;

public void cj() throws Throwable
{
	se.click();
	System.out.println(driver.getTitle());
	Set<String>ids=driver.getWindowHandles();
	Iterator<String>hji=ids.iterator();
	String parent=hji.next();
	String child=hji.next();
	driver.switchTo().window(child);
	Thread.sleep(2000);
	//driver.getTitle();
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


	
	
	
}
