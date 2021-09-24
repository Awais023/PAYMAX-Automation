package PAYMAX_Test;

import PAYMAX_PAGES.TC08_ReversalModule;
import cucumber.api.java.en.Then;

public class TC08_ReversalModuleSteps {

	TC08_ReversalModule reversal_ = new TC08_ReversalModule();
	
	@Then("^User clicks on Others tab and then \"(.*?)\" and then user clicks on Reversal Module tab and then \"(.*?)\"\\.$")
	public void user_clicks_on_Others_tab_and_then_and_then_user_clicks_on_Reversal_Module_tab_and_then(String arg1, String arg2) throws Throwable {
		reversal_.openOtherTab(arg1, arg2);
	}

	@Then("^User clicks on Add button and add file from machine location and clicks upload button\\.$")
	public void user_clicks_on_Add_button_and_add_file_from_machine_location_and_clicks_upload_button() throws Throwable {
		reversal_.uploadReversalFile();
	}

	@Then("^User navugates to View batch screen and view the status of file uploaded previously\\.$")
	public void user_navugates_to_View_batch_screen_and_view_the_status_of_file_uploaded_previously() throws Throwable {
		reversal_.checkReversalFileStatus();
	}

}
