package orangehrmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangehrmpage.home;
import orangetestbaseclass.testbase;

public class orangetest extends testbase
{
	home Home;

	public orangetest() throws Exception, Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setUp() throws Exception{
		
		intir();
		Home = new home();	
	}
	@Test
	public void loginth()
	{
		Home.login(pro.getProperty("user"), pro.getProperty("pase"));
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

	
	
	
	
}
