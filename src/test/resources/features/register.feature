
@register
Feature: Ds Algo Register Feature
  


  Scenario: Verify that user is able to land on Register Page
    Given The user is on the user registration page
    When The user clicks "Register" link on the Home page
    Then The user should be redirected to Register form

Scenario Outline: Verify that user receives error message for empty username field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering <RowNumber> and <SheetName>
    Then The user should able to see error "Please fill out this field." appears below Username textbox
    
      Examples: 
      | SheetName|RowNumber| 
      | Register |   1     |
      | Register |   2     |
      | Register |   3     |
      | Register |   4     |
      | Register |   5     |
      | Register |   6     |
      | Register |   7     |
      | Register |   8     |
      | Register |   9     |
      | Register |   10    |
      | Register |   11    |
      


Scenario Outline: Verify that user is able to land on Homepage after registration with valid fields
    Given The user is on the user registration page
    When  The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes
    Then   The user should be redirected to Home Page of DS Algo with message "New Account Created. You are logged in as <ID>"
    
    
      Examples: 
      | SheetName|RowNumber| 
      | Register |   12    |