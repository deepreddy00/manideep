package moi;

import org.testng.annotations.Test;

import com.customercarewebpages.custercarepages;

import condra.condotestbaseclass;
import condrapages.pojjk;

public class master1 extends condotestbaseclass
{
	condotestbaseclass co;
	pojjk jk;
	
	public master1()
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
	
	
	
	
	
	
	
	
	
	
	
	
	
}
