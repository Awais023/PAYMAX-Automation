Feature: Fund Transfer Functionality 
	Verify that Merchant Fund Transfer functionality is working as per requiremnet.

@openFundTransferScreen 
Scenario: Verify Merchant is able to open Fund Transfer Screen 
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened. 
	Then PAYMAX Merchant enters credentials of username and password as Merchant 
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened. 
	Then User clicks on others tab and then Merchant Fund Transfer. 
	Then User login to admin Portal and navigate to resend messages screen and take OTP. 
	Then User paste OTP on fund transfer and login. 
	
@exportFundTransferFile
Scenario: Verify Merchant is able to open Fund Transfer Screen 
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened. 
	Then PAYMAX Merchant enters credentials of username and password as Merchant 
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened. 
	Then User clicks on others tab and then Merchant Fund Transfer. 
	Then User login to admin Portal and navigate to resend messages screen and take OTP. 
	Then User paste OTP on fund transfer and login. 
	Then User clicks export button and fund transfer file be exported.
	
@viewScheduledTransfers
Scenario: Verify Merchant is able to open Fund Transfer Screen 
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened. 
	Then PAYMAX Merchant enters credentials of username and password as Merchant 
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened. 
	Then User clicks on others tab and then Merchant Fund Transfer. 
	Then User login to admin Portal and navigate to resend messages screen and take OTP. 
	Then User paste OTP on fund transfer and login.
	Then User clicks on view scheduled transfer button.
		
@FundTransfer 
Scenario: Verify Merchant is able to open Fund Transfer Screen 
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened. 
	Then PAYMAX Merchant enters credentials of username and password as Merchant 
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened. 
	Then User clicks on others tab and then Merchant Fund Transfer. 
	Then User login to admin Portal and navigate to resend messages screen and take OTP. 
	Then User paste OTP on fund transfer and login.
	Then User clicks on manage beneficiary details and then clicks fund transfer icon.
	Then user enters fund details on fund transfer screen and transfer amount.
	
@setStandingOrder
Scenario: Verify Merchant is able to open Fund Transfer Screen 
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened. 
	Then PAYMAX Merchant enters credentials of username and password as Merchant 
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened. 
	Then User clicks on others tab and then Merchant Fund Transfer. 
	Then User login to admin Portal and navigate to resend messages screen and take OTP. 
	Then User paste OTP on fund transfer and login.
	Then User clicks on manage beneficiary details and then clicks set Standing order icon.
	Then user enters set standing order details and clicks confirm button.
	
@addBeneficiary
Scenario: Verify Merchant is able to open Fund Transfer Screen 
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened. 
	Then PAYMAX Merchant enters credentials of username and password as Merchant 
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened. 
	Then User clicks on others tab and then Merchant Fund Transfer. 
	Then User login to admin Portal and navigate to resend messages screen and take OTP. 
	Then User paste OTP on fund transfer and login.
	Then User clicks on manage beneficiary details and then clicks add beneficiary button.
	Then user enters beneficiary details and clicks next button button.
	Then user login to admin portal and take SMS and email OTPs and clicks ADD beneficiary button.
	
@deleteBeneficiary
Scenario: Verify Merchant is able to open Fund Transfer Screen 
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened. 
	Then PAYMAX Merchant enters credentials of username and password as Merchant 
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened. 
	Then User clicks on others tab and then Merchant Fund Transfer. 
	Then User login to admin Portal and navigate to resend messages screen and take OTP. 
	Then User paste OTP on fund transfer and login.
	Then User clicks on manage beneficiary details and then clicks delete icon , beneficiary should be deleted.