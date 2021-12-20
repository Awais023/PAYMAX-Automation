package PAYMAX_PAGES;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC09_merchantFundTransfer extends TC01_merchantLogin {

	public static WebDriver driver_;
	TC09_merchantFundTransfer fundTransfer;
	ArrayList<String> tabs;
	int OTP__;

	@FindBy(how = How.XPATH, xpath = "//*[@id=\"form:j_id476302318_ba14311_label\"]")
	public WebElement clickothersModule;

	@FindBy(how = How.ID, using = "form:PAYMENTTAB")
	public WebElement clickMercantFundTransfer;

	@FindBy(how = How.XPATH, xpath = "/html/body/div[3]/div[3]/div/div[2]/span[2]")
	public WebElement OTP;

	@FindBy(how = How.ID, using = "PaymentTab")
	public WebElement loginFundTransfer;
	
	@FindBy(how = How.ID, using = "searchTransferReport:j_id1336375024_4fa77702")
	public WebElement exportFundTransfer;

	public void openOtherTab() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			fundTransfer = PageFactory.initElements(driver, TC09_merchantFundTransfer.class);
			driver.switchTo().defaultContent();
			fundTransfer.clickothersModule.click();
			fundTransfer.clickMercantFundTransfer.click();
			String screenShotPath__ = capture(driver, "Fund Transfer Screen");
			test.addScreenCaptureFromPath(screenShotPath__);
			test = extent.createTest("TC-10-Merchant Fund Transfer Screen ").pass(
					MarkupHelper.createLabel("Merchant Fund Transfer Screen has been opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Merchant Fund Transfer Screen has been Opened", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-10-Merchant Fund Transfer Screen ").fail(
					MarkupHelper.createLabel("Merchant Fund Transfer Screen has not been Opened", ExtentColor.RED));
			extent.flush();
		}
	}

	public void loginToAdminPortal() throws Throwable {

		try {
			Thread.sleep(3000);
			System.setProperty(property.getProperty("browserPath"), "C:/Users/awais.sultan/git/PAYMAX/ZPG_PAYMAXAutomation/googleChromeDriver/chromedriver.exe");
			ChromeOptions options_ = new ChromeOptions();
			options_.addArguments("incognito");
			driver_ = new ChromeDriver(options_);
			driver_.get("http://192.168.154.188:9080/paymax-admin/faces/pg/crm/Login.jsf");
			driver_.manage().window().maximize();
			driver_.findElement(By.id("j_username")).sendKeys("superadmin@pg.systemsltd.pk");
			driver_.findElement(By.id("j_password")).sendKeys("system@1234");
			driver_.findElement(By.id("j_id891617949_35250373")).click();
			Thread.sleep(3000);
			test = extent.createTest("TC-10-Login to Admin Portal").pass(
					MarkupHelper.createLabel("Admin Portal has been loggin in.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Admin Portal has been logged in.", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-10-Login to Admin Portal").fail(
					MarkupHelper.createLabel("Admin Portal has not been logged in.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void navigateToAdminResendMsgs() throws Throwable {

		try {
			Thread.sleep(3000);
			driver_.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr/td[4]/div/div[1]/table/tbody/tr/td[2]")).click();
			Thread.sleep(3000);
			driver_.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr/td[4]/div/div[2]/div/div/div[5]/span")).click();
			Thread.sleep(3000);
			driver_.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr/td[4]/div/div[2]/div/div/div[5]/div[2]/div/div/div/span/a")).click();
			driver_.switchTo().frame("applicationContent");
			driver_.findElement(By.id("resendMessages:j_id1615040832_60439005")).click();
			driver_.findElement(By.xpath("/html/body/div/div[2]/div[4]/div/form/div/table/tbody[1]/tr[1]/td[8]/div/a[2]")).click();
			Thread.sleep(3000);
			String OTP_ = driver_.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/span[2]")).getText(); 
			OTP__ = Integer.parseInt(OTP_.replaceAll("\\D", ""));
			driver_.close();
			test = extent.createTest("TC-10-Resend Message screen and get OTP").pass(
					MarkupHelper.createLabel("Resend Messages screen is opening and copying OTP.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Resend Messages screen has been opened and OTP has been copied.", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-10-Resend Message screen and get OTP").fail(
					MarkupHelper.createLabel("Resend Messages screen has not been opened and OTP has not been copied.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void openMerchantFundTransferPortal() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String convertOTP = Integer.toString(OTP__);
			System.out.print(": "+convertOTP);
			driver.switchTo().frame("applicationContent");
			Thread.sleep(3000);
			driver.findElement(By.id("inputOtp")).sendKeys(convertOTP);
			Thread.sleep(3000);
			fundTransfer.loginFundTransfer.click();
			test = extent.createTest("TC-10-Open Merchant Fund Transfer Portal ").pass(
					MarkupHelper.createLabel("Merchant Fund Transfer Portal is opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Merchant Fund Transfer Portal has been opened.", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-10-Resend Message screen and get OTP").fail(
					MarkupHelper.createLabel("Merchant Fund Transfer Portal has not been opened.", ExtentColor.RED));
			extent.flush();
		}
	}
	
	public void exportFundTransferFile() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			fundTransfer.exportFundTransfer.click();
			test = extent.createTest("TC-10-Open Merchant Fund Transfer Portal ").pass(
					MarkupHelper.createLabel("Merchant Fund Transfer Portal is opening.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Merchant Fund Transfer Portal has been opened.", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-10-Resend Message screen and get OTP").fail(
					MarkupHelper.createLabel("Merchant Fund Transfer Portal has not been opened.", ExtentColor.RED));
			extent.flush();
		}
	}
}
