package moi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.customercarewebpages.util;

import condra.condotestbaseclass;
import condra.datapick;
import condra.utly;
import condrapages.conpages;
import condrapages.conpages2;
import condrapages.conpages3;
import condrapages.conpages4;
import condrapages.conpages5;
import condrapages.pojjk;
import testutil.anttestdata;

public class master6 extends condotestbaseclass
{
    public static datapick dtt;
	condotestbaseclass co;
	pojjk jk;
	conpages con;
	conpages2 ci;
	conpages3 it;
	conpages4 ece;
	conpages5 mec;
	public static String sheetname="sims";
	String filepath="C:\\Users\\manideep\\git\\manideep\\dad\\src\\main\\java\\condra\\bavasim.xlsx";
	utly hj;

	public master6()
	{
		super();
	}
	
	@Test
	public void fdd()
	{
		dtt=new datapick();
		//hj=new utly();
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
	public void go(String h,String area,String cites,String state,String country,String zip) throws Exception
	{
		ci=new conpages2();
		ci.i( h, area, cites, state, country, zip);
	}
	@Test(priority=4)
	@Parameters({"num1","num2","num3"})
	public void fah(String num1,String num2,String num3)
	{
		it=new conpages3();
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
			
		@Test(priority=6)
		public void mpc() throws Exception
		{
		mec=new conpages5();
		mec.mtey();
		mec.ot();
		ece.eor();
		
		
		}
		@Test(priority=7)
		public void rtrr() throws Exception
		{
			ece.eor();
			mec.loop();
		
			
		}

		
		@DataProvider
		public Object[][] TestData() {
			
			Object data[][] =datapick.getTestData(sheetname);
			return data;
		}
		
		@Test(dataProvider="TestData",priority=8)
		public void gd(String testdata) throws Exception 

		{
			Thread.sleep(2000);
	        mec.ie(testdata);		
	 		}   
			
			
		      
		     
		      
	
		
		
		@Test(priority=9)
		public void gty() throws Exception
		{
			mec.nae();
		}
		
		}
		

	
	

