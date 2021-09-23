package PAYMAX_PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC07_SettlementModule extends TC01_merchantLogin {

	TC07_SettlementModule Settlemnt_Module;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba143fe_label\"]")
	public WebElement clickSettlementModule;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba14366\"]/span/a")
	public WebElement clickSettlementTransactionHistory;

	@FindBy(how = How.ID, using = "SearchSettlmentForm:j_id2055790156_7a88dfe1")
	public WebElement searchSettlementTransactionHistory;

	@FindBy(how = How.ID, using = "SearchSettlmentForm:orderId")
	public WebElement searchOPSSettlementTransactionHistory;

	@FindBy(how = How.ID, using = "SearchSettlmentForm:j_id2055790156_7a88dff6")
	public WebElement resetSettlementTransactionHistory;

	@FindBy(how = How.ID, using = "SearchSettlmentForm:j_id2055790156_7a88dfec")
	public WebElement exportSettlementTransactionHistory;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba1434f\"]/span/a")
	public WebElement clickSettlementSettings;

	@FindBy(how = How.ID, using = "settlementSettingsForm:j_id1648084505_623bc40c")
	public WebElement transferNow;

	@FindBy(how = How.ID, using = "settlementSettingsForm:settlementAmount")
	public WebElement minIBFT;

	@FindBy(how = How.ID, using = "settlementSettingsForm:j_id1648084505_623bc436")
	public WebElement saveMinIBFT;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba14328\"]/span/a")
	public WebElement clickSettlementReport;
	
	@FindBy(how = How.ID, using = "settlementReportForm:j_id769492310_2ddd847f")
	public WebElement exportSettlementReport;
	
	@FindBy(how = How.ID, using = "settlementReportForm:batchID")
	public WebElement enterDummyBatchID;
	
	@FindBy(how = How.ID, using = "settlementReportForm:j_id769492310_2ddd846e")
	public WebElement resetSettlementReportScreen;

	public void openSettlementTransactionHistory(String SettlementModuleScreen) throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Settlemnt_Module = PageFactory.initElements(driver, TC07_SettlementModule.class);
			driver.switchTo().defaultContent();
			Settlemnt_Module.clickSettlementModule.click();
			if (SettlementModuleScreen.equals("Settlement Transaction History")) {
				Settlemnt_Module.clickSettlementTransactionHistory.click();
				test = extent.createTest("TC-28-Open Settlement Transaction History Screen ").pass(MarkupHelper
						.createLabel("Settlement Transaction History Screen has been opening.", ExtentColor.GREEN));
				test.pass(MarkupHelper.createLabel("Settlement Transaction History Screen has been Opened",
						ExtentColor.GREEN));
			} else if (SettlementModuleScreen.equals("Settlement Settings")) {
				Settlemnt_Module.clickSettlementSettings.click();
				test = extent.createTest("TC-28-Open Settlement Settings Screen ").pass(
						MarkupHelper.createLabel("Settlement Settings Screen has been opening.", ExtentColor.GREEN));
				test.pass(MarkupHelper.createLabel("Settlement Settings Screen has been Opened", ExtentColor.GREEN));
			} else if (SettlementModuleScreen.equals("Settlement Report")) {
				Settlemnt_Module.clickSettlementReport.click();
				test = extent.createTest("TC-28-Open Settlement Report Screen ").pass(
						MarkupHelper.createLabel("Settlement Report Screen has been opening.", ExtentColor.GREEN));
				test.pass(MarkupHelper.createLabel("Settlement Report Screen has been Opened", ExtentColor.GREEN));
			}
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-28-Open Settlement Module Screen")
					.fail(MarkupHelper.createLabel("Settlement Module Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}

	public void searchSettlementTransactionHistory() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			Settlemnt_Module.searchOPSSettlementTransactionHistory.sendKeys("checkout");
			Settlemnt_Module.searchSettlementTransactionHistory.click();
			test = extent.createTest("TC-29-Search Settlement Transaction History Screen ").pass(MarkupHelper
					.createLabel("Settlement Transaction History Screen has been searching.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Settlement Transaction History Screen has been searched",
					ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-29-Search Settlement Transaction History Screen ").fail(
					MarkupHelper.createLabel("Settlement Transaction History has not been searched", ExtentColor.RED));
			extent.flush();
		}
	}

	public void resetSettlementTransactionHistory() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			Settlemnt_Module.searchOPSSettlementTransactionHistory.sendKeys("ABCDEFGHIJKLMNOPQRSTUVXYZ");
			Settlemnt_Module.resetSettlementTransactionHistory.click();
			test = extent.createTest("TC-30-RESET Settlement Transaction History Screen ").pass(MarkupHelper
					.createLabel("Settlement Transaction History Screen has been resetting.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Settlement Transaction History Screen has been RESET",
					ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-30-RESET Settlement Transaction History Screen ").fail(
					MarkupHelper.createLabel("Settlement Transaction History has not been RESET", ExtentColor.RED));
			extent.flush();
		}
	}

	public void exportSettlementTransactionHistory() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			Settlemnt_Module.exportSettlementTransactionHistory.click();
			test = extent.createTest("TC-31-Export Settlement Transaction History Screen ").pass(MarkupHelper
					.createLabel("Settlement Transaction History Screen has been exporting.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Settlement Transaction History Screen has been exported",
					ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-31-Export Settlement Transaction History Screen ").fail(
					MarkupHelper.createLabel("Settlement Transaction History has not been exported", ExtentColor.RED));
			extent.flush();
		}
	}

	public void transferNow() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			Settlemnt_Module.transferNow.click();
			test = extent.createTest("TC-32-Transfer Now ")
					.pass(MarkupHelper.createLabel("Amount has been transferring", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Amount has been transferred.", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-32-Transfer Now ")
					.fail(MarkupHelper.createLabel("Amount has not been transferred.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void saveMiniIbftLimit() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			Settlemnt_Module.minIBFT.clear();
			Settlemnt_Module.minIBFT.sendKeys("2.0");
			Settlemnt_Module.saveMinIBFT.click();
			test = extent.createTest("TC-33-Save Min IBFT Limit")
					.pass(MarkupHelper.createLabel("Min IBFT Limit has been saving", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Min IBFT Limit has been saved.", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-33-Save Min IBFT Limit")
					.fail(MarkupHelper.createLabel("Min IBFT Limit has not been saved.", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void exportSettlementReports() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			Settlemnt_Module.exportSettlementReport.click();
			test = extent.createTest("TC-34-Export Settlement Transaction Report")
					.pass(MarkupHelper.createLabel("Settlement Transaction Report has been exporting", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Settlement Transaction Report has been exported.", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-34-Export Settlement Transaction Report")
					.fail(MarkupHelper.createLabel("Settlement Transaction Report has not been exported.", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void resetSettlementReportScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			Settlemnt_Module.enterDummyBatchID.sendKeys("4631456456");
			Settlemnt_Module.resetSettlementReportScreen.click();			
			test = extent.createTest("TC-35- RESET Settlement Transaction Report Screen")
					.pass(MarkupHelper.createLabel("Settlement Transaction Report Screen has been resetting", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Settlement Transaction Report Screen has been reset.", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-35- RESET Settlement Transaction Report Screen")
					.fail(MarkupHelper.createLabel("Settlement Transaction Report Screen has not been reset.", ExtentColor.RED));
			extent.flush();
		}
	}

}
