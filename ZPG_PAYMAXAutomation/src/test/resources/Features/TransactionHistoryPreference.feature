Feature: Transaction History Preferences Functionality
	Verify that Merchant Transaction History Preferences is working as per requiremnet.

@UpdateTransactionsHistoryPreferences
Scenario: Verify Merchant is able to login
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Configuration tab and then Transaction History Preferences Screen.
	Then User has updated the Transaction History Preferences.
	
@resetTransactionsHistoryPreferences
Scenario: Verify Merchant is able to login
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Configuration tab and then Transaction History Preferences Screen.
	Then User has reset the Transaction History Preferences.