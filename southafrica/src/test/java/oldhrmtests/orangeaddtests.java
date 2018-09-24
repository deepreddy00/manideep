package oldhrmtests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import oldhrm.orangehrmaddpage;
import oldhrm.orangehrmloginpage;
import testbase.orangetestbaseold;

public class orangeaddtests extends orangetestbaseold
{
	 orangehrmloginpage lan;
	 orangehrmaddpage   add;

	public orangeaddtests() throws Exception, Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception{
		{
			login();
			lan=new  orangehrmloginpage();
		}
	}
		@Test
		public void tes() throws Exception 
		{
			Thread.sleep(5000);
			
			lan.mani(po.getProperty("username"), po.getProperty("password"));
		      add=new orangehrmaddpage();
		      add.ff();
		      add.switc("rightMenu");
		      verify("PIM : Add Employee");
		      Thread.sleep(3000);
		      add.act();
		      
		      Thread.sleep(3000);
		      aler();
			
			add.goat("a","xs");
			add.act();
			Thread.sleep(4000);
			add.fan();
			//add.switc("rightMenu");
			Thread.sleep(4000);
			add.got();
			edit();
			add.logout();
			
			
	}
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	

