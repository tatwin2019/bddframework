Feature: Log in to system

Scenario: User can log in to system
	
Given User is on Wikipedia main page
When User clicks on Log In link
Then Log In page is displayed
When User types username
And User types password
And User clicks Log in button
Then User is logged and username is displayed