package oldhrmtests;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import oldhrm.orangehrmlocation;
import oldhrm.orangehrmloginpage;
import oldhrm.utlity;
import testbase.orangetestbaseold;
import uddf.Xls_Reader1;

public class orangelocation extends orangetestbaseold
{
	orangehrmloginpage ko;
	 orangehrmlocation fat;
	static  utlity  goo;
	String sheetName= "Sheet1";

	public orangelocation() throws Exception, Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void show() throws Exception{
		{
			login();
			ko=new  orangehrmloginpage();
		
			
			
		}
	      
	}
	@DataProvider
	public Object[][] getdata()
	{
	goo=new utlity ();
	Object data[][]=goo.getTestData(sheetName);
	return data;
	}
		@Test(dataProvider="getdata")
		public void test(String Name,String country,String address,String zipcode) throws Exception
		{
			Thread.sleep(5000);
			
			ko.mani(po.getProperty("username"), po.getProperty("password"));
	       fat=new orangehrmlocation();
	       Thread.sleep(5000);
	       fat.rt();
	       fat.xls(Name, country, address, zipcode);
	      
		
		
	}
	
	
	
	

	
	
	
	
	
	
}
