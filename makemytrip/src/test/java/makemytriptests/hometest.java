package makemytriptests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import makemytrip.Baseclass;
import makemytrippages.Depatureflights;
import makemytrippages.Makemytriphomepage;

public class hometest 
{
	
	Baseclass bas;
	Makemytriphomepage trip;
	Depatureflights dep;

	@BeforeMethod
	public void home()
	{
		bas=new Baseclass();
		bas.bro("chrome");
		}
	
	@Test
	public void trop() throws Throwable
	{
		trip=new Makemytriphomepage();
		trip.home();
		
		
		
	}
	@Test
	public void hj()
	{
		dep=new Depatureflights();
		dep.depature();
		dep.rturn();
	}
	
	
	
	
	
	
	
	
}
