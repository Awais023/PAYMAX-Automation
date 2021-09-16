package PAYMAX_Test;

import PAYMAX_PAGES.TC02_TransactionHistory;
import cucumber.api.java.en.Then;

public class TC02_TransactionHistorySteps {
	
	TC02_TransactionHistory trxsHistry = new TC02_TransactionHistory();
	
	@Then("^User clicks on Transaction History tab\\.$")
	public void user_clicks_on_Transaction_History_tab() throws Throwable {
		trxsHistry.openTransactionHistoryScreen();
	}

	@Then("^User clicks on Search Button and view the Grid of Transactions\\.$")
	public void user_clicks_on_Search_Button_and_view_the_Grid_of_Transactions() throws Throwable {
		trxsHistry.searchTransactionHistory();
	}
	
	@Then("^User enter some data in fields and clicks on reset Button\\.$")
	public void user_enter_some_data_in_fields_and_clicks_on_reset_Button() throws Throwable {
		trxsHistry.resetTransactionHistoryScreen();
	}
	@Then("^User clicks on export Button and export the file\\.$")
	public void user_clicks_on_export_Button_and_export_the_file() throws Throwable {
		trxsHistry.exportTransactionHistoryFile();
	}

}
