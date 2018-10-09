package demofreecrm;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.testbasefreecrm;
import com.freecrm.pages.freecrmpages;
import com.freecrm.pages.testcalenderpage;
import com.freecrm.pages.testcontactpage;

import testutil.anttestdata;

public class freecrmcontact extends testbasefreecrm
{
     
	
	public static testcontactpage jj;
	
	
    anttestdata poti;
	testbasefreecrm re;	
    freecrmpages rod;
    testcalenderpage cot;
   public static String sheetName="Sheet1";
     
 public freecrmcontact() {
		// TODO Auto-generated constructor stub
		super();
	}

	@BeforeMethod
	public void loveu()
	{
	re=new testbasefreecrm();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	re.idly();
	rod=new freecrmpages();
	rod.jact();
	
	}	
	
	
	
	@DataProvider
	public Object[][] getCRMTestData(){

		Object data[][] =anttestdata.getTestData(sheetName);
		return data;
	}	
	
	@Test(dataProvider="getCRMTestData")
	public void fgd(String Title,String Note,String Contact,String Company)
	
	{
	      	jj=new testcontactpage();
	      	aws();
	      	jj.point();
	      	jj.motion(Title, Note, Contact, Company);
	}
	
	
	
	

}