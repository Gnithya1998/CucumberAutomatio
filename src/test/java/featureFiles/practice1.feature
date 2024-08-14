

Feature: Automation Exercise login funtionality
  Login user with correct email and password
  
  Background: Pre-request backgroud code for all the scenarios
  	Given Database is setup for testing
  	When user enter the capabilities of the system
  	And launches the given url
  

	@SmokeTest
  Scenario: Login user with correct username and password
    Given user lands on the automation exercise signup or login page
    When user enters email "nikki123@gmail.com" and password "Bashaa123"
    And user clicks on login button
    Then user is navigated to home page
    
  @SmokeTest @RegressionTest  
  Scenario Outline: Login user with correct username and password
    Given user lands on the automation exercise signup or login page
    When user enters email "<email>" and password "<password>"
    And user clicks on login button
    Then user is navigated to home page

	Examples: 
    |	email	      				|	password	|
    |	nikki123@gmail.com	| Bashaa123	|
    | asdf2134@gmail.com	|	Admin123	|
    
   @SmokeTest 
   Scenario: Signup new user in the e-commerce website
    Given user lands on the automation exercise signup or login page
    When user enters name "Nikki" and email "nikki123@gmail.com"
    And user clicks on signup button
    Then user is navigated to registration page
   
   @RegressionTest 
   Scenario: Signup new user in the e-commerce website
    Given user is navigated to registration page
    When user enters registration details
    | Bashaa123 |
    | Nikki |
    | Kalrani |
    | Adyar avenue|
    | Chennai |
  
    And user clicks on create account button
    Then user is navigated to home page
    
    