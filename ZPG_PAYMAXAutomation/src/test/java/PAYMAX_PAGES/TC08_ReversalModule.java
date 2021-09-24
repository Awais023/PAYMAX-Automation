package PAYMAX_PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC08_ReversalModule extends TC01_merchantLogin {

	TC08_ReversalModule reversal;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba14311_label\"]")
	public WebElement clickotherModule;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba144b9\"]/span")
	public WebElement clickReversalModule;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba1449f\"]/span/a")
	public WebElement clickReversalBulkUpload;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"upload\"]/div[1]/span[1]/span[1]/span/span/input")
	public WebElement clickUploadButton;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"upload\"]/div[1]/span[1]/span[2]/span")
	public WebElement uploadFile;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"viewBatchId:header:inactive\"]/span")
	public WebElement clickViewBatch;
	
	@FindBy(how = How.ID, using = "viewBatchForm:j_id1107602318_4204a904")
	public WebElement searchBatch;
	
	@FindBy(how = How.ID, using = "viewBatchForm:reversalBatchesTable:14153:orderIdCol")
	public WebElement ViewBatchFileStatus;
	
	@FindBy(how = How.ID, using = "errorMessages_body")
	public WebElement reversalFileError;
	

	public void openOtherTab(String OtherScreen, String ReversalModuleScreen) throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			reversal = PageFactory.initElements(driver, TC08_ReversalModule.class);
			driver.switchTo().defaultContent();
			reversal.clickotherModule.click();
			if (OtherScreen.equals("Reversal Module") && ReversalModuleScreen.equals("Reversal Bulk Upload")) {
				reversal.clickReversalModule.click();
				reversal.clickReversalBulkUpload.click();
				test = extent.createTest("TC-36-Open Reversal Bulk Upload Screen ").pass(
						MarkupHelper.createLabel("Reversal Bulk Upload Screen has been opening.", ExtentColor.GREEN));
				test.pass(MarkupHelper.createLabel("Reversal Bulk Upload Screen has been Opened", ExtentColor.GREEN));
			}
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-36-Open Reversal Bulk Upload Screen ")
					.fail(MarkupHelper.createLabel("Reversal Bulk Upload Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}

	public void uploadReversalFile() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			reversal.clickUploadButton.sendKeys(property.getProperty("reversalFile_Location"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			reversal.uploadFile.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(reversal.reversalFileError));
			
			test = extent.createTest("TC-37-Uplaod Reversal File")
					.pass(MarkupHelper.createLabel("Reversal file has been uploading.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Reversal file has been uploaded", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			
			extent.createTest("TC-37-Uplaod Reversal File")
					.fail(MarkupHelper.createLabel("Reversal file has been uploaded : "+error_, ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void checkReversalFileStatus() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			reversal.clickViewBatch.click();
			reversal.searchBatch.click();
			String reversalFileStatus_ = reversal.ViewBatchFileStatus.getText();
			test = extent.createTest("TC-38-View Batch Status")
					.pass(MarkupHelper.createLabel("Reversal file Status: "+reversalFileStatus_, ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-38-View Batch Status")
					.fail(MarkupHelper.createLabel("Reversal file status has not been updated", ExtentColor.RED));
			extent.flush();
		}
	}
}
