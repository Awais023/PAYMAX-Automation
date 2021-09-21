package PAYMAX_Test;

import PAYMAX_PAGES.TC06_failedTransactionReport;
import cucumber.api.java.en.Then;

public class TC06_failedTransactionReportSteps {

	TC06_failedTransactionReport failTraxReport = new TC06_failedTransactionReport();
	
	@Then("^User clicks on Account Settings tab and then Failed Transaction Report Screen\\.$")
	public void user_clicks_on_Account_Settings_tab_and_then_Failed_Transaction_Report_Screen() throws Throwable {
		failTraxReport.openFailedTransactionReport();
	}

	@Then("^User enter valid data and search User on Failed Transaction Report screen\\.$")
	public void user_enter_valid_data_and_search_User_on_Failed_Transaction_Report_screen() throws Throwable {
		failTraxReport.searchFailedTransactionReport();
	}
	
	@Then("^User enter random data and clicks reset on Failed Transaction Report screen\\.$")
	public void user_enter_random_data_and_clicks_reset_on_Failed_Transaction_Report_screen() throws Throwable {
		failTraxReport.resetFailedTransactionReport();
	}

	@Then("^User clicks export on Failed Transaction Report screen\\.$")
	public void user_clicks_export_on_Failed_Transaction_Report_screen() throws Throwable {
		failTraxReport.exportFailedTransactionReport();
	}

}
