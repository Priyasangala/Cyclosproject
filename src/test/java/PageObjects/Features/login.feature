#Author: sangala Bindu
Feature: verify login functionality

Scenario: As a registered user, I want to login successfully.

Given user is on login page
When user enters <username> and <password>
And user clicks on login button 
Then user navigate to dashboard


Examples:
|username|password|
|Admin|admin123|