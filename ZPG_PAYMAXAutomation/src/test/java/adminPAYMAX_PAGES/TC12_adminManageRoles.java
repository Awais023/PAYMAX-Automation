package adminPAYMAX_PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC12_adminManageRoles extends TC10_adminLogin {
	
	TC12_adminManageRoles roles;
	
	@FindBy(how = How.ID, using = "form:MANAGEROLES")
	public WebElement manageRolesTab;
	
	@FindBy(how = How.ID, using = "searchAccountForm:ADDROLE")
	public WebElement addNewRole;

	@FindBy(how = How.ID, using = "addRoleForm:roleName")
	public WebElement roleName;

	@FindBy(how = How.ID, using = "addRoleForm:description")
	public WebElement roleDescription;
	
	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[2]/form/div[2]/div[1]/div/span/div/table/tbody/tr/td[1]/div/div/div[2]/div/div/table/tbody/tr[1]/td[1]")
	public WebElement selectAvailableActoins;

	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[2]/form/div[2]/div[1]/div/span/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/button")
	public WebElement moveAvailableAction;

	@FindBy(how = How.ID, using = "addRoleForm:j_id1487388245_58a7bc77")
	public WebElement saveRole;

	@FindBy(how = How.ID, using = "successMessages_body")
	public WebElement roleAddSuccessMsg;
	
	public void clickManageRole() throws Throwable {
		try {
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			roles = PageFactory.initElements(admindriver, TC12_adminManageRoles.class);
			roles.manageRolesTab.click();
			test = extent.createTest("TC-12-Open Manage Roles")
					.pass(MarkupHelper.createLabel("Manage Roles Screen has been opened.", ExtentColor.GREEN));
			String screenShotPath_ = capture(admindriver, "Manage Roles");
			test.addScreenCaptureFromPath(screenShotPath_);
		} catch (Exception e) {
			System.out.println(e);
			test = extent.createTest("TC-12-Open Manage Roles")
					.fail(MarkupHelper.createLabel("Manage Roles Screen has not been opened.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void addNewManageRole() throws Throwable {
		try {
			admindriver.switchTo().frame("applicationContent");
			roles.addNewRole.click();
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select status_ = new Select(admindriver.findElement(By.id("addRoleForm:roleCategory")));
			status_.selectByVisibleText("Merchant");
			status_.selectByVisibleText("Admin");
			roles.roleName.sendKeys("My New Role");
			roles.roleDescription.sendKeys("This is the Test Role");
			roles.selectAvailableActoins.click();
			roles.moveAvailableAction.click();
			roles.saveRole.click();
			WebDriverWait wait = new WebDriverWait(admindriver, 30);
			wait.until(ExpectedConditions.visibilityOf(roles.roleAddSuccessMsg));
			String successMsg = roles.roleAddSuccessMsg.getText();
			System.out.println(successMsg);
			test = extent.createTest("TC-7-Add Manage Role").pass(
					MarkupHelper.createLabel("Manage Role Screen Input fields has been entered", ExtentColor.GREEN));
			if (roles.roleAddSuccessMsg.isDisplayed()) {
				test.pass(MarkupHelper.createLabel("New Role has been added", ExtentColor.GREEN));
			} else {
				test.pass(MarkupHelper.createLabel("New Role has not been added", ExtentColor.RED));
			}
			String screenShotPath = capture(admindriver, "Manage Roles Success Screen");
			test.addScreenCaptureFromPath(screenShotPath);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			test = extent.createTest("TC-7-Add Manage Role")
					.fail(MarkupHelper.createLabel("New Role has not been added", ExtentColor.RED));
			extent.flush();
		}
	}
	

	
}
