Feature: Login to Facbook functionality
Scenario: User able to signin with valid credentials
Given go to homepage
When user enters valid user name
And user enters a valid password
And also user able to click login button
Then user login successfully
