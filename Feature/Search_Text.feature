Feature: Searching article

Scenario: User can search a article by providing a text

Given User opens Wikipedia page
When User provides a text to search textbox
And User clicks on search button
Then Article is displayed