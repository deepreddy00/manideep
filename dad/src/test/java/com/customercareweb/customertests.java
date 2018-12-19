package com.customercareweb;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.customercarewebpages.custemerpages3;
import com.customercarewebpages.custercarepages;
import com.customercarewebpages.custercarepages1;
import com.customercarewebpages.custercarpages2;
import com.customercarewebpages.custermpages5;
import com.customercarewebpages.custermpagres4;
import com.customercarewebpages.util;
import com.customercarweb.custermcasepage;
import com.freecrm.pages.testcontactpage;

import testutil.anttestdata;

public class customertests extends custermcasepage
{
	 public static String sheetName="sim";
	 util king;
	custermcasepage po;
	custercarepages kll;
	custercarepages1 rth;
	custercarpages2 rat;
	custemerpages3  mat;
    custermpagres4 pan;
    custermpages5 matf;
    
	public customertests()
	{
		super();
	}
	@Test(priority=1)
	public void joi() throws Exception
	{
		po=new custermcasepage();
		po.url();
		kll=new custercarepages();
		kll.custeomer();
}
@Test(priority=2)
public void hj() throws Exception
{
	rth=new custercarepages1();
	rth.matt();
	rth.anuhj();
	
}
	@Test(priority=3)
	public void fg() throws Throwable
	{
		rat=new custercarpages2();
		rat.jai();
	}
	
@Test(priority=4)
public void fkau() throws Exception
{
	mat=new custemerpages3();
	mat.goat();
}
	
@Test(priority=5)
public void jui() throws Exception
{
	pan=new custermpagres4();
	pan.ert();
}
@Test(priority=6)
public void hu() throws Exception
{
	pan.eor();
	
}
@Test(priority=7)
public void panter() throws Exception
{
	matf=new custermpages5();
	matf.montey();
	matf.ot();
	pan.eor();
	
}
@Test(priority=8)
public void lop() throws Throwable
{
	pan.eor();
	matf.loop();
	}

@DataProvider
public Object[][] getCRMTestData(){
	Object data[][] =util.getTestData(sheetName);
	return data;
}
@Test(dataProvider="getCRMTestData",priority=9)
public void fgd(String port,String port1,String port2)

{
      matf.uie(port, port1,port2);
}

@Test(priority=10)
public void oi() throws Exception
{
	matf.ne();
	
	
	
	
}


}
