
Feature: HomePage Feature
  Scenario:US_012 User can click try for Free Button
    Given User is on the ISpeakBetter HomePage
    When User clicks to Try for Free
    Then Sign in window pops up


  Scenario: US_013 User can reach courses from homepage
    Given User is on the ISpeakBetter HomePage
    When User clicks on 'See our courses button
    Then User is on the Courses Provided page

  Scenario: US_014 User can reach Learn More part from homepage
    Given User is on the ISpeakBetter HomePage
    When User clicks on LearnMore
    Then User is on the LearnMore page

  Scenario: US_015 User can Select Duration Box
    Given User is on the ISpeakBetter HomePage
    When User selects duration for 30 min
   #Then User sees it on the duration selection box

  Scenario: US_016 User can Select Business English Box
    Given User is on the ISpeakBetter HomePage
    When User clicks on 'See our courses button
    When User selects program for Business English
    #Then User sees it on the program selection box

