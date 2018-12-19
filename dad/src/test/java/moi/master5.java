package moi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import condra.condotestbaseclass;
import condrapages.conpages;
import condrapages.conpages2;
import condrapages.conpages3;
import condrapages.conpages4;
import condrapages.pojjk;

public class master5 extends condotestbaseclass
{

	condotestbaseclass co;
	pojjk jk;
	conpages con;
	conpages2 ci;
	conpages3 it;
	conpages4 ece;
	
	public master5()
	{
		super();
	}
	
	@BeforeMethod
	public void fdd()
	{
		co=new condotestbaseclass();
		co.url();
	}
	@Test(priority=1)
	public void fgt() throws Exception
	{
		jk=new pojjk();
		jk.custeomer();
		
	}
	@Test(priority=2)
	@Parameters({"name","sur","id","gender"})
	public void joim(String name,String sur,String id,String gender) throws Exception
	{
		con=new conpages();
		con.ol();
		con.anj(name, sur, id, gender);
	}
	
	@Test(priority=3)
	@Parameters({"h","area","cites","state","country","zip"})
	public void go(String city,String h,String area,String cites,String state,String country,String zip) throws Exception
	{
		ci=new conpages2();
		ci.i( h, area, cites, state, country, zip);
		
		
		
		
		
	}
	@Test(priority=4)
	@Parameters({"num1","num2","num3"})
	public void fah(String num1,String num2,String num3)
	{
		try {
			it.gt(num1, num2, num3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
		@Test(priority=5)
		public void ee()
		{
	       ece=new conpages4();
	       try {
			ece.rt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       try {
			ece.eor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
		}
		
}
