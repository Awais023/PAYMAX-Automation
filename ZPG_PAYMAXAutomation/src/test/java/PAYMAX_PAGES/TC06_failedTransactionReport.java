package PAYMAX_PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC06_failedTransactionReport extends TC01_merchantLogin{

	TC06_failedTransactionReport failReport;
	
	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[1]/div[1]/div/div/form/table/tbody/tr/td[3]/div/div[1]/table/tbody/tr/td[2]")
	public WebElement clickAccountSettings;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba14243\"]/span/a")
	public WebElement clickFailedTransReport;
	
	@FindBy(how = How.ID, using = "searchFailedTransaction:storeId")
	public WebElement failedTransReportStoreID;
	
	@FindBy(how = How.ID, using = "searchFailedTransaction:j_id1210594062_482832b8")
	public WebElement searchFailedTransReport;

	@FindBy(how = How.ID, using = "searchFailedTransaction:j_id1210594062_482832cb")
	public WebElement resetFailedTransReport;
	
	@FindBy(how = How.ID, using = "searchFailedTransaction:j_id1210594062_482832a1")
	public WebElement exportFailedTransReport;

	public void openFailedTransactionReport() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			failReport = PageFactory.initElements(driver, TC06_failedTransactionReport.class);
			driver.switchTo().defaultContent();
			failReport.clickAccountSettings.click();
			failReport.clickFailedTransReport.click();
			test = extent.createTest("TC-24-Open Failed Transaction Report Screen ")
					.pass(MarkupHelper.createLabel("Failed Transaction Report Screen has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Failed Transaction Report Screen has been Opened", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-24-Open Failed Transaction Report Screen ")
					.fail(MarkupHelper.createLabel("Change Password Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void searchFailedTransactionReport() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			failReport = PageFactory.initElements(driver, TC06_failedTransactionReport.class);
			driver.switchTo().frame("applicationContent");
			failReport.failedTransReportStoreID.sendKeys("80567");
			failReport.searchFailedTransReport.click();		
			test = extent.createTest("TC-25-Search Failed Transactions")
					.pass(MarkupHelper.createLabel("Failed Transactions has been searching.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Failed Transactions has been searched", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-25-Search Failed Transactions")
					.fail(MarkupHelper.createLabel("Failed Transactions has not been searched", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void resetFailedTransactionReport() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			failReport = PageFactory.initElements(driver, TC06_failedTransactionReport.class);
			driver.switchTo().frame("applicationContent");
			failReport.failedTransReportStoreID.sendKeys("80567");
			failReport.resetFailedTransReport.click();		
			test = extent.createTest("TC-26-RESET Failed Transactions")
					.pass(MarkupHelper.createLabel("Failed Transactions has been resetting.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Failed Transactions has been RESET.", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-26-RESET Failed Transactions")
					.fail(MarkupHelper.createLabel("Failed Transactions has not been RESET.", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void exportFailedTransactionReport() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			failReport = PageFactory.initElements(driver, TC06_failedTransactionReport.class);
			driver.switchTo().frame("applicationContent");
			failReport.exportFailedTransReport.click();
			test = extent.createTest("TC-27-Export Failed Transactions")
					.pass(MarkupHelper.createLabel("Failed Transactions report has been exporting.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Failed Transactions report has been exported.", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-27-Export Failed Transactions")
					.fail(MarkupHelper.createLabel("Failed Transactions report has not been exported.", ExtentColor.RED));
			extent.flush();
		}
	}
}
