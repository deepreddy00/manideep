package prosnappictests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Snappicenterprisepages.bank;
import Snappicenterprisepages.snappicregister;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import snappicpages.TestAllureListener;



@Listeners({TestAllureListener.class})

public class registerverify extends bank

{
	bank j;
     @Test
     @Description("Test description:Verify login page")
 	@Severity(SeverityLevel.BLOCKER)
 	@Story("registerpage")
	public void regd() throws Throwable
	{
    	 j=new bank();
    	 j.bro(pro.getProperty("browser"));
    	 snappicregister er=new snappicregister();
    	 er.reg();
    	 
		
    	 
    	 
	}
	
	
	
	
}
