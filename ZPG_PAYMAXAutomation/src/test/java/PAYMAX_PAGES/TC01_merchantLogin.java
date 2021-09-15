package PAYMAX_PAGES;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	
	

	public void launchBrowser() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/awais.sultan/git/PAYMAX/ZPG_PAYMAXAutomation/googleChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			login = PageFactory.initElements(driver, TC01_merchantLogin.class);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void launchZPGMerchantPortal() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://172.26.58.54:9081/paymax-merchant/faces/pg/site/Login.jsf");
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void merchantCredentials() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			login.merchantEmail.sendKeys("mfarhan9@paymax.com");
			login.merchantPassword.sendKeys("Pakistan#000");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void merchantLogin() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			login.merchantLoginBtn.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("applicationContent");
			String welcome =  login.merchantPortalWelcomeMsg.getText();
			System.out.print(welcome);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
