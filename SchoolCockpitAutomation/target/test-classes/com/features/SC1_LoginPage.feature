
Feature: SCPlus Login Feature


Scenario Outline: Login Test Scenario

Given user is on login page
When  user pass home page using
Then  user gets the title of the page
Then  Page Title should be "School Cockpit Application"



Examples:
	| username | password |
	| CSR005000001  | password1 |

