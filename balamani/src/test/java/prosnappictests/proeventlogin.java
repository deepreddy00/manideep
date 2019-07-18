package prosnappictests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

//import org.testng.ITestListener;
//import org.testng.annotations.Listeners;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
//import io.qameta.allure.Description;
//import io.qameta.allure.Step;
//import junit.framework.TestListener;
import snappicpages.bank;
import snappicpages.eventdetalispage;
import snappicpages.eventoptions;
import snappicpages.filters;
import snappicpages.gif;
import snappicpages.greenscreen;
import snappicpages.microsite;
import snappicpages.phototemplatechooser;
import snappicpages.printing;
import snappicpages.proeventEmail;
import snappicpages.smssettings;
import snappicpages.socialmedia;
import snappicpages.Loginpage;
import snappicpages.TestAllureListener;
import snappicpages.appexperience;
import snappicpages.burst;
import snappicpages.createeventpage;
import snappicpages.digtalprosettings;





@Listeners({TestAllureListener.class})

public  class proeventlogin extends bank

{


	bank ss;
	
	@Test(priority=0,description="verify login page")
	@Description("Test description:Verify login page")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Story Name:login to snapic")
	//@Step("login to snappic")
	@Parameters("browser")
	//@Step("go to login")
	//@Description("Test description:pass")
	public void lo() throws Throwable
	{
		 ss=new bank();
	     ss.bro(pro.getProperty("browser"));
	     Loginpage rr=new Loginpage();
	     rr.login();
	     ss.getScreenshot();
	     }
	
	@Test(priority=1,description="verify createpage")
	@Description("Test description:Verify createpage")
	@Severity(SeverityLevel.NORMAL)
	@Story("Story Name:create event page in  snapic")
	public void create() throws Throwable
	{
		createeventpage pahe=new createeventpage();
		pahe.ec();
		ss.getScreenshot();
		}
	@Test(priority=2,description="verify eventdetalispage")
	@Description("Test description:Verify eventdetailspage")
	@Severity(SeverityLevel.MINOR)
	@Story("Story Name:fillout the event detalis page")
	public void eventdetails() throws Throwable
	{
		eventdetalispage tail=new eventdetalispage();
		tail.evetn();
		ss.getScreenshot();
		}
	@Test(priority=3,description="verify eventoptions")
	@Description("Test description:Verify eventoptions")
	@Severity(SeverityLevel.MINOR)
	@Story("Story Name:ventoptions")
	public void option() throws Throwable
	{
		eventoptions paint=new eventoptions();
		paint.event();
	}
	@Test(priority=4,description="verify printing page")
	@Description("Test description:Verify printing page")
	@Severity(SeverityLevel.MINOR)
	@Story("Story Name:printing page")
	public void inting()
	{
       printing iron=new printing();
       iron.print();
       }
	@Test(priority=5,description="verify socialmedia page")
	@Description("Test description:Verify social media page")
	@Severity(SeverityLevel.NORMAL)
	@Story("Story Name:social media")
	public void social()
	{
		socialmedia you=new socialmedia();
		you.socialsave();
		}
	@Test(priority=6,description="verify email page")
	@Description("Test description:Verify email page")
	@Severity(SeverityLevel.NORMAL)
	@Story("Story Name:Email page")
	public void email()
	{
		
		proeventEmail icon=new proeventEmail();
		icon.proemail();
		}
	@Test(priority=7,description="verify smssettings")
	@Description("Test description:Verify smssettings")
	@Severity(SeverityLevel.NORMAL)
	@Story("Story Name:smssettings")
	public void text()
	{
		smssettings sms=new smssettings();
		sms.sms();
		}
	
	@Test(priority=8,description="verify photoboothtemplate")
	@Description("Test description:Verify photoboothtemplate")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Story Name:photoboothtemplate")
	public void photobooth() throws Throwable
	{
		phototemplatechooser template=new phototemplatechooser();
		template.ho();
		}
	
	@Test(priority=9,description="verify appexp")
	@Description("Test description:Verify appexp")
	@Severity(SeverityLevel.NORMAL)
	@Story("Story Name:appexperenice")
	public void appexp()
	{
		appexperience exper=new appexperience();
		exper.appexp();
		
	}
	
	@Test(priority=10,description="verify microsite")
	@Description("Test description:Verify microsite")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Story Name:microsite")
	public void moicro() throws Throwable
	{
		microsite site=new microsite();
		site.micr();
	}
	@Test(priority=11,description="verify prosettings")
	@Description("Test description:verify pro settings")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Story Name:Digitalprosettings")
	public void prosettngs() throws Throwable
	{
		digtalprosettings orp=new digtalprosettings();
		orp.digit();
		}
	
	@Test(priority=12,description="verify filters")
	@Description("Test description:Verify filters")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Story Name:verify filters")
	public void lters() throws Throwable
	{
		filters jj=new filters();
		jj.filter();
		}
	
	@Test(priority=13,description="verify gifburst")
	@Description("Test description:Verify gifburst")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Story Name:Gifburst")
	public void giburst() throws Throwable
	{
		gif ring=new gif();
		ring.gitf();
		}
	@Test(priority=14,description="verify burst")
	@Description("Test description:Verify burst")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Story Name:verify burst")
	public void burs() throws Throwable
	{
		
		burst ioo=new burst();
		ioo.burt();
	}
	@Test(priority=15,description="verify greenscreen")
	@Description("Test description:Verify greenscrren")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Story Name:verify greenscreen")
	public void gree() throws Throwable
	{
		greenscreen poin=new greenscreen();
		poin.greecreen();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
