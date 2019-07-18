package prosnappictests;

import org.testng.annotations.Test;

import Snappicenterprisepages.Fogotpassword;
import Snappicenterprisepages.bank;

public class forgotpasswordtests extends bank

{

	
	
	bank j;
    @Test
	public void regd() throws Throwable
	{
   	 j=new bank();
   	 j.bro(pro.getProperty("browser"));
   	 Fogotpassword er=new Fogotpassword();
   	 er.forgot();
	
	
	
	
	
	
	
	
	
	
}
}
