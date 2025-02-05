@LoginPage
Feature: Sign in
Background: Sign in
 Scenario: Verify that user is able to land on the Login Page
    Given The user is on the DS Algo Home Page
    When The user clicks the Sign in link
    Then The user should be redirected to the Sign in page      
      
      
Scenario Outline: Login scenario with different sets of data
     Given The user is on the DS Algo Sign in Page
     When The user clicks the login button after entering <RowNumber> from  "<SheetName>"
     Then The ExpectedMessage will be displayed
     
      Examples: 
      | SheetName     | RowNumber | 

      | SignInDetails |     2 | 
      | SignInDetails |     3 |
      | SignInDetails |     4 |
      | SignInDetails |     5 |
      | SignInDetails |     6 |
      | SignInDetails |     7 |
      
Scenario:SignOut
Given The user is in the Home page after Sign in
When The user clicks Sign out
Then The user should be redirected to home page with message Logged out successfully