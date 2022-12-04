Feature: Login to OrangeHRM application

#Background:
#Given Opening the ChromeBrowser
#And Access the OrangeHrm url

@login @functional
Scenario Outline: Login to OrangeHRM application with valid login credential
Given Enter the username <username>
And Enter the password <password>
When Click the Login button
Then OrangeHRM dashboard page displayed

Examples:
|username|password|
|"Admin"|"admin123"|
|"Admin"|"admin123"|

@regression
Scenario Outline: Unable to Login to OrangeHRM application with invalid login credential
Given Enter the username 'admin'
And Enter the password 'admin1234'
When Click the Login button
But Error message displayed
