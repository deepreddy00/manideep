package demofreecrm;

import org.testng.annotations.Test;

import com.freecrm.testbasefreecrm;
import com.freecrm.pages.freecrmpages;

public class freecemtest extends testbasefreecrm
{
       testbasefreecrm re;	
        freecrmpages rod;
	
	public freecemtest()
	{
		
		super();
		
		
	}

	@Test
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
	
	
	
	
}
