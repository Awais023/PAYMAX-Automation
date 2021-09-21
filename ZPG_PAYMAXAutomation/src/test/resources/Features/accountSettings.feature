Feature: Merchant Portal Account Settings Functionality
	Verify that Merchant Account Settings functionalities are working as per requirement.

@changePassword
Scenario: Verify Merchant is able to change password.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Account Settings tab and then Change Password.
	Then User enter valid Old and New Password and click Change password button, New Password will be saved.
	
@saveIPNConfiguration
Scenario: Verify Merchant is able to save IPN Configuration.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Account Settings tab and then IPN Configuration.
	Then User enter valid URL Handler and select parameters from available parameters and click save button.
	
@generateAndViewHashKey
Scenario: Verify Merchant is able to change password.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Account Settings tab and then Generate Hash key.
	Then User clicks generate hash key button if already not generated otherwise generated hash key will be printed.
	
@downloadPublicKeyConfiguration
Scenario: Verify Merchant is able to change password.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Account Settings tab and then Public key Configuration.
	Then User clicks download public key tab and clicks download Public key button.
	
@uploadPublicKeyConfiguration
Scenario: Verify Merchant is able to change password.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Account Settings tab and then Public key Configuration.
	Then User clicks Upload public key tab and upload Public key from machine.