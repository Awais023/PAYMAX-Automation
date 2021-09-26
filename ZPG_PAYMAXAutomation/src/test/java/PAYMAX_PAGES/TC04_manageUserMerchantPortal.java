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
	
	@FindBy(how = How.ID, using = "searchAccountForm:j_id250499384_eee5067")
	public WebElement clickAddManageUsers;

	@FindBy(how = How.ID, using = "addUserAccountForm:email")
	public WebElement emailManageUsers;
	
	@FindBy(how = How.ID, using = "addUserAccountForm:firstName")
	public WebElement firstNameManageUsers;
	
	@FindBy(how = How.ID, using = "addUserAccountForm:lastName")
	public WebElement lastNameManageUsers;
	
	@FindBy(how = How.ID, using = "addUserAccountForm:mobileNum")
	public WebElement contactManageUsers;
	
	@FindBy(how = How.ID, using = "addUserAccountForm:designation")
	public WebElement designationManageUsers;
	
	@FindBy(how = How.ID, using = "addUserAccountForm:rolesItem0")
	public WebElement availableRolesManageUsers;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"addUserAccountForm:roles\"]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/button")
	public WebElement selectAvialableRolesManageUsers;
	
	@FindBy(how = How.ID, using = "addUserAccountForm:j_id612102437_247bf0cb")
	public WebElement addManageUsersBtn;
	

	public void openManageUsersScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			manageUsers_ = PageFactory.initElements(driver, TC04_manageUserMerchantPortal.class);
			driver.switchTo().defaultContent();
			manageUsers_.config.click();
			manageUsers_.clickManageUsers.click();
			test = extent.createTest("TC-13-Merchant Portal Manage Users Screen ")
					.pass(MarkupHelper.createLabel("Manage Users Screen has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Manage Users Screen has been Opened", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-13-Merchant Portal Manage Users Screen ")
					.fail(MarkupHelper.createLabel("Manage Users Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void searchManageUsersScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			manageUsers_.searchManageUsers.click();
			test = extent.createTest("TC-14-Search Merchant Portal Manage Users Screen ")
					.pass(MarkupHelper.createLabel("Manage Users Screen has been searching.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Manage Users Screen has been searched", ExtentColor.GREEN));
			String screenShotPath__ = capture(driver, "Search Manage Users");
			test.addScreenCaptureFromPath(screenShotPath__);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-14-Search Merchant Portal Manage Users Screen ")
					.fail(MarkupHelper.createLabel("Manage Users Screen has not been searched", ExtentColor.RED));
			extent.flush();
		}
	}
	public void openAddManageUsersScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			manageUsers_.clickAddManageUsers.click();
			test = extent.createTest("TC-15-Open Add Manage Users ")
					.pass(MarkupHelper.createLabel("Add Manage Users Screen has been Opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Add Manage Users Screen has been Opened", ExtentColor.GREEN));
			String screenShotPath__ = capture(driver, "Add Manage User Screen");
			test.addScreenCaptureFromPath(screenShotPath__);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-15-Open Add Manage Users ")
					.fail(MarkupHelper.createLabel("Add Manage Users Screen has not been opened", ExtentColor.RED));
			extent.flush();
		}
	}
	public void addManageUsersScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			manageUsers_.emailManageUsers.sendKeys("test@paymax.com");
			manageUsers_.firstNameManageUsers.sendKeys("Awais");
			manageUsers_.lastNameManageUsers.sendKeys("Sultan");
			manageUsers_.contactManageUsers.sendKeys("03111111111");
			manageUsers_.designationManageUsers.sendKeys("Software Engineer");
			manageUsers_.availableRolesManageUsers.click();
			manageUsers_.selectAvialableRolesManageUsers.click();
			manageUsers_.addManageUsersBtn.click();
			test = extent.createTest("TC-16-ADD Merchant Portal Manage Users ")
					.pass(MarkupHelper.createLabel("Manage Users  has been adding.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Manage Users  has been ADDED", ExtentColor.GREEN));
			String screenShotPath__ = capture(driver, "Add Manage User");
			test.addScreenCaptureFromPath(screenShotPath__);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-16-ADD Merchant Portal Manage Users ")
					.fail(MarkupHelper.createLabel("Manage Users  has not been ADDED", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void resetManageUsersScreen() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			manageUsers_.enterDummyFirstName.sendKeys("Test User");
			String screenShotPath__ = capture(driver, "Before Resetting");
			test.addScreenCaptureFromPath(screenShotPath__);
			manageUsers_.resetManageUsers.click();
			test = extent.createTest("TC-17-RESET Merchant Portal Manage Users Screen ")
					.pass(MarkupHelper.createLabel("Manage Users Screen has been resetting.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Manage Users Screen has been RESET", ExtentColor.GREEN));
			String screenShotPath___ = capture(driver, "After Resetting");
			test.addScreenCaptureFromPath(screenShotPath___);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-17-RESET Merchant Portal Manage Users Screen ")
					.fail(MarkupHelper.createLabel("Manage Users Screen has not been RESET", ExtentColor.RED));
			extent.flush();
		}
	}
}
