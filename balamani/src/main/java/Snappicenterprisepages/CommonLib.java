/**
 * Subhendu Malu01 Aug 2018
 */
package Snappicenterprisepages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.relevantcodes.extentreports.LogStatus;
/**
 * @author Subhendu Malu
 *
 * This class usefull for all common activities for Individual and Juristic clients.
 */
public class CommonLib {
	private static final boolean String = false;
	public WebDriver driver;
	public CommonLib(WebDriver driver) {
		this.driver = driver;
	}

	Robot robot;
	public void getDropdownValue(WebElement webElement, int index) {
		try {
			Select selct = new Select(webElement);
			selct.selectByIndex(index);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			Select selct = new Select(webElement);
			selct.selectByIndex(index);
		}
	}
	
	public void getDropdownValueMultiple(WebElement webElement, int index,int attempts) {
			Select selct = new Select(webElement);
			
			boolean done = false;
			int iLoop = 0;
			while (!done && iLoop <= attempts) {
				try {
					Thread.sleep(2000);
					selct.selectByIndex(index);
					done = true;
				} catch (Exception e) {
					iLoop++;
					if (iLoop == attempts) {
						System.out.println("Did not got element: " + webElement);
					}
				}
			}
	}

	public void getDropdownValueByIndex(WebElement e, String s) {
		Select d = new Select(e);
		List<WebElement> elcount = d.getOptions();
		int i;
		for (i = 0; i <= elcount.size(); i++) {
			if (elcount.get(i).getText().equalsIgnoreCase(s))
				break;
		}
		d.selectByIndex(i);
	}

	public void getDropdownValue(WebElement e, String s) {
		Select sel = new Select(e);
		//sel.selectByVisibleText(s);
		int index = 0;
	    for (WebElement option : sel.getOptions()) {
	    	//System.out.println(option.getText());
	        if (option.getText().equalsIgnoreCase(s))
	            break;
	        index++;
	    }
	    sel.selectByIndex(index);
	}

