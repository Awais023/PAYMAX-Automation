Feature: Admin Portal Login Functionality 
	Verify that Admin is able to logged in  Admin Portal.

@AdminLogin 
Scenario: Verify Admin is able to login 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Admin Portal must be opened. 
	
@InvalidAdminLogin 
Scenario: Verify Admin is able to login 
	Given Google Chrome Browser has been launched for PAYMAX. 
	Then The PAYMAX Admin Portal has been opened. 
	Then PAYMAX Admin enters credentials of username and password as Admin 
	Then PAYMAX Admin clicks on Go Button, Invalid Credentials error must appears.