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
     Then The error message Please fill out this field will be displayed
     
       Examples: 
      | SheetName  | RowNumber |

      | SignInDetails |     1 | 
      | SignInDetails |     2 | 
      | SignInDetails |     3 | 
      
   Scenario Outline: Login scenario with invalid sets of data
     Given The user is on the DS Algo Sign in Page
     When The user clicks the login button after entering <RowNumber> from  "<SheetName>"
     Then The error message Invalid username and password will be displayed
        
       Examples: 
      | SheetName  | RowNumber |
      | SignInDetails |     4 | 
      | SignInDetails |     5 | 

 Scenario Outline: Login scenario with valid sets of data
     Given The user is on the DS Algo Sign in Page
     When The user clicks the login button after entering <RowNumber> from  "<SheetName>"
     Then The success message You are logged in will be displayed
       
       Examples: 
      | SheetName  | RowNumber |
      | SignInDetails |     6 | 
      