#Author
#Date
#Description
@SmokeFeature
Feature: HRMS

  Scenario: Verify Title
    Given Open Application
    When Verify Title
    Then Close Application

  @smoketest
  Scenario: LoginLogout
    Given Open Application
    When Verify Title
    When Login into application
    When Logout from application
    Then Close Application