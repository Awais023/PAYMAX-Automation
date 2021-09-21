package PAYMAX_Test;

import PAYMAX_PAGES.TC05_accountSettings;
import cucumber.api.java.en.Then;

public class TC05_accountSettingsSteps {

	TC05_accountSettings Accsetngs = new TC05_accountSettings();

	@Then("^User clicks on Account Settings tab and then Change Password\\.$")
	public void user_clicks_on_Account_Settings_tab_and_then_Change_Password() throws Throwable {
		Accsetngs.openChangePassword();
	}

	@Then("^User enter valid Old and New Password and click Change password button, New Password will be saved\\.$")
	public void user_enter_valid_Old_and_New_Password_and_click_Change_password_button_New_Password_will_be_saved()
			throws Throwable {
		Accsetngs.changeMerchantPassword();
	}

	@Then("^User clicks on Account Settings tab and then IPN Configuration\\.$")
	public void user_clicks_on_Account_Settings_tab_and_then_IPN_Configuration() throws Throwable {
		Accsetngs.openIPNConfig();
	}

	@Then("^User enter valid URL Handler and select parameters from available parameters and click save button\\.$")
	public void user_enter_valid_URL_Handler_and_select_parameters_from_available_parameters_and_click_save_button()
			throws Throwable {
		Accsetngs.saveIPNConfig();
	}

	@Then("^User clicks on Account Settings tab and then Generate Hash key\\.$")
	public void user_clicks_on_Account_Settings_tab_and_then_Generate_Hash_key() throws Throwable {
		Accsetngs.openGenerateHashKey();
	}

	@Then("^User clicks generate hash key button if already not generated otherwise generated hash key will be printed\\.$")
	public void user_clicks_generate_hash_key_button_if_already_not_generated_otherwise_generated_hash_key_will_be_printed() throws Throwable {
		Accsetngs.viewOrGenerateHashKey();
	}
	@Then("^User clicks on Account Settings tab and then Public key Configuration\\.$")
	public void user_clicks_on_Account_Settings_tab_and_then_Public_key_Configuration() throws Throwable {
		Accsetngs.openPublicKeyConfiguration();
	}

	@Then("^User clicks download public key tab and clicks download Public key button\\.$")
	public void user_clicks_download_public_key_tab_and_clicks_download_Public_key_button() throws Throwable {
		Accsetngs.downloadPublicKey();
	}

	@Then("^User clicks Upload public key tab and upload Public key from machine\\.$")
	public void user_clicks_Upload_public_key_tab_and_upload_Public_key_from_machine() throws Throwable {
		Accsetngs.uploadPublicKey();
	}
}
