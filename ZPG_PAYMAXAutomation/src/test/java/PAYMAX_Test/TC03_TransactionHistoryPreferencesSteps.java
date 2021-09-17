package PAYMAX_Test;

import PAYMAX_PAGES.TC03_TransactionHistoryPreferences;
import cucumber.api.java.en.Then;

public class TC03_TransactionHistoryPreferencesSteps {

	TC03_TransactionHistoryPreferences TrxPrefer = new TC03_TransactionHistoryPreferences();
	
	@Then("^User clicks on Configuration tab and then Transaction History Preferences Screen\\.$")
	public void user_clicks_on_Configuration_tab_and_then_Transaction_History_Preferences_Screen() throws Throwable {
		TrxPrefer.openTransactionHistoryPreferencesScreen();
	}
	

	@Then("^User has updated the Transaction History Preferences\\.$")
	public void user_has_updated_the_Transaction_History_Preferences() throws Throwable {
		TrxPrefer.updateTransactionHistoryPreferencesScreen();
	}
	
	@Then("^User has reset the Transaction History Preferences\\.$")
	public void user_has_reset_the_Transaction_History_Preferences() throws Throwable {
		TrxPrefer.resetTransactionHistoryPreferencesScreen();
	}

}
