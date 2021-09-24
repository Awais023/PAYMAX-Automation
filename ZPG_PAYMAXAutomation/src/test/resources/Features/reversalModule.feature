Feature: Merchant Portal Reversal Module Functionality 
	Verify that Merchant Reversal Module functionalities are working as per requirement.

@uploadBulkReversalFile
Scenario Outline:
Verify Merchant is able to search Settlement Transaction History. 
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened. 
	Then PAYMAX Merchant enters credentials of username and password as Merchant 
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened. 
	Then User clicks on Others tab and then "<OtherScreen>" and then user clicks on Reversal Module tab and then "<ReversalModule>". 
	Then User clicks on Add button and add file from machine location and clicks upload button.
	Then User navugates to View batch screen and view the status of file uploaded previously. 
	Examples: 
		| OtherScreen |ReversalModule|
		| Reversal Module | Reversal Bulk Upload|
		