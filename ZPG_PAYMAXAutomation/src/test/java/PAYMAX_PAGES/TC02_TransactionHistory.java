package PAYMAX_PAGES;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC02_TransactionHistory extends TC01_merchantLogin {

	TC02_TransactionHistory TrxHstry;

	@FindBy(how = How.XPATH, xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")
	public WebElement clickTransactionHistoryTab;
	
	@FindBy(how = How.ID, using = "SearchTransHistoryForm:j_id2002390525_775a04c3")
	public WebElement searchTransactionHistory;
	
	@FindBy(how = How.ID, using = "SearchTransHistoryForm:customerMobileAccountNumber")
	public WebElement customerMobile;

	@FindBy(how = How.ID, using = "SearchTransHistoryForm:j_id2002390525_775a04a5")
	public WebElement resetTrxHstry;
	
	@FindBy(how = How.NAME, using = "SearchTransHistoryForm:j_id2002390525_775a04ce")
	public WebElement clickExport;
	

	
	public void openTransactionHistoryScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			TrxHstry = PageFactory.initElements(driver, TC02_TransactionHistory.class);
			driver.switchTo().defaultContent();
			TrxHstry.clickTransactionHistoryTab.click();
			test = extent.createTest("Step5-Transaction History Screen ")
					.pass(MarkupHelper.createLabel("Transaction History Screen has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Transaction History Screen has been Opened",
					ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("Step5-Transaction History Screen ").fail(MarkupHelper
					.createLabel("Transaction History Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}

	 public static String capture(WebDriver driver_,String screenShotName) throws IOException
	    {
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String dest = System.getProperty("user.dir") +"/ErrorScreenshots/"+screenShotName+".png";
	        File destination = new File(dest);
	        FileUtils.copyFile(source, destination);        
	                     
	        return dest;
	    }
	 
	public void searchTransactionHistory() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			TrxHstry.searchTransactionHistory.click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");
			String screenShotPath = capture(driver, "screenShotName");
			test = extent.createTest("Step6-Search Transaction History")
					.pass(MarkupHelper.createLabel("Transaction History has been opening Search.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Transaction History has been Searched",
					ExtentColor.GREEN));
			test.addScreenCaptureFromPath(screenShotPath);
            extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("Step6-Search Transaction History").fail(MarkupHelper
					.createLabel("Transaction History has not been Searched", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void resetTransactionHistoryScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			TrxHstry.customerMobile.sendKeys("03364594224");
			String screenShotPath = capture(driver, "screenShotName");
			test.addScreenCaptureFromPath(screenShotPath);
			TrxHstry.resetTrxHstry.click();
			test = extent.createTest("Step7-RESET Transaction History Screen ")
					.pass(MarkupHelper.createLabel("Transaction History Screen has been reseting.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Transaction History Screen has been reset",
					ExtentColor.GREEN));
			test.addScreenCaptureFromPath(screenShotPath);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("Step7-RESET Transaction History Screen ").fail(MarkupHelper
					.createLabel("Transaction History Screen has not been reset", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void exportTransactionHistoryFile() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			TrxHstry.clickExport.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			test = extent.createTest("Step8-Export Transaction History File")
					.pass(MarkupHelper.createLabel("Transaction History File has been Exporting.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Transaction History Screen has been Exported",
					ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("Step8-Export Transaction History File").fail(MarkupHelper
					.createLabel("Transaction History Screen has not been Exported", ExtentColor.RED));
			extent.flush();
		}
	}

}
