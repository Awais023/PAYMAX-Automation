package adminPAYMAX_Test;

import adminPAYMAX_PAGES.TC10_adminLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC10_adminLoginSteps {

	TC10_adminLogin adminLogin = new TC10_adminLogin();

	@Given("^Google Chrome Browser has been launched for PAYMAX\\.$")
	public void google_Chrome_Browser_has_been_launched_for_PAYMAX() throws Throwable {
		TC10_adminLogin.initializeProperties_();
		adminLogin.setExtent();
		adminLogin.launchBrowser();
	}

	@Then("^The PAYMAX Admin Portal has been opened\\.$")
	public void the_PAYMAX_Admin_Portal_has_been_opened() throws Throwable {
		adminLogin.launchZPGAdminPortal();
	}

	@Then("^PAYMAX Admin enters credentials of username and password as Admin$")
	public void paymax_Admin_enters_credentials_of_username_and_password_as_Admin() throws Throwable {
		adminLogin.adminCredentials();
	}

	@Then("^PAYMAX Admin clicks on Go Button, Admin Portal must be opened\\.$")
	public void paymax_Admin_clicks_on_Go_Button_Admin_Portal_must_be_opened() throws Throwable {
		adminLogin.adminLogin();
	}
	
	@Then("^PAYMAX Admin clicks on Go Button, Invalid Credentials error must appears\\.$")
	public void paymax_Admin_clicks_on_Go_Button_Invalid_Credentials_error_must_appears() throws Throwable {
		adminLogin.invalidAdminLogin();
	}


}
