#Author:jagan_mu
#Keywords Summary:automation project
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
@SmokeScenario
Feature: Testing Makemytrip website

  @SmokeTest
Scenario: Booking a bustrip
  Given  User enter the Makemytrip Url
	Then User click the bus
	Then User click the text
	Then User select pickuplocation
	Then User select droplocation
	And User select the date 
	Then User click search
	Then User click filter 
	Then User click Cheapest 
	Then USer click Berth 
	Then User click continue
	Then User selectseats 
	Then User select horizontalseats
	Then User select bookseats 
  
  
  
   

  
    
