package prosnappictests;

import org.testng.annotations.Test;

import snappicpages.Loginpage;
import snappicpages.bank;
import snappicpages.verifychangepassword;
import snappicpages.verifymyprofile;

public class myprofilesettings extends bank

{
	bank j;
    @Test
	public void regd() throws Throwable
	{
   	 j=new bank();
   	 j.bro(pro.getProperty("browser"));
   	 Loginpage rt=new Loginpage();
   	 rt.login();
     verifymyprofile po=new verifymyprofile();
   	 po.profile();
   	 verifychangepassword t=new verifychangepassword();
   	 t.chagepassword();
   	 
   	 
   	  }

	
	
	
	
}
