Feature: Application login
Scenario Outline: Valid login

Given initialize the web driver
And user navigates the url "https://login.salesforce.com/?locale=in"
And enter <username> and <passowrd> and click on login button
Then user should be able to login

Examples:
|Username||Passowrd|
|test||test123|
|test||test456|