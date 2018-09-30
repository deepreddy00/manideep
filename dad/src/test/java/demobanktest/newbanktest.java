package demobanktest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demo.bank;
import demobankpage.bank1;
import demobankpage22.newank;

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
	    // porty.poster();
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

