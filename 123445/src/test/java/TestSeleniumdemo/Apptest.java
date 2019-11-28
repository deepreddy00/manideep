package TestSeleniumdemo;

import org.testng.annotations.Test;

import Demo.App;
import base.Baseclass;



public class Apptest 

{

	
	
	@Test
	public void demo() throws Throwable
	{
		Baseclass bs=new Baseclass();
		bs.bro("chrome");
		App demo=new App();
		demo.goodUSPW("user@phptravels.com", "demouser");
				}
			
}
