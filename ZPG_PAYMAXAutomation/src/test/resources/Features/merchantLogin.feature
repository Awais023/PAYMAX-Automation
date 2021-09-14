Feature: Merchant Portal Login Functionality
	Verify that Merchant is able to logged in  Merchant Portal.

@MerchantLogin
Scenario: Verify Merchant is able to login
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.