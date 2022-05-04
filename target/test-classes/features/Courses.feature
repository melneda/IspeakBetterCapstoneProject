
Feature:Course Page Test
  Scenario:US_006 User can reach courses by clicking course page from main page
    Given User goes to main page
    When User clicks to course page
    Then User sees the course page

  Scenario:US_007 User can enter GCE(1link) by clicking EnrollNow button
    Given User goes to main page
    When User clicks to course page
    And User clicks to first Enrolment Links
    Then User sees if the link opens correct page

  Scenario:US_008 User can enter BE(2link) by clicking EnrollNow button
    Given User goes to main page
    When User clicks to course page
    And User clicks to second Enrolment Links
    Then User sees if the link opens correct page

  Scenario:US_009 User can enter CE(3link) by clicking EnrollNow button
    Given User goes to main page
    When User clicks to course page
    And User clicks to third Enrolment Links
    Then User sees if the link opens correct page

  Scenario:US_010 User can enter TOEFL(4link) by clicking EnrollNow button
    Given User goes to main page
    When User clicks to course page
    And User clicks to fourth Enrolment Links
    Then User sees if the link opens correct page

  Scenario:US_011 User can enter IELTS(5link) by clicking EnrollNow button
    Given User goes to main page
    When User clicks to course page
    And User clicks to fifth Enrolment Links
    Then User sees if the link opens correct page
