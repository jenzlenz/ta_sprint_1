@regression @hotels
Feature: Verification of Hotels homepage data

  Background:
    Given I am on hotels home page

#  # JIRA ticket TA4:
  Scenario: Verify user is able to successfully search for hotels
    When I enter Milwaukee in destination and select Milwaukee, Milwuakee County, United States of America on hotels.com home screen
    When I select check in for tomorrows date
    And I select check out date 6 days later
    Then I verify the number of nights is 6
    And I select Rooms
    And I select 1 room
    And I select 2 adults
    And I select 2 children
    And I select age 2 for child 1
    And I select age 1 for child 2
    And I click on Search to get hotel results
    Then I verify search results page displays correct options chosen