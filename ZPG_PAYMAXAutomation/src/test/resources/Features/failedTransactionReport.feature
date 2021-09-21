Feature: Merchant Portal Failed Transaction Report Functionality
	Verify that Merchant Failed Transaction Report Screen functionalities are working as per requirement.

@seacrhFailedTransaction
Scenario: Verify Merchant is able to search failed transaction report.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Account Settings tab and then Failed Transaction Report Screen.
	Then User enter valid data and search User on Failed Transaction Report screen.

	
@resetFailedTransaction
Scenario: Verify Merchant is able to search failed transaction report.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Account Settings tab and then Failed Transaction Report Screen.
	Then User enter random data and clicks reset on Failed Transaction Report screen.
	
@exportFailedTransactionReport
Scenario: Verify Merchant is able to search failed transaction report.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Account Settings tab and then Failed Transaction Report Screen.
	Then User clicks export on Failed Transaction Report screen.