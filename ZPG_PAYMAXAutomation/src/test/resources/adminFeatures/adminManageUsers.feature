Feature: Admin Portal Manage Users Functionality 
	Verify that Admin Manage User screen is working as per requirement.

@AddUser 
Scenario: Verify Admin is able to add new user 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Admin Portal must be opened. 
	Then Admin navigates to Manage user screen and clicks Add new user button. 
	Then Admin add new user field and click save button. New user must be added. 
	
@SearchUser 
Scenario: Verify Admin is able to add new user 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Admin Portal must be opened. 
	Then Admin navigates to Manage user screen and enter search parameters and search. 
	
	
@deactivate/ActicateUser 
Scenario: Verify Admin is able to add new user 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Admin Portal must be opened. 
	Then Admin navigates to Manage user screen and click deactivate button. User must be deactivated. 
	Then Admin click activate button. User must be activated. 
	
@editUser 
Scenario: Verify Admin is able to add new user 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Admin Portal must be opened. 
	Then Admin clicks on edit button and edit as per requirement and click save. User must be edited. 
	
	
	