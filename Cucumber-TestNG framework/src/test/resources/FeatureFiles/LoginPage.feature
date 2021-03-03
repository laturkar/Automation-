Feature: SCPlus Login Feature


Scenario Outline: Login Test Scenario

Given user is already on Login Page
When user enters "<username>" and "<password>"
And user clicks on login button
Then user gets the title of the page
Then Page Titels should be "School Cockpit Application"


 
Examples:
	| username | password |
	| CSR005000001  | password1 |	 	