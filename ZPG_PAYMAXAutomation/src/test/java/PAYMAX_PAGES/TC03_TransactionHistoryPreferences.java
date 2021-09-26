package PAYMAX_PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC03_TransactionHistoryPreferences extends TC01_merchantLogin {

	TC03_TransactionHistoryPreferences TrxHstryPrefer;

	@FindBy(how = How.ID, using = "form:j_id476302318_ba1407b_label")
	public WebElement clickConfigurations;

	@FindBy(how = How.ID, using = "form:transactionHistoryPref")
	public WebElement clickTransactionHistoryPreferences;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"addFilterForm:userFiltersItem14\"]/td[2]")
	public WebElement clickTransactionHistoryPreferencesfield;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"addFilterForm:userFilters\"]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/button")
	public WebElement clickTransactionHistoryPreferencesFieldUpdate;

	@FindBy(how = How.ID, using = "addFilterForm:j_id2062127003_7ae98dd2")
	public WebElement updateTransactionHistoryPreferences;

	@FindBy(how = How.ID, using = "addFilterForm:j_id2062127003_7ae98dcd")
	public WebElement resetTransactionHistoryPreferences;

	@FindBy(how = How.ID, using = "addFilterForm:j_id2062127003_7ae98e60")
	public WebElement yesResetTransactionHistoryPreferences;
	

	public void openTransactionHistoryPreferencesScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			TrxHstryPrefer = PageFactory.initElements(driver, TC03_TransactionHistoryPreferences.class);
			driver.switchTo().defaultContent();
			TrxHstryPrefer.clickConfigurations.click();
			TrxHstryPrefer.clickTransactionHistoryPreferences.click();
			test = extent.createTest("TC-10-Transaction History Preference Screen ").pass(MarkupHelper
					.createLabel("Transaction History Preference Screen has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Transaction History Preference Screen has been Opened",
					ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-10-Transaction History Preference Screen ").fail(MarkupHelper
					.createLabel("Transaction History Preference Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}

	public void updateTransactionHistoryPreferencesScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			TrxHstryPrefer.clickTransactionHistoryPreferencesfield.click();
			TrxHstryPrefer.clickTransactionHistoryPreferencesFieldUpdate.click();
			TrxHstryPrefer.updateTransactionHistoryPreferences.click();
			String screenShotPath = capture(driver, "Update Transaction History");
			test = extent.createTest("TC-11-Update Transaction History Preference Screen ").pass(MarkupHelper
					.createLabel("Transaction History Preference Screen has been updating.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Transaction History Preference Screen has been Updated",
					ExtentColor.GREEN));
			test.addScreenCaptureFromPath(screenShotPath);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-11-Transaction History Preference Screen ").fail(MarkupHelper
					.createLabel("Transaction History Preference Screen has not been Updated", ExtentColor.RED));
			extent.flush();
		}
	}

	public void resetTransactionHistoryPreferencesScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			TrxHstryPrefer.clickTransactionHistoryPreferencesfield.click();
			String screenShotPath = capture(driver, "Before Selecting Transaction History Preferences");
			test.addScreenCaptureFromPath(screenShotPath);
			TrxHstryPrefer.clickTransactionHistoryPreferencesFieldUpdate.click();
			String screenShotPath__ = capture(driver, "After Selecting Transaction History Preferences");
			test.addScreenCaptureFromPath(screenShotPath__);
			TrxHstryPrefer.resetTransactionHistoryPreferences.click();
			TrxHstryPrefer.yesResetTransactionHistoryPreferences.click();
			test = extent.createTest("TC-12-RESET Transaction History Preference Screen ").pass(MarkupHelper
					.createLabel("Transaction History Preference Screen has been resetting.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Transaction History Preference Screen has been RESET",
					ExtentColor.GREEN));
			String screenShotPath_ = capture(driver, "After Resetting Transaction History Preferences");
			test.addScreenCaptureFromPath(screenShotPath_);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-12-Transaction History Preference Screen ").fail(MarkupHelper
					.createLabel("Transaction History Preference Screen has not been RESET", ExtentColor.RED));
			extent.flush();
		}
	}
}
