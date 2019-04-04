package demobanktest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demobankpage1.bank1;
import demobankpage1.newank;
import demobankpagetest.bank;

public class newbanktest extends bank
{
   bank jrt;
   newank  kow;
   bank1 porty;
	public newbanktest()
	{
		super();
	}
 
 @BeforeMethod
public void eat() throws Exception
{
	jrt=new bank();
	//porty=new bank1();
	Thread.sleep(2000);
	jrt.bro();
	Thread.sleep(2000);
    //porty.poster();
	Thread.sleep(2000);
	}
   @Test
	public void ate() throws Exception
	{
	   System.out.println("driver="+driver);
	   porty=new bank1();
	   Thread.sleep(4000);
	   porty.poste();
	kow=new newank();
	kow.party();
		}
	
   @AfterMethod
	public void pot()
	{
		
		driver.close();
		
	}
	
}
