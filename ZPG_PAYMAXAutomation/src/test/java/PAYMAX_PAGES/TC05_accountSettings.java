package PAYMAX_PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC05_accountSettings extends TC01_merchantLogin {

	TC05_accountSettings accSettngs_;

	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[1]/div[1]/div/div/form/table/tbody/tr/td[3]/div/div[1]/table/tbody/tr/td[2]")
	public WebElement clickAccountSettings;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba14106\"]/span/a")
	public WebElement clickChangePassword;

	@FindBy(how = How.ID, using = "changePasswordFormS:oldPassword")
	public WebElement currentPwd;

	@FindBy(how = How.ID, using = "changePasswordFormS:newPassword")
	public WebElement newPwd;

	@FindBy(how = How.ID, using = "changePasswordFormS:confirmNewPassword")
	public WebElement confirmPwd;

	@FindBy(how = How.ID, using = "changePasswordFormS:j_id644995288_2671da91")
	public WebElement changePwd;

	@FindBy(how = How.ID, using = "changePasswordFormS:successMessages_body")
	public WebElement successMsgPwdChange;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba142ef\"]/span/a")
	public WebElement clickIPNConfig_;

	@FindBy(how = How.ID, using = "ipnAttributesForm:url")
	public WebElement ipnURL;

	@FindBy(how = How.ID, using = "ipnAttributesForm:ipnAttrItem2")
	public WebElement selectIPNParameter;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"ipnAttributesForm:ipnAttr\"]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/button")
	public WebElement moveIPNPaarmeter;

	@FindBy(how = How.ID, using = "ipnAttributesForm:j_id1451150077_567ecb52")
	public WebElement saveIPN;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"ipnAttributesForm:successMessages_body\"]/div")
	public WebElement successMsgSaveIPN;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba142c8\"]/span/a")
	public WebElement openGenerateHashKey;

	@FindBy(how = How.ID, using = "generateHashForm:j_id24295431_172b9ac")
	public WebElement hashKey;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba1429a\"]/span/a")
	public WebElement openPublicKeyScreen;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"opsPublicKey:header:inactive\"]/span")
	public WebElement openDownloadPublicKeyScreen;

	@FindBy(how = How.ID, using = "buttonForm:j_id1902424077_7164b26e")
	public WebElement downloadPublicKey;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"pubKeyUpload\"]/div[1]/span[1]/span[1]/span/span/input")
	public WebElement uploadPublicKeyFile;
	
	@FindBy(how = How.XPATH, xpath = "//*[@id=\"pubKeyUpload\"]/div[1]/span[1]/span[2]/span")
	public WebElement uploadPublicKey;

	public void openChangePassword() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			accSettngs_ = PageFactory.initElements(driver, TC05_accountSettings.class);
			driver.switchTo().defaultContent();
			accSettngs_.clickAccountSettings.click();
			accSettngs_.clickChangePassword.click();
			test = extent.createTest("TC-18-Open Change Password Screen ")
					.pass(MarkupHelper.createLabel("Change Password has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Change Password Screen has been Opened", ExtentColor.GREEN));
			String screenShotPath__ = capture(driver, "Open Change Password");
			test.addScreenCaptureFromPath(screenShotPath__);
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-18-Open Change Password Screen ")
					.fail(MarkupHelper.createLabel("Change Password Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}

	public void changeMerchantPassword() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			accSettngs_ = PageFactory.initElements(driver, TC05_accountSettings.class);
			driver.switchTo().frame("applicationContent");
			accSettngs_.currentPwd.sendKeys(property.getProperty("password"));
			accSettngs_.newPwd.sendKeys(property.getProperty("newPassword"));
			accSettngs_.confirmPwd.sendKeys(property.getProperty("confirmPassword"));
			accSettngs_.changePwd.click();
			if (accSettngs_.successMsgPwdChange.isDisplayed()) {
				test = extent.createTest("TC-19-Change Merchant Password")
						.pass(MarkupHelper.createLabel("Merchant password has been changing.", ExtentColor.GREEN));
				test.pass(MarkupHelper.createLabel("Merchant password has been changed", ExtentColor.GREEN));
				String screenShotPath__ = capture(driver, "Changed Password");
				test.addScreenCaptureFromPath(screenShotPath__);
				extent.flush();
			} else {
				extent.createTest("TC-19-Change Merchant Password")
						.fail(MarkupHelper.createLabel("Merchant password has not been changing.", ExtentColor.RED));
				extent.flush();
			}
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-19-Change Merchant Password")
					.fail(MarkupHelper.createLabel("Merchant password has not been changing.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void openIPNConfig() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			accSettngs_ = PageFactory.initElements(driver, TC05_accountSettings.class);
			driver.switchTo().defaultContent();
			accSettngs_.clickAccountSettings.click();
			accSettngs_.clickIPNConfig_.click();
			test = extent.createTest("TC-20-Open IPN Configuration Screen ")
					.pass(MarkupHelper.createLabel("IPN Configuration has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("IPN Configuration Screen has been Opened", ExtentColor.GREEN));
			String screenShotPath__ = capture(driver, "Open IPN Config");
			test.addScreenCaptureFromPath(screenShotPath__);
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-20-Open IPN Configuration Screen ")
					.fail(MarkupHelper.createLabel("IPN Configuration Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}

	public void saveIPNConfig() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			accSettngs_ = PageFactory.initElements(driver, TC05_accountSettings.class);
			driver.switchTo().frame("applicationContent");
			accSettngs_.ipnURL.clear();
			accSettngs_.ipnURL.sendKeys(property.getProperty("IPN_URL"));
			accSettngs_.selectIPNParameter.click();
			accSettngs_.moveIPNPaarmeter.click();
			accSettngs_.saveIPN.click();
			if (accSettngs_.successMsgSaveIPN.isDisplayed()) {
				test = extent.createTest("TC-21-Save IPN Configurations ")
						.pass(MarkupHelper.createLabel("IPN Configurations has been saving.", ExtentColor.GREEN));
				test.pass(MarkupHelper.createLabel("IPN Configurations has been saved", ExtentColor.GREEN));
				String screenShotPath__ = capture(driver, "save IPN");
				test.addScreenCaptureFromPath(screenShotPath__);
				extent.flush();
			} else {
				extent.createTest("TC-21-Save IPN Configurations ")
						.fail(MarkupHelper.createLabel("IPN Configurations has not been Saved", ExtentColor.RED));
				extent.flush();
			}
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-21-Save IPN Configurations ")
					.fail(MarkupHelper.createLabel("IPN Configurations has not been Saved", ExtentColor.RED));
			extent.flush();
		}
	}

	public void openGenerateHashKey() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			accSettngs_ = PageFactory.initElements(driver, TC05_accountSettings.class);
			driver.switchTo().defaultContent();
			accSettngs_.clickAccountSettings.click();
			accSettngs_.openGenerateHashKey.click();
			test = extent.createTest("TC-22-Open Generate Hash Key Screen ")
					.pass(MarkupHelper.createLabel("Generate Hash Key has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Generate Hash Key Screen has been Opened", ExtentColor.GREEN));
			String screenShotPath__ = capture(driver, "Open Generate Hash key");
			test.addScreenCaptureFromPath(screenShotPath__);
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-22-Open Generate Hash Key Screen ")
					.fail(MarkupHelper.createLabel("Generate Hash Key Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}

	public void viewOrGenerateHashKey() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			accSettngs_ = PageFactory.initElements(driver, TC05_accountSettings.class);
			driver.switchTo().frame("applicationContent");
			if (accSettngs_.hashKey.getAttribute("value") != null) {
				String hashKey_ = accSettngs_.hashKey.getAttribute("value");
				test = extent.createTest("TC-23-View Hash Key")
						.pass(MarkupHelper.createLabel("Hash Key has been viewing.", ExtentColor.GREEN));
				test.pass(MarkupHelper.createLabel("Hash Key Screen has been viewed i.e  "+hashKey_,ExtentColor.GREEN));
				String screenShotPath__ = capture(driver, "Hash key generated");
				test.addScreenCaptureFromPath(screenShotPath__);
				extent.flush();

			} else {
				test = extent.createTest("TC-23-Generate Hash Key")
						.pass(MarkupHelper.createLabel("Hash Key has been generating.", ExtentColor.GREEN));
				test.pass(MarkupHelper.createLabel("Hash Key Screen has been generated", ExtentColor.GREEN));
				extent.flush();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void openPublicKeyConfiguration() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			accSettngs_ = PageFactory.initElements(driver, TC05_accountSettings.class);
			driver.switchTo().defaultContent();
			accSettngs_.clickAccountSettings.click();
			accSettngs_.openPublicKeyScreen.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			test = extent.createTest("TC-24-Open Public Key Configuration Screen ")
					.pass(MarkupHelper.createLabel("Public Key Configuration screen has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Public Key Configuration Screen has been Opened", ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-24-Open Generate Hash Key Screen ")
					.fail(MarkupHelper.createLabel("Public Key Configuration Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void downloadPublicKey() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			accSettngs_ = PageFactory.initElements(driver, TC05_accountSettings.class);
			driver.switchTo().frame("applicationContent");
			accSettngs_.openDownloadPublicKeyScreen.click();
			accSettngs_.downloadPublicKey.click();
			test = extent.createTest("TC-25-Download Public Key ")
					.pass(MarkupHelper.createLabel("Public Key has been downloading.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Public Key Configuration Screen has been Downloaded", ExtentColor.GREEN));
			String screenShotPath__ = capture(driver, "Downloaded public key");
			test.addScreenCaptureFromPath(screenShotPath__);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-25-Download Public Key ")
					.fail(MarkupHelper.createLabel("Public Key Configuration Screen has not been Downloaded", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void uploadPublicKey() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			accSettngs_ = PageFactory.initElements(driver, TC05_accountSettings.class);
			driver.switchTo().frame("applicationContent");
			accSettngs_.uploadPublicKeyFile.sendKeys(property.getProperty("publicKey_Location"));
			accSettngs_.uploadPublicKey.click();
			test = extent.createTest("TC-26-Upload Public Key ")
					.pass(MarkupHelper.createLabel("Public Key has been uploading.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Public Key Configuration Screen has been Uploaded", ExtentColor.GREEN));
			String screenShotPath__ = capture(driver, "Uploaded Public Key");
			test.addScreenCaptureFromPath(screenShotPath__);
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-26-Upload Public Key ")
					.fail(MarkupHelper.createLabel("Public Key Configuration Screen has not been Uploaded", ExtentColor.RED));
			extent.flush();
		}
	}
}
