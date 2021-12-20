package adminPAYMAX_PAGES;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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


public class TC10_adminLogin {

	TC10_adminLogin login_;

	public static WebDriver admindriver;

	@FindBy(how = How.ID, using = "j_username")
	public WebElement adminEmail;

	@FindBy(how = How.ID, using = "j_password")
	public WebElement adminPassword;

	@FindBy(how = How.ID, using = "j_id891617949_35250373")
	public WebElement adminLogin;

	@FindBy(how = How.XPATH, xpath = "/html/body/div/div[1]/h3")
	public WebElement adminWelcomeMsg;

	@FindBy(how = How.ID, using = "errorMessages_body")
	public WebElement adminErrorMsg;

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static Properties property_;
	public static String configPath_ = "Configuration/configSettings.properties";

	public static void initializeProperties_() {
		property_ = new Properties();
		try {
			InputStream input = new FileInputStream(configPath_);
			property_.load(input);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setExtent() throws Throwable {
		try {
			extent = new ExtentReports();
			spark = new ExtentSparkReporter(property_.getProperty("extentReportPath"));
			spark.config().setEncoding("utf-8");
			spark.config().setDocumentTitle("Automation Report");
			spark.config().setReportName("Automation Test Resuts");
			spark.config().setTheme(Theme.STANDARD);
			extent.attachReporter(spark);
		} catch (Exception e) {
			System.out.println("EXTENT REPORTS HAS NOT BEEN INITIATED!.");
		}
	}

	public static String capture(WebDriver driver_, String screenShotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) admindriver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "/ErrorScreenshots/" + screenShotName + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return dest;
	}

	public void launchBrowser() throws Throwable {
		try {
			String filename = property_.getProperty("driverName");
			String folderName_ = "googleChromeDriver";
			String directory = System.getProperty("user.dir");
			String path = "";
			path = directory + File.separator + folderName_ + File.separator + filename;
			System.setProperty(property_.getProperty("browserPath"), path);
			admindriver = new ChromeDriver();
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			login_ = PageFactory.initElements(admindriver, TC10_adminLogin.class);
			test = extent.createTest("TC-1-Launch Google Chrome Browser")
					.pass(MarkupHelper.createLabel("Google Chrome Browser has been Launching...", ExtentColor.GREEN));
			test.pass(MarkupHelper.createLabel("Google Chromer Browser has been launched Successfully.",
					ExtentColor.GREEN));
			extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-1-Launch Google Chrome Browser").fail(MarkupHelper
					.createLabel("Google Chrome Browser has not been Launched Successfuly!.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void launchZPGAdminPortal() throws Throwable {

		try {
			admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			admindriver.get(property_.getProperty("adminPortalURL"));
			admindriver.manage().window().maximize();
			test = extent.createTest("TC-2-Launch PAYMAX Admin Portal ")
					.pass(MarkupHelper.createLabel("PAYMAX Admin Portal has been Launching...", ExtentColor.GREEN));
			test.pass(
					MarkupHelper.createLabel("PAYMAX Admin Portal has been launched Successfully.", ExtentColor.GREEN));
		} catch (Exception e) {
			System.out.println(e);
			extent.createTest("TC-2-Launch PAYMAX Admin Portal ").fail(MarkupHelper
					.createLabel("PAYMAX Admin Portal has not been launched Successfully.", ExtentColor.RED));
			extent.flush();
		}
	}

	public static boolean emailValidation(String email) {
		String emailRegex = "^(.+)@(.+)$";
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public void adminCredentials() throws Throwable {

		admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (emailValidation(property_.getProperty("adminUserName"))) {
			login_.adminEmail.sendKeys(property_.getProperty("adminUserName"));
			login_.adminPassword.sendKeys(property_.getProperty("adminPassword"));
			test = extent.createTest("TC-3-Enter Admin Credentials").pass(MarkupHelper.createLabel(
					"PAYMAX Admin has entered its valid credentials Username and Password.", ExtentColor.GREEN));
		} else {
			test = extent.createTest("TC-3-Enter Admin Credentials").fail(MarkupHelper.createLabel(
					"Error Occurs while entering PAYMAX Admin credentials Username and Password.", ExtentColor.RED));
			test.fail(MarkupHelper.createLabel("Email is not valid format.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void adminLogin() throws Throwable {
		try {
			if (emailValidation(property_.getProperty("adminUserName"))) {
				admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				login_.adminLogin.click();
				admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				admindriver.switchTo().frame("applicationContent");
				String screenShotPath = capture(admindriver, "Admin Login");
				String welcome = login_.adminWelcomeMsg.getText();
				System.out.print(welcome);
				test = extent.createTest("TC-4-Admin Login")
						.pass(MarkupHelper.createLabel("Admin has been successfully logged in.", ExtentColor.GREEN));
				test.pass(MarkupHelper.createLabel(welcome, ExtentColor.GREEN));
				test.addScreenCaptureFromPath(screenShotPath);
				extent.flush();
				admindriver.switchTo().defaultContent();
			} else {
				test = extent.createTest("TC-4-Admin Login")
						.fail(MarkupHelper.createLabel("Admin Email format is not correct.", ExtentColor.RED));
				extent.flush();
			}
		} catch (Exception e) {
			System.out.print(e);
			test = extent.createTest("TC-4-Admin Login")
					.fail(MarkupHelper.createLabel("Admin has not been successfully logged in.", ExtentColor.RED));
			extent.flush();
		}
	}

	public void invalidAdminLogin() throws Throwable {
		try {
			if (emailValidation(property_.getProperty("invalidUsername"))) {
				admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				login_.adminLogin.click();
				String error = login_.adminErrorMsg.getText();
				System.out.print(error);
				String screenShotPath = capture(admindriver, "Admin Login");
				test = extent.createTest("TC-5-Admin Login")
						.fail(MarkupHelper.createLabel("Admin has not been successfully logged in.", ExtentColor.RED));
				test.fail(MarkupHelper.createLabel(error, ExtentColor.RED));
				test.addScreenCaptureFromPath(screenShotPath);
				extent.flush();
			} else {
				test = extent.createTest("TC-5-Admin Login")
						.fail(MarkupHelper.createLabel("Admin Email format is not correct.", ExtentColor.RED));
				extent.flush();
			}
		} catch (Exception e) {
			System.out.print(e);
			test = extent.createTest("TC-5-Admin Login")
					.fail(MarkupHelper.createLabel("Admin has not been successfully logged in.", ExtentColor.RED));
			extent.flush();
		}
	}

}
