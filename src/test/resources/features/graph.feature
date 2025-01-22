#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Graph Data Structure Navigation

  Background: The user is signed in to the dsAlgo Portal
    Given The user is signed in to the dsAlgo Portal

  Scenario: Verify that the user is able to navigate to "Graph" data structure page
    Given The user is in the Home page after signing in
    When The user clicks the "Get Started" button in the Graph panel
    Then The user is directed to the "Graph" data structure page
