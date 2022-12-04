Feature: Validation of the Admin Link

@smoke
Scenario: Successful validation of the admin page

#Given Opening the ChromeBrowser
#And Access the OrangeHrm url
Given Enter the username 'Admin'
And Enter the password 'admin123'
When Click the Login button
Then OrangeHRM dashboard page displayed
When Click the admin link
Then Admin page is displayed
