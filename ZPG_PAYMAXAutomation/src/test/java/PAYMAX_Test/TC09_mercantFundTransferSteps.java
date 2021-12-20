package PAYMAX_Test;

import PAYMAX_PAGES.TC09_merchantFundTransfer;
import cucumber.api.java.en.Then;

public class TC09_mercantFundTransferSteps {

	TC09_merchantFundTransfer fundTransfer_ = new TC09_merchantFundTransfer();
	
	@Then("^User clicks on others tab and then Merchant Fund Transfer\\.$")
	public void user_clicks_on_others_tab_and_then_Merchant_Fund_Transfer() throws Throwable {
		fundTransfer_.openOtherTab();
	}

	@Then("^User login to admin Portal and navigate to resend messages screen and take OTP\\.$")
	public void user_login_to_admin_Portal_and_navigate_to_resend_messages_screen_and_take_OTP() throws Throwable {
		fundTransfer_.loginToAdminPortal();
		fundTransfer_.navigateToAdminResendMsgs();
	}

	@Then("^User paste OTP on fund transfer and login\\.$")
	public void user_paste_OTP_on_fund_transfer_and_login() throws Throwable {
		fundTransfer_.openMerchantFundTransferPortal();
	}

	@Then("^User clicks export button and fund transfer file be exported\\.$")
	public void user_clicks_export_button_and_fund_transfer_file_be_exported() throws Throwable {
		fundTransfer_.exportFundTransferFile();
	}
}
