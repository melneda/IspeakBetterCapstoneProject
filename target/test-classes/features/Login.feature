@smoke @all
Feature: Login Feature

  Scenario: US_022 User can  Login positive testing
    Given User is on the ISpeakBetter HomePage
    When User click log in
    Then user enter username and password
    Then user log in
    Then Verify page url

  Scenario: US_023 User can Login negative testing
    Given User is on the ISpeakBetter HomePage
    When User click log in
    Then user enter wrong username and  wrong password
    Then user log in
    Then User get alert


