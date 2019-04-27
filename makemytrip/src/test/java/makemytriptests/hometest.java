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

	@Test(priority=0)
	public void home()
	{
		bas=new Baseclass();
		bas.bro("chrome");
		}
	
	@Test(priority=1)
	public void trop() throws Throwable
	{
		trip=new Makemytriphomepage();
		trip.home();
		
		
		
	}
	
	@Test(priority=2)
	public void gj() throws Throwable
	{
		
		dep=new Depatureflights();
		dep.depature();
		dep.rturn();
		
		
		
	}
	
	@Test(priority=3)
	public void gjk() throws Throwable
	{
		
		dep=new Depatureflights();
		Thread.sleep(2000);
		dep.nonstop();
		dep.depature();
		dep.rturn();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
