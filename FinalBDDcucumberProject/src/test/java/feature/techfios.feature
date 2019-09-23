Feature: Techfios Page 
	As a user I want to change the background color

Scenario: Valid users should be able to change background color to sky blue 
	Given SkyBlue Background button exists; 
	When I click on SkyBlue the button 
	Then the background color will change to sky blue 
	
Scenario: Valid users should be able to change background color to white 
	Given Set SkyWhite Background button exists 
	When I click on WhiteBackground the button 
	Then the background color will change to white