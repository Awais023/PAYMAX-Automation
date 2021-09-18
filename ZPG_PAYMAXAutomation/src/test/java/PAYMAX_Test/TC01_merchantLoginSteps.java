package PAYMAX_Test;

import PAYMAX_PAGES.TC01_merchantLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC01_merchantLoginSteps {
	
	TC01_merchantLogin login_ = new TC01_merchantLogin();

	@Given("^Chrome Browser has been launched for PAYMAX\\.$")
	public void chrome_Browser_has_been_launched_for_PAYMAX() throws Throwable {
		TC01_merchantLogin.initializeProperties();
		login_.setExtent();
		login_.launchBrowser();	
	}

	@Then("^PAYMAX Merchant Portal has been opened\\.$")
	public void paymax_Merchant_Portal_has_been_opened() throws Throwable {
		login_.launchZPGMerchantPortal();
	}

	@Then("^PAYMAX Merchant enters credentials of username and password as Merchant$")
	public void paymax_Merchant_enters_credentials_of_username_and_password_as_Merchant() throws Throwable {
		login_.merchantCredentials();
	}

	@Then("^PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened\\.$")
	public void paymax_Merchant_clicks_on_Go_Button_Merchant_Portal_must_be_opened() throws Throwable {
		login_.merchantLogin();
	}
}
