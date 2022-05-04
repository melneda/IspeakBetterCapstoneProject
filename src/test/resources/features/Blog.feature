
Feature:
@parallel1
  Scenario:US_001 User can reach blog articles by clicking picture.
    Given User will be on home page
    When User will click on blog section
    And User will click to picture
    Then User will see the correct blog

    Given User will be on home page
    When User will click on blog section
    And User see title and verify Blog title


@parallel1
  Scenario:US_002 User can see English Articles by clicking #Engisharticle tag and see Articles in second page also.
    Given User will be on home page
    When User will click on blog section
    And User will click to English Article
    And User will click to second page
    Then User will see the list of English Articles
  @parallel2
  Scenario:US_003 User can reach  article by click  article title.
    Given User will be on home page
    When User will click on blog section
    And User will click to thirds article title
    Then User will see the blog
  @parallel2
  Scenario:US_004 User can reach article source from blog page.
    Given User will be on home page
    When User will click on blog section
    And User will open the blog
    And User will click the source link
    Then User will see the IELTS destination page

  @parallel2
  Scenario:US_005 User can reach articles by clicking #onlinelearning tag
    Given User will be on home page
    When User will click on blog section
    And User will click to English Article
    And User will click to Online learning tag
    Then User will see the list of Articles with the Online learning tag
