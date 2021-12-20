package adminPAYMAX_Test;

import adminPAYMAX_PAGES.TC11_adminManageUsers;
import cucumber.api.java.en.Then;

public class TC11_adminManageUsersSteps {

	TC11_adminManageUsers manageUsers = new TC11_adminManageUsers();

	@Then("^Admin navigates to Manage user screen and clicks Add new user button\\.$")
	public void admin_navigates_to_Manage_user_screen_and_clicks_Add_new_user_button() throws Throwable {
		manageUsers.clickManageUser();
	}

	@Then("^Admin add new user field and click save button\\. New user must be added\\.$")
	public void admin_add_new_user_field_and_click_save_button_New_user_must_be_added() throws Throwable {
		manageUsers.addNewManageUser();
	}

	@Then("^Admin navigates to Manage user screen and enter search parameters and search\\.$")
	public void admin_navigates_to_Manage_user_screen_and_enter_search_parameters_and_search() throws Throwable {
		manageUsers.clickManageUser();
		manageUsers.searchManageUser();
	}

	@Then("^Admin navigates to Manage user screen and click deactivate button\\. User must be deactivated\\.$")
	public void admin_navigates_to_Manage_user_screen_and_click_deactivate_button_User_must_be_deactivated() throws Throwable {
		manageUsers.clickManageUser();
		manageUsers.deactivateUser();
	}

	@Then("^Admin click activate button\\. User must be activated\\.$")
	public void admin_click_activate_button_User_must_be_activated() throws Throwable {
		manageUsers.activateUser();
	}


}
