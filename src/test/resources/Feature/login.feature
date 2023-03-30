@SmokeFeature
Feature: Feature to Login Functionality

  @smoketest
  Scenario: Check Login with Valid Credentials
    Given User is on Login Page
    When User Enter username and password
    And Click on Login button
    Then User is navigated to the home page
   
