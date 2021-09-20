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

public class TC04_manageUserMerchantPortal extends TC01_merchantLogin {

	TC04_manageUserMerchantPortal manageUsers_;
	
	@FindBy(how = How.ID, using = "form:j_id476302318_ba1407b_label")
	public WebElement config;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba141b5\"]/span/a")
	public WebElement clickManageUsers;
	
	@FindBy(how = How.ID, using = "searchAccountForm:j_id250499384_eee506a")
	public WebElement searchManageUsers;
	
	@FindBy(how = How.ID, using = "searchAccountForm:searchFirstNameField")
	public WebElement enterDummyFirstName;
	
	@FindBy(how = How.ID, using = "searchAccountForm:j_id250499384_eee50be")
	public WebElement resetManageUsers;
	
	public void openManageUsersScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			manageUsers_ = PageFactory.initElements(driver, TC04_manageUserMerchantPortal.class);
			driver.switchTo().defaultContent();
			manageUsers_.config.click();
			manageUsers_.clickManageUsers.click();
			test = extent.createTest("TC-12-Merchant Portal Manage Users Screen ")
					.pass(MarkupHelper.createLabel("Manage Users Screen has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Manage Users Screen has been Opened", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-12-Merchant Portal Manage Users Screen ")
					.fail(MarkupHelper.createLabel("Manage Users Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void searchManageUsersScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			manageUsers_.searchManageUsers.click();
			test = extent.createTest("TC-13-Search Merchant Portal Manage Users Screen ")
					.pass(MarkupHelper.createLabel("Manage Users Screen has been searching.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Manage Users Screen has been searched", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-13-Search Merchant Portal Manage Users Screen ")
					.fail(MarkupHelper.createLabel("Manage Users Screen has not been searched", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void resetManageUsersScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			manageUsers_.enterDummyFirstName.sendKeys("Test User");
			manageUsers_.resetManageUsers.click();
			test = extent.createTest("TC-14-RESET Merchant Portal Manage Users Screen ")
					.pass(MarkupHelper.createLabel("Manage Users Screen has been resetting.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Manage Users Screen has been RESET", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-14-RESET Merchant Portal Manage Users Screen ")
					.fail(MarkupHelper.createLabel("Manage Users Screen has not been RESET", ExtentColor.RED));
			extent.flush();
		}
	}
}
