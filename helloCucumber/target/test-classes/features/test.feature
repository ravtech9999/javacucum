@regression
Feature: Google Test case

  Scenario: : Verifying Google Search Engine
    Given User is on Google Home Page
    When User searches for
      |cucumber|
      |java|
    And Click Search Button
    Then Search Results for Cucumber is available
