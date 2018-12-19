package moi;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import condra.condotestbaseclass;
import condrapages.conpages;
import condrapages.pojjk;

public class master2 extends condotestbaseclass
{
	condotestbaseclass co;
	pojjk jk;
	conpages con;
	
	public master2()
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
	
	
	
	
	
}
