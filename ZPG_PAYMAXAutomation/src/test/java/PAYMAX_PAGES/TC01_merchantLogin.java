package PAYMAX_PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TC01_merchantLogin {
	public static WebDriver driver;
	TC01_merchantLogin login;

	public void launchBrowser() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/awais.sultan/git/TPG/ZPG_PAYMAXAutomation/googleChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			login = PageFactory.initElements(driver, TC01_merchantLogin.class);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
