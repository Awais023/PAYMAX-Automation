Feature: Admin Portal Manage Roles Functionality 
	Verify that Admin Manage Role screen is working as per requirement.

@Addrole 
Scenario: Verify Admin is able to add new role 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Admin Portal must be opened. 
	Then Admin navigates to Manage role screen and clicks Add new role button. 
	Then Admin add new role field and click save button. New role must be added. 
	
@Searchrole 
Scenario: Verify Admin is able to add new role 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Admin Portal must be opened. 
	Then Admin navigates to Manage role screen and enter search parameters and search. 
	
	
@deactivate/Acticaterole 
Scenario: Verify Admin is able to add new role 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Admin Portal must be opened. 
	Then Admin navigates to Manage role screen and click deactivate button. role must be deactivated. 
	Then Admin click activate button. role must be activated. 
	
@editrole 
Scenario: Verify Admin is able to add new role 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Admin Portal must be opened. 
	Then Admin clicks on edit button and edit as per requirement and click save. role must be edited. 
	
	
	