	public WebElement fourBExemptionNoOption() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		return wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label[for='ficaFourBExepmtion_No']")));
	}
	public Boolean spinnerWait(int waitTime) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		return wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.cssSelector("img[data-ng-click='spinnerController.close()']")));
	}

	public WebElement spinnerTillVisible(int waitTime) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		return wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("img[data-ng-click='spinnerController.close()']")));

	}
	public WebElement genderType() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='GenderType']")));
	}

	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}

	public void scrollUP() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(250,0)", "");
	}

	public void javaScriptClick(WebElement webElement) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", webElement);

	}

	public WebElement getElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public void clickAndTryMultipleSendKeys(WebElement ele, String value, int loop) {
		boolean done = false;
		int iLoop = 0;
		while (!done && iLoop <= loop) {
			try {
				Thread.sleep(2000);
				ele.sendKeys(value);
				done = true;
			} catch (Exception e) {
				iLoop++;
			}
		}
	}

	public void waitforpagetoload() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void pause() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public WebElement explicitWait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		boolean done = false;
		int iLoop = 0;
		int loop = 20;
		while (!done && iLoop <= loop) {
			try {
				wait.until(ExpectedConditions.visibilityOf(ele));
				done = true;
			} catch (Exception e) {
				iLoop++;
			}
		}

		if (done) {
			return ele;
		} else {
			return null;
		}
	}
	
	public WebElement explicitWait(WebElement ele,int loop) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		boolean done = false;
		int iLoop = 0;
		while (!done && iLoop <= loop) {
			try {
				wait.until(ExpectedConditions.visibilityOf(ele));
				done = true;
			} catch (Exception e) {
				iLoop++;
			}
		}

		if (done) {
			return ele;
		} else {
			return null;
		}
	}
	/*
	 * public WebElement explicitWait(WebElement ele) { WebDriverWait wait = new
	 * WebDriverWait(driver, 150); try {
	 * wait.until(ExpectedConditions.visibilityOf(ele)); return ele; } catch
	 * (StaleElementReferenceException e) {
	 * wait.until(ExpectedConditions.visibilityOf(ele)); return ele; } }
	 * 
	 * /*public WebElement explicitWaitLoop(WebElement ele) { WebDriverWait wait =
	 * new WebDriverWait(driver, 10); boolean done = false; for(int
	 * iLoop=0;iLoop<20;iLoop++) { wait.until(ExpectedConditions.visibilityOf(ele));
	 * } }
	 */

	public WebElement explicitWaitStatic(WebElement ele, int loop) {
		WebElement eleCheck = null;
		for (int iLoop = 0; iLoop <= loop; iLoop++) {
			try {
				eleCheck = driver.findElement((By) ele);
				break;
			} catch (Exception e) {
				pauseFor(2);
			}
		}
		return eleCheck;
	}

	public boolean presenceOfElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void checkAlertAndAccept() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			driver.switchTo().defaultContent();
		} catch (Exception e) {

		}

	}
	public void stateElementException(WebElement element) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				javaScriptClick(element);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		} 	
	
	}
	//Atul
	public void pauseFor(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Atul
	public void openNewTabJS() {
		((JavascriptExecutor) driver).executeScript("window.open('about:blank', '-blank')");
	}

	// Atul
	public void opneNewTabRobot() {

		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		pauseFor(2);
	}

	// Atul
	public void switchToTab(int tabNum) {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabNum));

	}

	// Atul
	public void switchToFrame(WebElement ele) {

		try {

			driver.switchTo().frame(ele);
		} catch (Exception e) {
			System.out.println("Not able to locate iframe" + ele);
		}
	}

	public void switchTodefaultContent() {
		driver.switchTo().defaultContent();
	}

	public void acceptAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
		}
	}

	public WebElement WaitForVisibility(WebElement ele, int waitTime) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime);
		return webDriverWait.until(ExpectedConditions.visibilityOf(ele));

	}

	// Atul Explicit wait
	public List<WebElement> WaitForListVisibility(List<WebElement> listOfWebElements, int waitTime) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime);
		try {
			return webDriverWait.until(ExpectedConditions.visibilityOfAllElements(listOfWebElements));
		} catch (Exception e) {
			return null;
		}
	}

	// Atul Explicit wait
	public WebElement WaitTillClikable(WebElement ele, int waitTime) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime);
		return webDriverWait.until(ExpectedConditions.elementToBeClickable(ele));

	}

	public WebElement TryCatchWait(WebElement ToClick, WebElement Checkpoint,int waitTime) {
		CommonLib cmmlb = new CommonLib(driver);
		try {
			cmmlb.javaScriptClick(ToClick);
			cmmlb.WaitForVisibility(Checkpoint, waitTime);
		} catch (Exception e1) {
			cmmlb.javaScriptClick(ToClick);	
		}
		return Checkpoint;
	}
	
	public WebElement waitForElementToPresent(WebElement webElement, int seconds) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, seconds);
		return webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
	}

	public void waitForIdPresent(String webElementId) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(webElementId)));
	}

	public void simpleWait(int seconds) throws InterruptedException {
		try {
			Thread.sleep(seconds);
		} catch (TimeoutException e) {
			System.out.println("TimeoutException : " + e.getMessage());
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Common Exception : " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void writeEPNToExcel(int rowNum, int cellNum, String sheetName, String dataToWrite)
			throws IOException {

		File file = new File(System.getProperty("user.dir")
				+ "\\resources\\ScenarioTestingJuristic_V1.1_20180305_Wave4_Cycle5.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
		Sheet sheet = xssfWorkbook.getSheet(sheetName);
		Row newRow = sheet.createRow(rowNum);
		Cell cell = newRow.createCell(cellNum);
		cell.setCellValue(dataToWrite);
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		xssfWorkbook.write(outputStream);
		outputStream.close();

	}

	public static void writeFICAStatusToExcel(int rowNum, int cellNum, String sheetName, String dataToWrite)
			throws IOException {

		File file = new File(System.getProperty("user.dir")
				+ "\\resources\\ScenarioTestingJuristic_V1.1_20180305_Wave4_Cycle5.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
		Sheet sheet = xssfWorkbook.getSheet(sheetName);
		Row newRow = sheet.createRow(rowNum);
		Cell cell = newRow.createCell(cellNum);
		cell.setCellValue(dataToWrite);
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		xssfWorkbook.write(outputStream);
		outputStream.close();

	}

	public static void writeBRSStatusToExcel(int rowNum, int cellNum, String sheetName, String dataToWrite)
			throws IOException {

		File file = new File(System.getProperty("user.dir")
				+ "\\resources\\ScenarioTestingJuristic_V1.1_20180305_Wave4_Cycle5.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
		Sheet sheet = xssfWorkbook.getSheet(sheetName);
		Row newRow = sheet.createRow(rowNum);
		Cell cell = newRow.createCell(cellNum);
		cell.setCellValue(dataToWrite);
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		xssfWorkbook.write(outputStream);
		outputStream.close();

	}

	public static void uploadDocs(String... Documents) throws AWTException, InterruptedException {
		String Path = "\\\\csv-ironbark\\BP_Test\\Teller\\EWCO\\Data Tools\\";
		for (int i = 0; i < Documents.length; i++) {
			Path = Path.concat("\"");
			Path = Path.concat(Documents[i]);
			Path = Path.concat("\"");
		}
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(new StringSelection(Path), null);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public Hashtable<String, String> setAllCountries(String scenario, int priority) {
		Hashtable<String, String> countries = new Hashtable<String, String>();
		if (priority == 1 || priority == 3 || priority == 5) {
			if (scenario.equalsIgnoreCase("NL")) {
				countries.put("coi", "AUSTRALIA");
				countries.put("cob", "SOUTH AFRICA");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "SOUTH AFRICA");
			} else if (scenario.equalsIgnoreCase("NH")) {
				countries.put("coi", "CYPRUS");
				countries.put("cob", "SOUTH AFRICA");
				countries.put("cor", "CYPRUS");
				countries.put("coc", "SOUTH AFRICA");
			} else if (scenario.equalsIgnoreCase("YL")) {
				countries.put("coi", "AUSTRALIA");
				countries.put("cob", "SOUTH AFRICA");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "SOUTH AFRICA");
			} else if (scenario.equalsIgnoreCase("YH")) {
				countries.put("coi", "CYPRUS");
				countries.put("cob", "CYPRUS");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "SOUTH AFRICA");
			}
		} else if (priority == 2) {
			if (scenario.equalsIgnoreCase("NL")) {
				countries.put("coi", "AUSTRALIA");
				countries.put("cob", "AUSTRALIA");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "AUSTRALIA");
			} else if (scenario.equalsIgnoreCase("NH")) {
				countries.put("coi", "CYPRUS");
				countries.put("cob", "CYPRUS");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "CYPRUS");
			} else if (scenario.equalsIgnoreCase("YL")) {
				countries.put("coi", "AUSTRALIA");
				countries.put("cob", "AUSTRALIA");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "AUSTRALIA");
			} else if (scenario.equalsIgnoreCase("YH")) {
				countries.put("coi", "CYPRUS");
				countries.put("cob", "CYPRUS");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "CYPRUS");
			}
		} else if (priority == 6) {
			countries.put("cob", "SOUTH AFRICA");
			if (scenario.equalsIgnoreCase("NL") || scenario.equalsIgnoreCase("YL")) {
				countries.put("cor", "AUSTRALIA");
				countries.put("coc", "AUSTRALIA");
			} else if (scenario.equalsIgnoreCase("NH") || scenario.equalsIgnoreCase("YH")) {
				countries.put("cor", "CYPRUS");
				countries.put("coc", "CYPRUS");
			}
		} else if (priority == 8 || priority == 12) {
			if (scenario.equalsIgnoreCase("NL") || scenario.equalsIgnoreCase("YL")) {
				countries.put("coi", "AUSTRALIA");
				countries.put("cob", "AUSTRALIA");
				countries.put("cor", "AUSTRALIA");
				countries.put("coc", "AUSTRALIA");
			} else if (scenario.equalsIgnoreCase("NH") || scenario.equalsIgnoreCase("YH")) {
				countries.put("coi", "CYPRUS");
				countries.put("cob", "CYPRUS");
				countries.put("cor", "CYPRUS");
				countries.put("coc", "CYPRUS");
			}
		} else if (priority == 9) {
			countries.put("cor", "SOUTH AFRICA");
			if (scenario.equalsIgnoreCase("NL") || scenario.equalsIgnoreCase("YL")) {
				countries.put("cob", "AUSTRALIA");
				countries.put("cor", "AUSTRALIA");
				countries.put("coc", "AUSTRALIA");
			} else if (scenario.equalsIgnoreCase("NH") || scenario.equalsIgnoreCase("YH")) {
				countries.put("cob", "CYPRUS");
				countries.put("cor", "CYPRUS");
				countries.put("coc", "CYPRUS");
			}
		} else if (priority == 7) {
			if (scenario.equalsIgnoreCase("NL")) {
				countries.put("coi", "AUSTRALIA");
				countries.put("cob", "AUSTRALIA");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "AUSTRALIA");
			} else if (scenario.equalsIgnoreCase("NH")) {
				countries.put("coi", "CYPRUS");
				countries.put("cob", "CYPRUS");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "CYPRUS");
			} else if (scenario.equalsIgnoreCase("YL")) {
				countries.put("coi", "AUSTRALIA");
				countries.put("cob", "AUSTRALIA");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "AUSTRALIA");
			} else if (scenario.equalsIgnoreCase("YH")) {
				countries.put("coi", "CYPRUS");
				countries.put("cob", "CYPRUS");
				countries.put("cor", "SOUTH AFRICA");
				countries.put("coc", "CYPRUS");
			}
		}
		return countries;
	}

	public void waitUntilElementDisappears(List<WebElement> ele) {
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.invisibilityOfAllElements(ele));
	}
	

	public WebElement waitUntilElementDisappears(WebElement ele) {
		List<WebElement> list = new ArrayList<WebElement>();
		list.add(ele);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		boolean done = false;
		int iLoop = 0;
		int loop = 20;
		while (!done && iLoop <= loop) {
			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(list));
				done = true;
			} catch (Exception e) {
				iLoop++;
			}
		}

		if (done) {
			return ele;
		} else {
			return null;
		}
	}

	public void clickAndTryMultiple(WebElement ele, int attempts) {
		boolean done = false;
		int iLoop = 0;
		while (!done && iLoop <= attempts) {
			try {
				Thread.sleep(2000);
				ele.click();
				done = true;
			} catch (Exception e) {
				iLoop++;
				if (iLoop == attempts) {
					try {
						javaScriptClick(ele);
					}catch(Exception e1) {
						
					}
					System.out.println("Did not got element: " + ele);
				}
			}
		}
	}

	public void sendKeysAndTryMultiple(WebElement ele, String value, int attempts) {
		boolean done = false;
		int iLoop = 0;
		while (!done && iLoop <= attempts) {
			try {
				Thread.sleep(2000);
				ele.sendKeys(value);
				done = true;
			} catch (Exception e) {
				iLoop++;
			}
		}
	}
	
	public void action(WebElement web)
	{
		Actions act=new Actions(driver);
		//act.moveToElement(web).click().perform();
		act.moveToElement(web).build().perform();
		
	}
	
	
	
	
	
	//public void getScreenshot(String message)
	//{
		//String screenshotPath = null;
		//try {
			//screenshotPath = BaseClass.getScreenShot(driver,"ClientDashboard");
		//} catch (IOException e) {
			//System.out.println("Problem in taking screenshot.");
			//e.printStackTrace();
		//}
		//ExtentTestManager.getTest().log(LogStatus.INFO,message,ExtentTestManager.getTest().addScreenCapture(screenshotPath));
	//}
	public boolean equalsIgnoreCase(String needle, String... haystack) {
	    for(String s : haystack) {
	        if(needle.equalsIgnoreCase(s)) {
	            return true;
	        }
	    }

	    return false;
	}
}
