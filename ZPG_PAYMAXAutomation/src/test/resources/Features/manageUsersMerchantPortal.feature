Feature: Merchant Portal Manage Users Functionality
	Verify that Merchant Manage Users Screen functionalities are working as per requirement.

@seacrhMerchantUser
Scenario: Verify Merchant is able to login
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Configuration tab and then Manage Users Screen.
	Then User enter valid data and search User on manage users screen.
	
@addMerchantUser
Scenario: Verify Merchant is able to login
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Configuration tab and then Manage Users Screen.
	Then User clicks on Add new User button and add new user screen will be opened.
	Then User enters Users data and click save button and new user has been added.

@resetMerchantUser
Scenario: Verify Merchant is able to login
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Configuration tab and then Manage Users Screen.
	Then User enters some random data on field and click on rest button and fields have been reset.
	