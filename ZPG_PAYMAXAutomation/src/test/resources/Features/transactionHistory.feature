Feature: Transaction History Functionality
	Verify that Merchant Transaction History is working as per requiremnet.

@searchTransactions
Scenario: Verify Merchant is able to login
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Transaction History tab.
	Then User clicks on Search Button and view the Grid of Transactions.
	
@resetTransactions
Scenario: Verify Merchant is able to login
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Transaction History tab.
	Then User enter some data in fields and clicks on reset Button.
	
@exportTransactionHistory
Scenario: Verify Merchant is able to login 
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Transaction History tab.
	Then User clicks on export Button and export the file.