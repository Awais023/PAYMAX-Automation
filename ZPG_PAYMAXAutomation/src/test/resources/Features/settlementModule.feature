Feature: Merchant Portal Settlement Module Functionality
	Verify that Merchant Settlement Module functionalities are working as per requirement.

@seacrhSettlementTransactionHistory
Scenario Outline: Verify Merchant is able to search Settlement Transaction History.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Settlement Module tab and then "<SettlementModuleScreen>".
	Then User enter valid data and search Transaction on Settlement Transaction History screen.
	 Examples:
      | SettlementModuleScreen |
      | Settlement Transaction History |
   	
@resetSettlementTransactionHistory
Scenario Outline: Verify Merchant is able to search Settlement Transaction History.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Settlement Module tab and then "<SettlementModuleScreen>".
	Then User enter dummy data and reset Settlement Transaction History screen.
	 Examples:
      | SettlementModuleScreen |
      | Settlement Transaction History |
      
@exportSettlementTransactionHistory
Scenario Outline: Verify Merchant is able to search Settlement Transaction History.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Settlement Module tab and then "<SettlementModuleScreen>".
	Then User enter clicks export button and export transaction settlement file.
	 Examples:
      | SettlementModuleScreen |
      | Settlement Transaction History |
 
@transferNow
Scenario Outline: Verify Merchant is able to search Settlement Transaction History.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Settlement Module tab and then "<SettlementModuleScreen>".
	Then User enter clicks transfer Now Button.
	 Examples:
      | SettlementModuleScreen |
      | Settlement Settings |
      
@saveSettlementSettings
Scenario Outline: Verify Merchant is able to search Settlement Transaction History.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Settlement Module tab and then "<SettlementModuleScreen>".
	Then User enter clicks Save Button.
	Examples:
      | SettlementModuleScreen |
      | Settlement Settings |
	
	
@exportSettlementTransactionHistoryReport
Scenario Outline: Verify Merchant is able to search Settlement Transaction History.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Settlement Module tab and then "<SettlementModuleScreen>".
	Then User enter clicks export button and export Settlement Transaction Report.
	Examples:
      | SettlementModuleScreen |
      | Settlement Report |
      
     
@resetSettlementReport
Scenario Outline: Verify Merchant is able to search Settlement Transaction History.
	Given Chrome Browser has been launched for PAYMAX. 
	Then PAYMAX Merchant Portal has been opened.
	Then PAYMAX Merchant enters credentials of username and password as Merchant
	Then PAYMAX Merchant clicks on Go Button, Merchant Portal must be opened.
	Then User clicks on Settlement Module tab and then "<SettlementModuleScreen>".
	Then User clicks reset button after entering some dummy data. Screen should be reset.
	Examples:
      | SettlementModuleScreen |
      | Settlement Report |