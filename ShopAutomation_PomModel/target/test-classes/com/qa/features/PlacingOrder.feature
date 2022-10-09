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
@tag
Feature: Placing Order

  @Order
  Scenario: Placing Order for an Item
    Given Open the Website and Click on Shop
    And Click on Add to Basket
    And Click on View Basket
    When Clicked on Proceed to Checkout page
    And Checkout Page opens with details to be filled
    Then Fill Details and Place Order
    And Order Confirmation details will be displayed
    

  