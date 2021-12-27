package adminPAYMAX_PAGES;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC11_adminManageUsers extends TC10_adminLogin {

	TC11_adminManageUsers manageUser;

	@FindBy(how = How.ID, using = "form:MANAGEUSERS")
	public WebElement manageUserTab;

	@FindBy(how = How.ID, using = "searchAccountForm:j_id603732948_23fc3a74")
	public WebElement clickAddNewUser;

	@FindBy(how = How.ID, using = "addUserAccountForm:loginId")
	public WebElement loginID;

	@FindBy(how = How.ID, using = "addUserAccountForm:email")
	public WebElement email;

	@FindBy(how = How.ID, using = "addUserAccountForm:firstName")
	public WebElement firstName;

	@FindBy(how = How.ID, using = "addUserAccountForm:lastName")
	public WebElement lastName;

	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[2]/form/div[2]/div[1]/div/span/div/table/tbody/tr/td[1]/div/div/div[2]/div/div/div[1]")
	public WebElement selectAvailableRoles;

	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[2]/form/div[2]/div[1]/div/span/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/button")
	public WebElement moveAvailableRoles;

	@FindBy(how = How.ID, using = "addUserAccountForm:j_id1910910918_71e62d75")
	public WebElement saveUser;

	@FindBy(how = How.ID, using = "successMessages_body")
	public WebElement successBody;

	@FindBy(how = How.ID, using = "searchAccountForm:searchEmailField")
	public WebElement searchEmail;

	@FindBy(how = How.ID, using = "searchAccountForm:j_id603732948_23fc3ac0")
	public WebElement search;

	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[2]/div[4]/div/div/form/table/tbody[1]/tr[1]/td[6]/div/a[2]")
	public WebElement clickDeactiviate;

	@FindBy(how = How.ID, using = "manageUsersForm:usersTable:0:j_id603732948_23fc3db6")
	public WebElement clickYesDeactiviate;

	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[2]/div[4]/div/div/form/table/tbody[1]/tr[1]/td[6]/div/a")
	public WebElement clickActiviate;

	@FindBy(how = How.ID, using = "manageUsersForm:usersTable:0:j_id603732948_23fc3ebd")
	public WebElement clickYesActiviate;

	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[2]/div[4]/div/div/form/table/tbody[1]/tr[2]/td[6]/div/a[1]")
	public WebElement clickEditUserButton;

	@FindBy(how = How.ID, using = "manageUserAccountForm:firstName")
	public WebElement editUserFirstName;
	
	@FindBy(how = How.ID, using = "manageUserAccountForm:j_id1410192371_540dd1a5")
	public WebElement clickUpdateUserBtm;

	public void clickManageUser() throws Throwable {
		try {
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			manageUser = PageFactory.initElements(admindriver, TC11_adminManageUsers.class);
			manageUser.manageUserTab.click();
			test = extent.createTest("TC-6-Open Manage Users")
					.pass(MarkupHelper.createLabel("Manage User Screen has been opened.", ExtentColor.GREEN));
			String screenShotPath_ = capture(admindriver, "Manage Users");
			test.addScreenCaptureFromPath(screenShotPath_);
		} catch (Exception e) {
			System.out.println(e);
			test = extent.createTest("TC-6-Open Manage Users")
					.fail(MarkupHelper.createLabel("Manage User Screen has not been opened.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void addNewManageUser() throws Throwable {
		try {
			admindriver.switchTo().frame("applicationContent");
			manageUser.clickAddNewUser.click();
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			manageUser.loginID.sendKeys("awaisSultan4@paymax.com");
			manageUser.email.sendKeys("awaisSultan4@paymax.com");
			manageUser.firstName.sendKeys("Test");
			manageUser.lastName.sendKeys("QA");
			manageUser.selectAvailableRoles.click();
			manageUser.moveAvailableRoles.click();
			manageUser.saveUser.click();
			WebDriverWait wait = new WebDriverWait(admindriver, 30);
			wait.until(ExpectedConditions.visibilityOf(manageUser.successBody));
			String successMsg = manageUser.successBody.getText();
			System.out.println(successMsg);
			test = extent.createTest("TC-7-Add Manage User").pass(
					MarkupHelper.createLabel("Manage User Screen Input fields has been entered", ExtentColor.GREEN));
			if (manageUser.successBody.isDisplayed()) {
				test.pass(MarkupHelper.createLabel("New User has been added", ExtentColor.GREEN));
			} else {
				test.pass(MarkupHelper.createLabel("New User has not been added", ExtentColor.RED));
			}
			String screenShotPath = capture(admindriver, "Manage Users Success Screen");
			test.addScreenCaptureFromPath(screenShotPath);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			test = extent.createTest("TC-7-Add Manage User")
					.fail(MarkupHelper.createLabel("New User has not been added", ExtentColor.RED));
			extent.flush();
		}
	}

	public void searchManageUser() throws Throwable {
		try {
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			admindriver.switchTo().frame("applicationContent");
			manageUser.searchEmail.sendKeys("admin123@paymax.com");
			manageUser.search.click();
			test = extent.createTest("TC-8-Search Manage Users")
					.pass(MarkupHelper.createLabel("Manage User Screen has been Searched.", ExtentColor.GREEN));
			String screenShotPath_ = capture(admindriver, "Search Manage Users");
			test.addScreenCaptureFromPath(screenShotPath_);
		} catch (Exception e) {
			System.out.println(e);
			test = extent.createTest("TC-8-Search Manage Users")
					.fail(MarkupHelper.createLabel("Manage User Screen has not been Searched.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void deactivateUser() throws Throwable {
		try {
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			admindriver.switchTo().frame("applicationContent");
			manageUser.clickDeactiviate.click();
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			manageUser.clickYesDeactiviate.click();
			test = extent.createTest("TC-9-Deactivate Users")
					.pass(MarkupHelper.createLabel("User has been deactivated.", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			test = extent.createTest("TC-9-Deactivate Users")
					.fail(MarkupHelper.createLabel("User has not been deactivated.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void activateUser() throws Throwable {
		try {
			Select status_ = new Select(admindriver.findElement(By.id("searchAccountForm:searchStatusField")));
			status_.selectByVisibleText("Inactive");
			manageUser.search.click();
			manageUser.clickActiviate.click();
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			manageUser.clickYesActiviate.click();
		} catch (Exception e) {

		}
	}

	public void editUser() throws Throwable {
		try {
			admindriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			admindriver.switchTo().frame("applicationContent");
			manageUser.clickEditUserButton.click();
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			manageUser.editUserFirstName.clear();
			manageUser.editUserFirstName.sendKeys("Testing");
			manageUser.clickUpdateUserBtm.click();
		} catch (Exception e) {

		}
	}
}
