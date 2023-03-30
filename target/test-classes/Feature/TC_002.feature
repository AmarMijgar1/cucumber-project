Feature: 

  Scenario: Successful Login with Valid Credential
    Given User Launch Chrome browser
    When User Open URl
    And User Enter Email and Password
    And Click on Login
    Then To Verify Title
    When User click on Logout Link
    Then Page Title Should be--Your store. Login
    And Close browser
