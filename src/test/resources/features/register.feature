@Register
Feature: Ds Algo Register Feature
Background: Register Page
		Given The user is on the user Registration page

 
  Scenario: Verify that user is able to land on Register Page
    When 	The user clicks Register link on the Home page
    Then  The user should be redirected to Register form

	Scenario Outline: Verify that user receives error message for empty username field during registration
    When  The user clicks the Register button after entering <RowNumber> from "<SheetName>"
    Then 	The user should able to see error message
     
      Examples: 
      | SheetName|RowNumber| 
      
      | Register |   2    |
      | Register |   3    |
      | Register |   4    |
      | Register |   5    |
      | Register |   6    |
      | Register |   7    |
      | Register |   8    |
      | Register |   9    |
      | Register |   10   |
      | Register |   11   |
      
      


Scenario Outline: Verify that user is able to land on Homepage after registration with valid fields
    When The user clicks the Register button after entering <RowNumber> from "<SheetName>"
    Then The user should be redirected to Home Page of DS Algo with message New Account Created You are logged in
    
    
      Examples: 
      | SheetName|RowNumber|
       
      | Register |   12    |