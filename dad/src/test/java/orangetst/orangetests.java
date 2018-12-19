package orangetst;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import orangehrmbase.testbaseorange;
import orangehrmpages.orangehrmpage;

public class orangetests extends testbaseorange
{
	testbaseorange night;
	
	orangehrmpage mrng;
	
	public orangetests()
	{
		super();
	}

	@Test()
	public void frrop()
	{
		night=new testbaseorange();
		night.orange();
		night.wqao("OrangeHRM - New Level of HR Management");
		mrng=new orangehrmpage();
		mrng.bshks();
		}
	
	
	
	
	
	
}
