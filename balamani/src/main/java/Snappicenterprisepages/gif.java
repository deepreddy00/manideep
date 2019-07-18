package Snappicenterprisepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//import makemytrip.Baseclass;

public class gif extends bank

{
public  gif()
{
	
PageFactory.initElements(driver, this);	
}
	
	
@FindBy(id="template_library_button")
WebElement gi;



@FindBy(xpath="//*[@id='confirm_modal_body']/div[1]/div/div/ul/li[2]/a")
WebElement giftem;


@FindBy(xpath="//*[@id='tab_2']/div/div[4]/span/label/img")
WebElement qs;

@FindBy(xpath="//*[@id='templates_modal']/div/div/div[2]/div[2]/button")
WebElement wer;



@FindBy(id="still-template")
WebElement still;

@FindBy(id="save-gif-settings")
WebElement savein;

@FindBy(id="snappic_gif_save")
WebElement q;



public void gitf() throws Throwable
{
	Thread.sleep(5000);
	javaclick(gi);
	Thread.sleep(5000);
	javaclick(giftem);
	Thread.sleep(5000);
	javaclick(qs);
	Thread.sleep(5000);
	//wer.click();
	Thread.sleep(5000);
	javaclick(still);
	Thread.sleep(5000);
	javaclick(still);
	Thread.sleep(5000);
	javaclick(q);
	
	
	
}









	
}
