package oldhrmtests;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import oldhrm.orangehrmloginpage;
import testbase.orangetestbaseold;

public class orangehrmtests extends orangetestbaseold
{
	orangehrmloginpage mass;
	
public orangehrmtests() throws Exception, Exception {
		super();
		// TODO Auto-generated constructor stub
	}

@BeforeMethod
public void setUp() throws Exception{
	{
		login();
		mass=new  orangehrmloginpage();
	
		
		
	}
      
}
	@Test
	public void test() throws Exception
	{
		Thread.sleep(5000);
		
		mass.mani(po.getProperty("username"), po.getProperty("password"));
		
		
		
	}
	
	
	
	}
	
	
	
	
	
	
	


