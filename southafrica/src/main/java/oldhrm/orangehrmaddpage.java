package oldhrm;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.orangetestbaseold;

public class orangehrmaddpage extends orangetestbaseold
{
	
	orangetestbaseold rto;
    public String poss;
        
	public orangehrmaddpage() throws Exception, Exception {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="PIM")
	WebElement doj;
	 @FindBy(linkText="Add Employee")
	 WebElement ffg;
    @FindBy(id="btnEdit")
    WebElement jock;
	@FindBy(name="txtEmpLastName")
	WebElement kj;
	@FindBy(name="txtEmpFirstName")
	WebElement k;
	@FindBy(className="backbutton")
	WebElement dfg;
    @FindBy(xpath=("//table[@class='data-table']/tbody/tr[1]/td[3]/a"))
	WebElement qt;
	@FindBy(name="txtEmployeeId")
	WebElement qwe;
	@FindBy(name="allCheck")
	WebElement j;
	@FindBy(xpath="//div[@class='actionbuttons']/input[2]")
	WebElement f;
	@FindBy(linkText="Logout")
	WebElement op;
	 
	
	
public void ff() throws Exception
{
	rto=new orangetestbaseold();
	rto.actionw();
	action.moveToElement(doj).perform();
	Thread.sleep(2000);
	action.click(ffg).perform();
	}
	
	public void act()
	{
		jock.click();
		
	}
public void goat(String h,String o) throws Exception
{
	 poss=qwe.getAttribute("value");
	 System.out.println(poss);
	kj.sendKeys(h);
	k.sendKeys(o);
	Thread.sleep(2000);
	

}

public void fan()
{
	dfg.click();
}
public void got()
{
	
    qt.click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    dfg.click();
    j.click();
    f.click();
}
	public void logout()
	{
		op.click();
	}
	
	
	
	
	
	
	
	
	
}
