package prosnappictests;

import org.testng.annotations.Test;

import Snappicenterprisepages.Loginpage;
import Snappicenterprisepages.bank;

public class loginpagetests extends bank

{

	
	bank j;
    @Test
	public void regd() throws Throwable
	{
   	 j=new bank();
   	 j.bro(pro.getProperty("browser"));
   	 Loginpage log=new Loginpage();
   	 log.login();
   	 }
    @Test(priority=1)
   	public void gd() throws Throwable
   	{
      	 j=new bank();
      	 j.bro(pro.getProperty("browser"));
      	 Loginpage log=new Loginpage();
      	 log.login2();
      	 }
    @Test(priority=2)
   	public void d() throws Throwable
   	{
      	 j=new bank();
      	 j.bro(pro.getProperty("browser"));
      	 Loginpage log=new Loginpage();
      	 log.loin3();
      	 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}