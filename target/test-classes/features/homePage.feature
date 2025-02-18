@Homepage
Feature: DS Algo Home Page

Background: DS Algo Home Page
    
Scenario: Verify that user is able to open the DSAlgo web application
    Given The user opens the browser
    When 	The user enters the correct DSAlgo portal URL 
    Then 	The user should be able to land on the DSAlgo portal

Scenario: Verify that user is able to open the DSAlgo web application
    Given The user should be able to see the portal page
    When 	The user clicks the Get Started button
    Then  The user should be able to land on the DSAlgo web application 
 
Scenario Outline: Verify the Home page for a user without Sign in
	  Given  The user is on the Home page without Sign in
	  When   The user clicks on dropdown "<option>"   
    Then 	 The user should be able to see You are not logged in message

 Examples: 
       | option	      | 
       | Arrays			  | 
       | Linked List  |    
       | Stack 			  |  
       | Queue 		  	|   
       | Tree 				|   
       | Graph 		  	| 
     
Scenario Outline: Verify the Home page for a user without Sign in
		Given The user is on the Home page without Sign in
    When The user clicks on the Get Started button of any "<option>"
    Then The user should be able to see You are not logged in message

Examples: 
       | option  | 
      
       | data-structures-introduction |      
       | array 											  |      
       | linked-list 								  |    
       | stack 											  |  
       | queue 											  |   
       | tree 											  |   
       | graph 											  |
 