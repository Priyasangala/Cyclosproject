Feature: Verify Forgot password functionality.
Scenario: As a registered user, I want to change my password.

Given user is on forgot password page
When user enters username
And user clicks on reset password button
Then user navigate to next page
