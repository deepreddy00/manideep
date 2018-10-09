package demofreecrm;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.testbasefreecrm;

import com.freecrm.pages.freecrmpages;
import com.freecrm.pages.testcalenderpage;

public class freecrmtest1 extends testbasefreecrm
{

	   testbasefreecrm re;	
       freecrmpages rod;
       testcalenderpage cot;
      
        
	
	public freecrmtest1()
	{
		
		super();
		
		
	}

	@BeforeMethod
	public void loveu()
	{
	re=new testbasefreecrm();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	re.idly();
	rod=new freecrmpages();
	rod.jact();
	
	
	
		
		
}
	@Test
	public void anf() throws Exception
	{
		Thread.sleep(2000);
		cot=new testcalenderpage();
		cot.mars();
	     cot.mottu();	
	     cot.sec();
	     cot.exce();
		
		
	}
	
	
	
	
	
	
}
