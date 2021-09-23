package PAYMAX_Test;

import PAYMAX_PAGES.TC07_SettlementModule;
import cucumber.api.java.en.Then;

public class TC07_settlementModuleSteps {

	TC07_SettlementModule Settle_Module = new TC07_SettlementModule();

	@Then("^User clicks on Settlement Module tab and then \"(.*?)\"\\.$")
	public void user_clicks_on_Settlement_Module_tab_and_then(String arg1) throws Throwable {
		Settle_Module.openSettlementTransactionHistory(arg1);
	}

	@Then("^User enter valid data and search Transaction on Settlement Transaction History screen\\.$")
	public void user_enter_valid_data_and_search_Transaction_on_Settlement_Transaction_History_screen()
			throws Throwable {
		Settle_Module.searchSettlementTransactionHistory();
	}

	@Then("^User enter dummy data and reset Settlement Transaction History screen\\.$")
	public void user_enter_dummy_data_and_reset_Settlement_Transaction_History_screen() throws Throwable {
		Settle_Module.resetSettlementTransactionHistory();
	}

	@Then("^User enter clicks export button and export transaction settlement file\\.$")
	public void user_enter_clicks_export_button_and_export_transaction_settlement_file() throws Throwable {
		Settle_Module.exportSettlementTransactionHistory();
	}

	@Then("^User enter clicks transfer Now Button\\.$")
	public void user_enter_clicks_transfer_Now_Button() throws Throwable {
		Settle_Module.transferNow();
	}

	@Then("^User enter clicks Save Button\\.$")
	public void user_enter_clicks_Save_Button() throws Throwable {
		Settle_Module.saveMiniIbftLimit();
	}

	@Then("^User enter clicks export button and export Settlement Transaction Report\\.$")
	public void user_enter_clicks_export_button_and_export_Settlement_Transaction_Report() throws Throwable {
		Settle_Module.exportSettlementReports();
	}

	@Then("^User clicks reset button after entering some dummy data\\. Screen should be reset\\.$")
	public void user_clicks_reset_button_after_entering_some_dummy_data_Screen_should_be_reset() throws Throwable {
		Settle_Module.resetSettlementReportScreen();
	}

}
