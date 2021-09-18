package PAYMAX_PAGES;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TC01_merchantLogin {
	public static WebDriver driver;
	TC01_merchantLogin login;

	@FindBy(how = How.ID, using = "loginForm:j_username")
	public WebElement merchantEmail;

	@FindBy(how = How.ID, using = "loginForm:j_password")
	public WebElement merchantPassword;

	@FindBy(how = How.ID, using = "loginForm:j_id793557914_2f4cba79")
	public WebElement merchantLoginBtn;

	@FindBy(how = How.ID, using = "screenTitle")
	public WebElement merchantPortalWelcomeMsg;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest test;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Properties property;
	public static String configPath = "Configuration/configSettings.properties";

	public static void initializeProperties() {
		property = new Properties();
		try {
			InputStream input = new FileInputStream(configPath);
			property.load(input);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setExtent() throws Throwable {
		try {
			extent = new ExtentReports();
			spark = new ExtentSparkReporter(property.getProperty("extentReportPath"));
			spark.config().setEncoding("utf-8");
			spark.config().setDocumentTitle("Automation Report");
			spark.config().setReportName("Automation Test Resuts");
			spark.config().setTheme(Theme.STANDARD);
			extent.attachReporter(spark);
		} catch (Exception e) {
			System.out.println("EXTENT REPORTS HAS NOT BEEN INITIATED!.");
		}
	}

	public void launchBrowser() throws Throwable {
		try {
			String filename = property.getProperty("driverName");
			String folderName_ = "googleChromeDriver";
			String directory = System.getProperty("user.dir");
			String path = "";
			path = directory + File.separator + folderName_ + File.separator + filename;
			System.setProperty(property.getProperty("browserPath"), path);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			login = PageFactory.initElements(driver, TC01_merchantLogin.class);
			test = extent.createTest("TC-1-Launch Google Chrome Browser")
					.pass(MarkupHelper.createLabel("Google Chrome Driver has been Launching.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Google Chromer Driver has been launched Successfully.",
					ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-1-Launch Google Chrome Browser").fail(MarkupHelper
					.createLabel("Google Chrome Driver has not been Launched Successfuly!.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void launchZPGMerchantPortal() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(property.getProperty("AppURL"));
			driver.manage().window().maximize();
			test = extent.createTest("TC-2-Launch PAYMAX Merchant Portal ")
					.pass(MarkupHelper.createLabel("PAYMAX Merchant Portal has been Launching.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("PAYMAX Merchant Portal has been launched Successfully.",
					ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-2-Launch PAYMAX Merchant Portal").fail(MarkupHelper
					.createLabel("PAYMAX Merchant Portal has not been launched Successfully.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void merchantCredentials() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			login.merchantEmail.sendKeys(property.getProperty("merchantUsername"));
			login.merchantPassword.sendKeys(property.getProperty("password"));
			test = extent.createTest("TC-3-Enter Merchant Credentials").pass(MarkupHelper.createLabel(
					"PAYMAX Merchant has entered its credentials Username and Password.", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-3-Enter Merchant Credentials").fail(MarkupHelper.createLabel(
					"Error Occurs while entering PAYMAX Merchant credentials Username and Password.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void merchantLogin() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			login.merchantLoginBtn.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			String welcome = login.merchantPortalWelcomeMsg.getText();
			System.out.print(welcome);
			test = extent.createTest("TC-4-Merchant Login")
					.pass(MarkupHelper.createLabel("Merchant has been successfully logged in.", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel(welcome, ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-4-Merchant Login")
					.fail(MarkupHelper.createLabel("Merchant has not been successfully logged in.", ExtentColor.RED));
			extent.flush();
		}
	}

}
