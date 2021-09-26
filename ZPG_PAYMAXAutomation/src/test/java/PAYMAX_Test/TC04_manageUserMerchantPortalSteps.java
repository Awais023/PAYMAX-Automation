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
	public void user_enters_some_random_data_on_field_and_click_on_rest_button_and_fields_have_been_reset()
			throws Throwable {
		manageUsers_.resetManageUsersScreen();
	}

	@Then("^User clicks on Add new User button and add new user screen will be opened\\.$")
	public void user_clicks_on_Add_new_User_button_and_add_new_user_screen_will_be_opened() throws Throwable {
		manageUsers_.openAddManageUsersScreen();
	}

	@Then("^User enters Users data and click save button and new user has been added\\.$")
	public void user_enters_Users_data_and_click_save_button_and_new_user_has_been_added() throws Throwable {
		manageUsers_.addManageUsersScreen();
	}
}
