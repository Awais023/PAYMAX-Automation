package PAYMAX_Test;

import PAYMAX_PAGES.TC04_manageUserMerchantPortal;
import cucumber.api.java.en.Then;

public class TC04_manageUserMerchantPortalSteps {

	TC04_manageUserMerchantPortal manageUsers_ = new TC04_manageUserMerchantPortal();

	@Then("^User clicks on Configuration tab and then Manage Users Screen\\.$")
	public void user_clicks_on_Configuration_tab_and_then_Manage_Users_Screen() throws Throwable {
		manageUsers_.openManageUsersScreen();
	}

	@Then("^User enter valid data and search User on manage users screen\\.$")
	public void user_enter_valid_data_and_search_User_on_manage_users_screen() throws Throwable {
		manageUsers_.searchManageUsersScreen();
	}

	@Then("^User enters some random data on field and click on rest button and fields have been reset\\.$")
	public void user_enters_some_random_data_on_field_and_click_on_rest_button_and_fields_have_been_reset() throws Throwable {
		manageUsers_.resetManageUsersScreen();
	}
}
