package makemytrippages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import makemytrip.Baseclass;

public class Depatureflights extends Baseclass
{
	
	public Depatureflights()
	{
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="ow_domrt-jrny")
	public List<WebElement> ad;
	
	
	//*[@id="fli_filter__stops"]/span[1]/label/span[2]
	
	
	@FindBy(xpath="//*[@id='fli_filter__stops']/span[1]/label/span[2]")
	WebElement clcik;
	
	@FindBy(xpath="//*[@id='rt-domrt-jrny']")
	List<WebElement> rtr;
	
	
	//*[@id="ow_domrt-jrny"]/div[2]/div[4]/label
	//*[@id="ow_domrt-jrny"]/div[2]/div[2]/label/div[1]/span[1]
	//*[@id="rt-domrt-jrny"]/div[2]/div[2]/label/div[1]/span[1]
	
	//*[@id="ow_domrt-jrny"]/div[2]/div[2]/label/div[1]/span[1]
	
	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[2]/label/div[1]/span[1]")
	WebElement ss;
	
	//*[@id="ow_domrt-jrny"]/div[2]/div[2]/label/div[2]/div[3]/p/span
	
	
	
	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[2]/label/div[2]/div[3]/p/span/text()")
	WebElement wd;
	
	
	@FindBy(xpath="//*[@id='rt-domrt-jrny']/div[2]/div[2]/label/div[1]/span[1]")
	WebElement qq;
	
	
	
	
	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[1]/label")
	WebElement dg;
	
	
	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[1]/label/div[2]/div[1]/span/span")
	List<WebElement> wt;
	
	
	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[1]/label/div[2]/div[3]/p/span")
	WebElement uio;
	
	
	
	
	
	
	public void depature() throws Throwable
	{
		Thread.sleep(4000);
		//List<WebElement> wer=getpropertylist();
		//System.out.println(wer.size());
		System.out.println(ad.size());
		for(WebElement a:ad)
		{
			String ret=a.getText();
			System.out.println(a.getText());
	         	ss.click();	
	         	Thread.sleep(4000);
	         	System.out.println(wd.getText());
			
		}
	}
	
         
	//*[@id="ow_domrt-jrny"]/div[2]/div[1]/label/div[2]/div[1]/span/span
	
	//*[@id="ow_domrt-jrny"]/div[2]/div[10]/label/div[2]/div[3]/p/span
	//*[@id="ow_domrt-jrny"]/div[2]/div[1]/label/div[2]/div[3]/p/span
	
	//*[@id="ow_domrt-jrny"]/div[2]/div[2]/label/div[2]/div[3]/p/span
	
	//*[@id="ow_domrt-jrny"]/div[2]/div[2]/label/div[2]/div[3]/p/span/text()
	
	
	//*[@id="left-side--wrapper"]/div[2]/div/div[3]/div/div[1]/div[1]/div[1]/div/div[2]/div[4]/p/span/text()
		
	
	public void rturn()
			{
		System.out.println(rtr.size());
		for(WebElement yu:rtr)
		{
			String ret=yu.getText();
			System.out.println(yu.getText());
			
		     qq.click();
		     System.out.println(qq.getText());

		}
		
			}
	
		
		
	
	
public void nonstop()
{
clcik.click();	
}
	
public void tex()
{
	//uio.getText();
	System.out.println(ss.getText());
	
}

public void sd()
{
	System.out.println(qq.getText());
}



}
