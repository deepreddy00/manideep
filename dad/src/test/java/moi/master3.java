package moi;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import condra.condotestbaseclass;
import condrapages.conpages;
import condrapages.conpages2;
import condrapages.pojjk;

public class master3  extends condotestbaseclass
{
	condotestbaseclass co;
	pojjk jk;
	conpages con;
	conpages2 ci;
	
	public master3()
	{
		super();
	}
	
	@Test
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
	public void go() throws Exception
	{
		ci=new conpages2();
		ci.i(h, area, cites, state, country, zip);
		
		
		
		
		
	}
	
	
	
}
