package demobanktest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import demobankpage1.bank1;
import demobankpagetest.bank;

public class gurutest extends bank
{
     bank bo;
    public  bank1 bo1;
	public gurutest()
	{
		super();
		
	}


	@Test
	public void fg() throws InterruptedException
	{
       
		bo=new bank();
		bo1=new bank1();
		bo.bro();
		Thread.sleep(7000);
		bo1.poste();
		
		
		
		
		
		
	
	
	
	
	
	
}
}