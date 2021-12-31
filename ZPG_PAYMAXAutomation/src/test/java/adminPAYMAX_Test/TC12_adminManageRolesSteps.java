package adminPAYMAX_Test;

import adminPAYMAX_PAGES.TC12_adminManageRoles;
import cucumber.api.java.en.Then;

public class TC12_adminManageRolesSteps {
	
	TC12_adminManageRoles roles_ = new TC12_adminManageRoles();

	@Then("^Admin navigates to Manage role screen and clicks Add new role button\\.$")
	public void admin_navigates_to_Manage_role_screen_and_clicks_Add_new_role_button() throws Throwable {
		roles_.clickManageRole();
	}

	@Then("^Admin add new role field and click save button\\. New role must be added\\.$")
	public void admin_add_new_role_field_and_click_save_button_New_role_must_be_added() throws Throwable {
		roles_.addNewManageRole();
	}
}
