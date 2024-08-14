

Feature: Automation Exercise login funtionality
  Login user with correct email and password
  
  Background: Pre-request backgroud code for all the scenarios
  	When user enter the capabilities of the system
  	And launches the given url
  

	@SmokeTest @loginDataBase
  Scenario: Login user with correct username and password
    Given user lands on the automation exercise signup or login page
    When user enters email "nikki123@gmail.com" and password "Bashaa123"
    And user clicks on login button
    Then user is navigated to home page
    
  @RegressionTest @signUpDataBase 
  Scenario: Signup new user in the e-commerce website
    Given user lands on the automation exercise signup or login page
    When user enters name "Nikki" and email "nikki123@gmail.com"
    And user clicks on signup button
    Then user is navigated to registration page
    
    