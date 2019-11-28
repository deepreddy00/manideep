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
	@Test(priority=1)
	public void demo1() throws Throwable
	{
		Baseclass bs=new Baseclass();
		bs.bro("chrome");
		App demo=new App();
		demo.goodUSPW("mankknds@gmail.com", "demouser");
			}
	@Test(priority=2)
	public void demo3() throws Throwable
	{
		Baseclass bs=new Baseclass();
		bs.bro("chrome");
		App demo=new App();
		demo.goodUSPW("user@phptravels.com", "wqqrrq");
			}
	@Test(priority=3)
	public void demo4() throws Throwable
	{
		Baseclass bs=new Baseclass();
		bs.bro("chrome");
		App demo=new App();
		demo.goodUSPW("user@p", "dser");
			}
	
	
	
	
	
	
	
	
	
			
}
